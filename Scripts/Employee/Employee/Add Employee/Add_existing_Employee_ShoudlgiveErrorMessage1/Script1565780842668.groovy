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

WebUI.waitForElementVisible(findTestObject('Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/i_account_circle'), 
    2)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/i_account_circle'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/input_Employee Access_mat-input-3'), 
    GlobalVariable.employee_id)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/input_Employee Id_mat-input-4'), 
    GlobalVariable.employee_login_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/input_Login Name_mat-input-5'), 
    GlobalVariable.employee_email)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/input_Email_mat-input-6'), 
    GlobalVariable.employee_f_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/input_Middle Name_mat-input-8'), 
    GlobalVariable.employee_m_name)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/button_Proceed'))

WebUI.waitForElementVisible(findTestObject('Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/div_Search_mat-checkbox-inner-container'), 
    2)

WebUI.check(findTestObject('Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/div_Search_mat-checkbox-inner-container'))

WebUI.waitForElementVisible(findTestObject('Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/button_Save'), 
    2)

WebUI.click(findTestObject('Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/button_Save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/button_OK'), 
    2)

WebUI.verifyTextPresent('Employee ID already exists ', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/button_OK'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_Existing_Employee_ShouldgiveErrorMessage1/Page_Unified Wallet/button_Cancel'))

WebUI.closeBrowser()

