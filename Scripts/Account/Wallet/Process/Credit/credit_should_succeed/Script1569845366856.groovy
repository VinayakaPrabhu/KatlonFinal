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

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/mat-cell_1000010000000023'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/i_pages'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/div_Amount()'))

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/input_Recent Five Transactions_mat-input-9'), 
    GlobalVariable.cash1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/span_Fund Type'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/span_Cash'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/button_Submit'))

WebUI.verifyTextPresent('success', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit_final/button_Ok'))

WebUI.closeBrowser()

