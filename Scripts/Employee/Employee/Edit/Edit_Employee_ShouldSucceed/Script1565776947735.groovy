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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://10.2.200.25:8441/login')

WebUI.setText(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/input_Sign in_mat-input-0'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/input_Username_mat-input-1'), 
    '4aUHZLRHJF4=')

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/button_Login'))

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/i_account_circle'))

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/a_account_circleEmployee'))

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/mat-cell_213'))

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/i_edit'))

WebUI.setText(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/input_First Name_mat-input-7'), 
    'GNBC')

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/button_Proceed'))

WebUI.waitForElementVisible(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/button_Save'), 2)

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/button_Save'))

WebUI.verifyTextPresent('will be updated. Do you want to proceed?', false)

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/button_Ok'))

WebUI.verifyTextPresent(' updated successfully', false)

WebUI.click(findTestObject('Employee/Employee/Edit_OR/Page_Unified Wallet/button_OK (1)'))

WebUI.closeBrowser()

