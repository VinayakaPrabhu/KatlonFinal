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
import internal.GlobalVariable as GV

WebUI.callTestCase(findTestCase('Login/AdminLogin_ShouldSucceed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/div_more_vert_hamburgerWrapper'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/i_add'))

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/input_Add Wallet_mat-input-9'), 
    GlobalVariable.corporate_code)

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/input_Corporate Code_mat-input-10'), 
    GlobalVariable.property_code)

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/input_Property Code_mat-input-11'), 
    GlobalVariable.patron_id)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/button_Save'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/div_Patron ID already exists'))

WebUI.verifyTextPresent('Patron ID already exists', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Add_existing_should_fail/button_OK'))

WebUI.closeBrowser()

