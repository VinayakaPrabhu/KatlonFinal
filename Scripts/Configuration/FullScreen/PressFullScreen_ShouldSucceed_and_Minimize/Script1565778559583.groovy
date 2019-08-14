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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://10.2.200.25:8441/login')

WebUI.setText(findTestObject('Object Repository/Configuration_OR/FullScreen_OR/PressFullScreen_ShouldSucceed_and_Minimize/Page_Unified Wallet/input_Sign in_mat-input-0'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Configuration_OR/FullScreen_OR/PressFullScreen_ShouldSucceed_and_Minimize/Page_Unified Wallet/input_Username_mat-input-1'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Object Repository/Configuration_OR/FullScreen_OR/PressFullScreen_ShouldSucceed_and_Minimize/Page_Unified Wallet/button_Login'))

WebUI.click(findTestObject('Object Repository/Configuration_OR/FullScreen_OR/PressFullScreen_ShouldSucceed_and_Minimize/Page_Unified Wallet/i_fullscreen'))

Thread.sleep(10)

WebUI.click(findTestObject('Object Repository/Configuration_OR/FullScreen_OR/PressFullScreen_ShouldSucceed_and_Minimize/Page_Unified Wallet/i_fullscreen'))

WebUI.closeBrowser()

