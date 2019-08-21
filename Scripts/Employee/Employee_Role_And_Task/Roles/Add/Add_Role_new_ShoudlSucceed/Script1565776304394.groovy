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

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/input_Sign in_mat-input-0'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/input_Username_mat-input-1'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/input_Add Role_code'), 
    '1112')

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/input_Code_name'), 
    'HelloWorld')

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/input_Name_description'), 
    'Helloworld')

WebUI.check(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/div_Search_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/button_Save'))

WebUI.verifyTextPresent('created successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/button_Cancel'))

WebUI.closeBrowser()

