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

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/a_assignmentRole And Task'))

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/div_Task Group'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/p_CODE-1118'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/i_delete'))

WebUI.delay(1)

WebUI.verifyTextPresent('Do you want to delete', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/button_Ok'))

WebUI.delay(1)

WebUI.verifyTextPresent('Cannot delete a task group associated with an active role', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee_Role_And_Task_OR/Task Group_OR/Delete_OR/Delete_RoleActive_ShouldGiveErrorMessage/button_OK (1)'))

WebUI.closeBrowser()

