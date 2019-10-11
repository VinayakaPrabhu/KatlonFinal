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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Account/Wallet/Fetch_account_no'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/AdminLogin_ShouldSucceed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/a_compare_arrowsTransactions'))

println('vlaue :...................... ' + GlobalVariable.Account_n)

WebUI.delay(1)

WebUI.setText(findTestObject('Account/Transaction/Vodi_transaction/input_Search_mat-input-2'), '1000010000000015')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/mat-cell_0001'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/i_pages'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/input_Transaction Id 1000011 will be voided Do you want to proceed_mat-input-9'), 
    GlobalVariable.Comment)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/button_Yes'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/div_Transaction is voided successfully'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Vodi_transaction/button_Cancel'))

WebUI.closeBrowser()

