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

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/a_account_circleEmployee'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/a_assignmentRole And Task'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/input_Add Role_code'), 
    GlobalVariable.role_code)

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/input_Code_name'), 
    GlobalVariable.role_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/input_Name_description'), 
    GlobalVariable.role_description)

WebUI.delay(1)

WebUI.check(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/div_Search_mat-checkbox-inner-container'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/button_Save'))

WebUI.delay(1)

WebUI.verifyTextPresent('Role code already exists ', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_existing_ShouldgiveerrorMessage/button_Cancel'))

WebUI.closeBrowser()

