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

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/mat-cell_1000010000000023'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/i_pages'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/div_Adjust'))

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Process/Adjust/input_Recent Five Transactions_mat-input-13'), 
    GlobalVariable.cash_adjust)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/span_Fund Type'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/span_Cash'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/span_Operation Type'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/span_Credit'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/button_Submit'))

WebUI.verifyTextPresent('successfully', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/button_Ok'))

WebUI.closeBrowser()

