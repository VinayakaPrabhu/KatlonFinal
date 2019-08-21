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

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Sign in_mat-input-0'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Username_mat-input-1'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/a_account_circleEmployee_1'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Employee Access_mat-input-3'), 
    '9888105')

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Employee Id_mat-input-4'), 
    'AAdharuadai')

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Login Name_mat-input-5'), 
    'delete105@gov.in')

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Email_mat-input-6'), 
    'AAdharuadai')

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_First Name_mat-input-7'), 
    'Uadai')

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/input_Middle Name_mat-input-8'), 
    'Gov')

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/button_Proceed'))

WebUI.waitForElementVisible(findTestObject('Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/div_Search_mat-checkbox-inner-container'), 
    1)

WebUI.check(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/div_Search_mat-checkbox-inner-container'))

WebUI.waitForElementVisible(findTestObject('Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/button_Save'), 
    1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/button_Save'))

WebUI.verifyTextPresent('saved successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Add Employee_OR/Add_new_Employee_ShouldSucceed/Page_Unified Wallet/button_Ok'))

WebUI.closeBrowser()

