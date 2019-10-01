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

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/mat-cell_0001'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/i_edit'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/div_Active'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/span_Close'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/button_Save'))

WebUI.verifyTextPresent('Do you want to change the Wallet status to CLOSED. Do you want to proceed?', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/button_Ok'))

WebUI.verifyTextPresent('Wallet updated successfully', false)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Edit/Close/close/button_OK (1)'))

WebUI.closeBrowser()

