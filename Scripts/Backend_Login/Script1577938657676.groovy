import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.BackendURL)

//Sent invalid login
WebUI.setText(findTestObject('Object_Backend/input_Username is required_username'), findTestData('Login').getValue(1, 1 /*rowNum*/)) //get data from column1 & row 1
WebUI.setText(findTestObject('Object_Backend/input_Username is required_password'), findTestData('Login').getValue(2, 1 /*rowNum*/)) //get data from column2 & row 1
Thread.sleep(2000)
WebUI.click(findTestObject('Object_Backend/button_Login'))

if (WebUI.waitForElementPresent(findTestObject('Object_Backend/Invalid username and password msg'), 0, FailureHandling.STOP_ON_FAILURE)) {
	Thread.sleep(1000)
    WebUI.setText(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/input_Username is required_username'), //set Valid login
        'superadmin@manaotest.com')
    WebUI.setEncryptedText(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/input_Username is required_password'), 
        'Jm2HgL65gX5rsiork5MjpQ==')
    Thread.sleep(2000)
    WebUI.click(findTestObject('Object_Backend/button_Login'))
}

Thread.sleep(2000)
WebUI.click(findTestObject('Object_Frontend/Page_TROFACO/Page_Backend  TROFACO/a_Logout'))

WebUI.closeBrowser()

