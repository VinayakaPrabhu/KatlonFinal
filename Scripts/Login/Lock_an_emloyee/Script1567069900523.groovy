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

WebUI.callTestCase(findTestCase('Login/employee_login'), [:], FailureHandling.STOP_ON_FAILURE)

for (def i : (0..2)) {
    WebUI.callTestCase(findTestCase('Login/Wrong_Password_ShouldgiveError'), [:], FailureHandling.OPTIONAL)
}

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.login_url)

WebUI.setText(findTestObject('Object Repository/Login_OR/Employee_login_verify/input_Sign in_mat-input-0'), GlobalVariable.employee_login_name)

WebUI.setEncryptedText(findTestObject('Object Repository/Login_OR/Employee_login_verify/input_Username_mat-input-1'), GlobalVariable.employee_resetPassword)

WebUI.click(findTestObject('Object Repository/Login_OR/Employee_login_verify/button_Login'))

WebUI.verifyTextPresent('User account is locked', false)

WebUI.click(findTestObject('Object Repository/Login_OR/Employee_login_verify/button_OK'))

WebUI.closeBrowser()

