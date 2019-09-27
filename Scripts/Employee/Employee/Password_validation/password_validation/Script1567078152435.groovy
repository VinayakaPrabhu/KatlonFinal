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

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/i_account_circle'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/mat-cell_1000'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/i_pages'))

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/password_validation/input_Reset Password_mat-input-3'), 
    'J7R4ejOak4Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/password_validation/input_New Password_mat-input-4'), 
    'J7R4ejOak4Y=')

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/button_Reset'))

WebUI.verifyTextPresent('least 1 uppercase', false)

WebUI.verifyTextPresent('least 5 character', false)

WebUI.verifyTextPresent('at least 1 digit', false)

WebUI.verifyTextPresent('at least 1 special', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/button_Cancel'))

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/password_validation/input_Reset Password_mat-input-3'), 
    'gswNf6P5IAt/cnlI+kVgxg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/password_validation/input_New Password_mat-input-4'), 
    'gswNf6P5IAt/cnlI+kVgxg==')

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/button_Reset'))

WebUI.verifyTextPresent('at least 1 lowercase', false)

WebUI.verifyTextPresent('more than 8 character', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/mat-dialog-actions_Cancel'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/password_validation/button_Cancel_1'))

WebUI.closeBrowser()

