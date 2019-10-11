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

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/a_account_balance_walletWallet'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/mat-cell_0001'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/i_pages'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/div_Adjust'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/div_Amount()'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/input_Recent Five Transactions_mat-input-13'), 
    GlobalVariable.cash1)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/span_Fund Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/span_Cash'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/span_Operation Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/span_Debit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/button_Submit'))

WebUI.delay(1)

WebUI.verifyTextPresent('Operation failed due to insufficient balance', false)

WebUI.deselectOptionByLabel(findTestObject(null), '', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Adjust/Adjust/button_Ok'))

WebUI.closeBrowser()

