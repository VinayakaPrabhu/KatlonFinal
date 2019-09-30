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

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/input_Sign in_mat-input-0'), GlobalVariable.username_admin)

WebUI.setEncryptedText(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/input_Username_mat-input-1'), 
    GlobalVariable.username_admins_Password)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/div_more_vert_hamburgerWrapper'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/mat-cell_1000010000000023'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/i_pages'))

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/input_Recent Five Transactions_mat-input-9'), 
    GlobalVariable.cash1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/span_Fund Type'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/span_Cash'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/button_Submit'))

WebUI.verifyTextPresent('Transaction credited successfully', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Credit/credit/button_Ok'))

WebUI.closeBrowser()

