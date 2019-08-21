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

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/input_Sign in_mat-input-0'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/input_Username_mat-input-1'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/div_Task Group'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/i_add'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/input_Create Role_code'), 
    'CODE-850')

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/input_OrganizationCode_name'), 
    'TGROUP')

WebUI.setText(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/input_Name_description'), 
    'HELLO')

WebUI.check(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/div_Search_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/button_Proceed'))

WebUI.check(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/div_Search_mat-checkbox-inner-container_1'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/button_Save'))

WebUI.verifyTextPresent('Task code already exists', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/button_OK'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Add_OR/Add_Role_Existing_ShouldgiveErorMessage/button_Cancel'))

WebUI.closeBrowser()

