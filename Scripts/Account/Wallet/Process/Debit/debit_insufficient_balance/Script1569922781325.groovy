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

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/mat-cell_0001'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/i_pages'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/div_Debit'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/div_Amount()'))

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/input_Recent Five Transactions_mat-input-11'), 
    GlobalVariable.cash1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/span_Fund Type'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/span_Cash'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/button_Submit'))

WebUI.verifyTextPresent('Operation failed due to insufficient balance', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Debit/debit/button_Ok'))

WebUI.closeBrowser()

