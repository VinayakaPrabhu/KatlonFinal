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

try{
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.login_url)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Sign in_mat-input-0'), 
    GlobalVariable.username_admins_Password)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Username_mat-input-1'), 
    GlobalVariable.username_admins_Password)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/a_account_circleEmployee_1'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/mat-cell_0001'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/i_pages'))

WebUI.verifyTextPresent('Reset Password', false)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Reset Password_mat-input-3'), 
    GlobalVariable.password_reset)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_New Password_mat-input-4'), 
    GlobalVariable.password_reset)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Reset'))

WebUI.verifyTextPresent('Password reset successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/i_person'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Sign in_mat-input-5'), 
    'delete')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Username_mat-input-6'), 
    GlobalVariable.password_reset)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_First login after user account creationpassword reset Please change the password_mat-input-7'), 
    GlobalVariable.password_reset)

WebUI.verifyTextPresent('Please change the password.', false)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Old Password_mat-input-8'), 
    GlobalVariable.password_new)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_New Password_mat-input-9'), 
    GlobalVariable.password_new)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Change'))

WebUI.verifyTextPresent('Password changed successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Ok'))

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/input_Username_mat-input-6'), 
    GlobalVariable.password_new)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Reset_Password_Of_Employee_OR/button_Login'))

}
catch (Exception e) {
}
finally {
	WebUI.closeBrowser()
}


