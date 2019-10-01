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

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/i_account_circle'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/input_Employee Access_mat-input-3'), 
    GlobalVariable.employee_id)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/input_Employee Id_mat-input-4'), 
    GlobalVariable.employee_login_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/input_Login Name_mat-input-5'), 
    GlobalVariable.employee_email)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/input_Email_mat-input-6'), 
    GlobalVariable.employee_f_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/input_First Name_mat-input-7'), 
    GlobalVariable.employee_m_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/input_Middle Name_mat-input-8'), 
    GlobalVariable.employee_l_name)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/div_Search_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/button_Save'))

WebUI.verifyTextPresent('saved successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/button_Ok'))

WebUI.closeBrowser()

