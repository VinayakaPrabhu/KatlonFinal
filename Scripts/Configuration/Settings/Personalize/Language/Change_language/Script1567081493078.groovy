import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/AdminLogin_ShouldSucceed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.dashboard_url)

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/i_settings'))

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/div_English'))

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/div_About_cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing'))

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/div_EnglishSelect Language'))

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/span_Spanish'))

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/span_ES-Language'))

WebUI.click(findTestObject('Object Repository/Conf/Settings_OR/Personalize/Language/div_ES-LanguageSpanishES-Select Language'))

WebUI.closeBrowser()

