import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.java.en.Given
import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SearchPlantingSiteSteps {

	@Given ("User enters search (.*) in textbox")
	def SearchSiteName(String sitename) {
		WebUI.navigateToUrl('http://trofaco-dev.manaoweb.company.manaosoftware.com/')
		WebUI.setText(findTestObject('Object Repository/Object_Frontend/Page_TROFACO/Page_TROFACO/Page_TROFACO/input_OR_form-control form-control-lg ng-un_30f436'),
				sitename)
	}

	@When("Click on search button")
	def ClickSearchButton() {
		WebUI.click(findTestObject('Object Repository/Object_Frontend/Page_TROFACO/Page_TROFACO/Page_TROFACO/button_OR_btn btn-primary'))
	}

	@Then("user is navigate to search result with map page")
	def verifyNevigateToSearchResultWithMapPage() {
		def devUrl = 'http://trofaco-dev.manaoweb.company.manaosoftware.com/'
		if (GlobalVariable.FrontendURL == devUrl) {
			WS.verifyElementPropertyValue(response, 'data[43].title', 'PS 14')
		} else {
			WS.verifyElementPropertyValue(response, 'data[57].title', 'Krang Lao School')
		}
		println "\n Search result success and correct"
	}
}