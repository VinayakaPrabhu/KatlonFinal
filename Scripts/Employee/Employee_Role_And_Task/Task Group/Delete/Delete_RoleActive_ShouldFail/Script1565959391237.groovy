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

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/input_Sign in_mat-input-0'), 
    GlobalVariable.username_admin)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/input_Username_mat-input-1'), 
    GlobalVariable.username_admins_Password)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/div_Task Group'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/p_CODE-1118'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/i_delete'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/div_Do you want to delete CODEZXYZ Task Group'))

WebUI.verifyTextPresent('Do you want to delete', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/button_Ok'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/div_Cannot delete a task group associated with an active role'))

WebUI.verifyTextPresent('Cannot delete a task group associated with an active role', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/button_OK (1)'))

WebUI.closeBrowser()

