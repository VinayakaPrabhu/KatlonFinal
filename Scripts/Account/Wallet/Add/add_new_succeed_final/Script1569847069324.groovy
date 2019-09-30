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

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/input_Sign in_mat-input-0'), GlobalVariable.username_admin)

WebUI.setEncryptedText(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/input_Username_mat-input-1'), GlobalVariable.username_admins_Password)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/button_Login'), FailureHandling.OPTIONAL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/div_more_vert_hamburgerWrapper'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/i_add'))

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/input_Add Wallet_mat-input-9'), GlobalVariable.corporate_code)

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/input_Corporate Code_mat-input-10'), GlobalVariable.property_code)

WebUI.setText(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/input_Property Code_mat-input-11'), GlobalVariable.patron_id)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/button_Save'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/div_Wallet created successfully'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Add/Ad_new_final/button_Ok'))

WebUI.closeBrowser()

