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

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/input_Sign in_mat-input-0'), 
    GlobalVariable.username_admin)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/input_Username_mat-input-1'), 
    GlobalVariable.username_admins_Password)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/button_Login'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/div_Task Group'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/mat-cell_TVINC'))

not_run: WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/i_edit'))

not_run: WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/mat-step-header_2Create Role'))

not_run: WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/div_Search_mat-checkbox-inner-container'))

not_run: WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/button_Save'))

not_run: WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/button_Ok'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/i_delete'))

WebUI.verifyTextPresent('Do you want to delete', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/button_Ok'))

WebUI.verifyTextPresent('deleted successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleInactive_ShouldSucceed/button_Ok'))

WebUI.closeBrowser()

