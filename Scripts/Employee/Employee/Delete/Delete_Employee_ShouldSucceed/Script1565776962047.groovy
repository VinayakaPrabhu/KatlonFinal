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

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/a_account_circleEmployee'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/a_account_circleEmployee_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/mat-cell_0001'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/i_delete'))

WebUI.delay(1)

WebUI.verifyTextPresent('will be deleted. Do you want to proceed?', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/button_Ok'))

WebUI.delay(1)

WebUI.verifyTextPresent('deleted successfully', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Delete_OR/Delete_Employee_ShouldSucceed/Page_Unified Wallet/button_Ok'))

WebUI.closeBrowser()

