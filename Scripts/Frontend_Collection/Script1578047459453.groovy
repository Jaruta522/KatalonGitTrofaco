import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.FrontendURL)

WebUI.setText(findTestObject('Object Repository/Object_Frontend/Page_TROFACO/input_OR_form-control form-control-lg ng-un_30f436'), 
    GlobalVariable.SearchKey)

WebUI.sendKeys(findTestObject('Object Repository/Object_Frontend/Page_TROFACO/input_OR_form-control form-control-lg ng-un_30f436'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object_Frontend/Page_TROFACO/Click_MapInfo_GotoDetailsPage'))

WebUI.click(findTestObject('Object_Frontend/Page_TROFACO/FirstCollection'))

WebUI.click(findTestObject('Object_Frontend/Page_TROFACO/BackIcon_On7030Page'))

WebUI.closeBrowser()

