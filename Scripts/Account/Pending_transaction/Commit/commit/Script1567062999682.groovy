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

WS.sendRequest(findTestObject('Rest_api/Account/Pending_Transaction/Reserve_money_for_patron'))

WebUI.callTestCase(findTestCase('Login/AdminLogin_ShouldSucceed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/span_Pending Transactions'))

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/mat-cell_0001'))

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/i_pages'))

WebUI.setText(findTestObject('Object Repository/Account/Transaction/Void/input_Transaction Id 10000212 will be committed Do you want to proceed_mat-input-9'), 
    'ABC')

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/button_Yes'))

WebUI.verifyTextPresent('Transaction is committed successfully', false)

WebUI.click(findTestObject('Object Repository/Account/Transaction/Void/button_Cancel'))

WebUI.closeBrowser()

