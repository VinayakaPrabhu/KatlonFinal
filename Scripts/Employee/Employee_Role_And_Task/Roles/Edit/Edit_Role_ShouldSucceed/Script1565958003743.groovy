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

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/div_Username'))

WebUI.setText(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/input_Sign in_mat-input-0'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/input_Username_mat-input-1'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/a_account_circleEmployee'))

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/a_assignmentRole And Task'))

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/mat-cell_1113'))

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/i_edit'))

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/mat-icon_clear'))

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/mat-icon_clear'))

WebUI.setText(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/input_Code_name'), 
    'HELLOwerd')

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/button_Save'))

WebUI.verifyTextPresent('updated successfully', false)

WebUI.click(findTestObject('Employee/Employee_Role_And_Task_OR/Roles_OR/Edit_OR/Edit_Role_ShouldSucceed/button_Cancel'))

WebUI.closeBrowser()

