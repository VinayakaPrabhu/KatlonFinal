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

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/input_Sign in_mat-input-0'), 
        GlobalVariable.username_admin)

    WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/input_Username_mat-input-1'), 
        GlobalVariable.username_admins_Password)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/button_Login'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/div_more_vert_hamburgerWrapper'), 
        FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/i_account_circle'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/a_assignmentRole And Task'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/i_add'))

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/input_Add Role_code'), 
        GlobalVariable.role_code)

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/input_Code_name'), 
        GlobalVariable.role_name)

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/input_Name_description'), 
        GlobalVariable.role_description)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/div_Search_mat-checkbox-inner-container'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/button_Save'))

    WebUI.verifyTextPresent('created successfully', false)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Roles_OR/Add_OR/Add_Role_new_Shouldsucceed/Add_new_role/button_Cancel'))
	WebUI.closeBrowser()

