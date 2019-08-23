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

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.login_url)

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/input_Sign in_mat-input-0'), 
        GlobalVariable.username_admin)

    WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/input_Username_mat-input-1'), 
        GlobalVariable.username_admins_Password)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/button_Login'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/div_more_vert_hamburgerWrapper'), 
        FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/a_account_circleEmployee'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/a_assignmentRole And Task'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/div_Task Group'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/i_add'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/div_Code'))

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/input_Create Role_code'), 
        GlobalVariable.taskgroup_code)

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/input_OrganizationCode_name'), 
        GlobalVariable.taskgroup_name)

    WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/input_Name_description'), 
        GlobalVariable.taskgroup_description)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/div_Search_mat-checkbox-inner-container'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/button_Proceed'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/div_Search_mat-checkbox-inner-container_1'))

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/button_Save'))

    WebUI.verifyTextPresent('created successfully', false)

    WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_role_new_ShouldSucceed/button_Ok'))
}
catch (Exception e) {
} 
finally { 
    WebUI.closeBrowser()
}

