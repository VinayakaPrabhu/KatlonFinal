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

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/a_account_balance_walletWallet'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/mat-cell_ACTIVE'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/i_edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/div_Active'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/span_Lock'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/button_Save'))

WebUI.delay(1)

WebUI.verifyTextPresent('Do you want to change the Wallet status to LOCKED. Do you want to proceed', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/button_Ok'))

WebUI.delay(1)

WebUI.verifyTextPresent('Wallet updated successfully', false)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/lock/button_Ok'))

WebUI.closeBrowser()

