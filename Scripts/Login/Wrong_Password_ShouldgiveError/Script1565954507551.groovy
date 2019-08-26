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

    not_run: WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Object Repository/Login_OR/Wrong_Password_ShouldgiveError/input_Sign in_mat-input-0'), 
        GlobalVariable.username_admin)

    WebUI.setEncryptedText(findTestObject('Object Repository/Login_OR/Wrong_Password_ShouldgiveError/input_Username_mat-input-1'), 
        GlobalVariable.wrong_password)

    WebUI.click(findTestObject('Object Repository/Login_OR/Wrong_Password_ShouldgiveError/button_Login'))

    WebUI.verifyTextPresent(' Invalid password ', false)

    WebUI.click(findTestObject('Object Repository/Login_OR/Wrong_Password_ShouldgiveError/button_OK'))
	WebUI.closeBrowser()