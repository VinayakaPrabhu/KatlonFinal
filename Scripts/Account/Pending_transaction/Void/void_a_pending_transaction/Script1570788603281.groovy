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

WS.sendRequest(findTestObject('Rest_api/Account/Pending_Transaction/Reserve_money_for_patron'))

WebUI.callTestCase(findTestCase('Login/AdminLogin_ShouldSucceed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/span_Pending Transactions'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/mat-cell_0001'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/Wallet/Pending_transaction/void_a_transaction/i_pages'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/input_Transaction Id 1000025 will be voided Do you want to proceed_mat-input-9'), 
    GlobalVariable.Comment)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/button_Yes'))

WebUI.delay(1)

WebUI.verifyTextPresent('Transaction is voided successfully', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Pending_transaction/void_a_transaction/button_Cancel'))

WebUI.closeBrowser()

