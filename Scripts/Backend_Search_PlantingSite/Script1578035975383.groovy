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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser(GlobalVariable.BackendURL)

WebUI.setText(findTestObject('Object_Backend/input_Username is required_username'), 'superadmin@manaotest.com')

WebUI.setEncryptedText(findTestObject('Object_Backend/input_Username is required_password'), 'Jm2HgL65gX5rsiork5MjpQ==')

Thread.sleep(1000)

WebUI.click(findTestObject('Object_Backend/button_Login'))

WebUI.setText(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/input_Total planted trees 10514729_search'), 
    GlobalVariable.SearchKey)

WebUI.sendKeys(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/input_Total planted trees 10514729_search'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(GlobalVariable.SearchResult_NameOfSite)

WebUI.click(GlobalVariable.SearchResult_NameOfSite)

def SearchValue = 'Krang Lao SCHOOL'//GlobalVariable.SearchKey

getNameValue = WebUI.getAttribute(findTestObject('Object_Backend/Page_Backend  TROFACO/General_Info_Name_of_PlantingSite'), 
    'value')

/*WebUI.comment('---SearchValue: ' + SearchValue.toString())
WebUI.comment('---GetTextboxValue :' + getNameValue.toString())
Thread.sleep(2000)*/
//SearchValueSend = SearchValue.toString().toUpperCase()

WebUI.verifyMatch(SearchValue.toString(), getNameValue, false, FailureHandling.OPTIONAL.toString().CASE_INSENSITIVE_ORDER)

//WebUI.comment(SearchValueSend.toString() + '==' + getNameValue.toString())
WebUI.click(findTestObject('Object Repository/Object_Backend/Page_Backend  TROFACO/button_Cancel'))

WebUI.closeBrowser()

