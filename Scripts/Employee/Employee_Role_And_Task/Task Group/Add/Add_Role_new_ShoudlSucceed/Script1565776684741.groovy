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

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/i_account_circle'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/div_Task Group'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/div_Task Group_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/input_Create Role_code'), 
    GlobalVariable.taskgroup_code)

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/input_OrganizationCode_name'), 
    GlobalVariable.taskgroup_name)

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/input_Name_description'), 
    GlobalVariable.taskgroup_description)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/div_Search_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/button_Proceed'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/div_Search_mat-checkbox-inner-container_1'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/button_Save'))

WebUI.verifyTextPresent('', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_new_shouldSucceed/Add_new_Tgroup/button_Ok'))

WebUI.closeBrowser()

