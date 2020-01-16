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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

response1 = WS.sendRequestAndVerify(findTestObject('Object_API/Create_Customer_Backend', [('CustomerName') : GlobalVariable.CustomerName
            , ('CustomerId') : GlobalVariable.CustomerCode, ('CustomerType') : GlobalVariable.CustomerTypeCreated]))

WebUI.comment((('CustomerCode: ' + GlobalVariable.CustomerCode.toString()) + ' has been created as ') + GlobalVariable.CustomerName.toString())

def jsonSlurper = new JsonSlurper()

def result = jsonSlurper.parseText(response1.getResponseBodyContent( //Parse Values to use in Update case
        ))

//WebUI.comment('printIn create cust: ' + result.toString())
def CustId = result.data

GlobalVariable.CustIdForUpdate = CustId

WS.sendRequestAndVerify(findTestObject('Object_API/Update_Customer_Backend', [('CustomerId') : GlobalVariable.CustIdForUpdate
            , ('CustomerCode') : GlobalVariable.CustomerCode, ('CustomerNameChanged') : GlobalVariable.CustomerNameChanged]))

WebUI.comment((GlobalVariable.CustomerName.toString() + ' has been updated to ') + GlobalVariable.CustomerNameChanged.toString())

WS.sendRequestAndVerify(findTestObject('Object_API/Delete_Customer_Backend', [('customerId') : GlobalVariable.CustIdForUpdate]))
WebUI.comment( GlobalVariable.CustomerCode.toString() + ' ' + GlobalVariable.CustomerNameChanged.toString() + ' has been deleted')
