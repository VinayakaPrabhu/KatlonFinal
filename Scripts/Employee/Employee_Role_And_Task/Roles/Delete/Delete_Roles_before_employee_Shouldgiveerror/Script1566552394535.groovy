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

WebUI.navigateToUrl(GlobalVariable.login_url)

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/input_Sign in_mat-input-0'), 
    GlobalVariable.username_admin)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/input_Username_mat-input-1'), 
    GlobalVariable.username_admins_Password)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/mat-cell_RVINC'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/i_delete'))

WebUI.verifyTextPresent('Do you want to delete RVINN Role?', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/button_Ok'))

WebUI.verifyTextPresent('Cannot delete a role associated with employees', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Delete_OR/Delete_role_before_employee_shouldgiveerror_OR/button_OK (1)'))

WebUI.closeBrowser()


