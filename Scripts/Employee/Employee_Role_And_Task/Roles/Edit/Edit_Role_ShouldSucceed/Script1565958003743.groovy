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

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/a_assignmentRole And Task'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/mat-cell_RVINC'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/i_edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/div_Search_mat-checkbox-inner-container'))

WebUI.delay(1)

WebUI.check(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/mat-pseudo-checkbox_Selected 0_mat-pseudo-checkbox'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/button_Save'))

WebUI.delay(1)

WebUI.verifyTextPresent('updated successfully', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/edit_role/button_Cancel'))

WebUI.closeBrowser()

