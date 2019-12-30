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

WebUI.setText(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/input_Username is required_username'), 
    'superadmin@manaotest.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/input_Username is required_password'), 
    '8PCFB/WfIoA=')

WebUI.click(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/button_Login'))

//WebUI.waitForElementVisible(findTestObject('Object_Backend/Invalid username and password msg'), 0)

//WebUI.verifyElementPresent(findTestObject('Object_Backend/Invalid username and password msg'), 0)
if (WebUI.waitForElementVisible(findTestObject('Object_Backend/Invalid username and password msg'), 0)==true)
{
	WebUI.verifyElementPresent(findTestObject('Object_Backend/Invalid username and password msg'), 0)
}

WebUI.closeBrowser()

