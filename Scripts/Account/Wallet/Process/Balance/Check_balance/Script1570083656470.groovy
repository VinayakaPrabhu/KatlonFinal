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
import java.lang.Integer

response = WS.sendRequest(findTestObject('Rest_api/Get_wallet_for_patron'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def value1 = result.fundBalances[0].value

GlobalVariable.balance = value1

println('vlaue :...................... ' + GlobalVariable.balance)

WebUI.callTestCase(findTestCase('Login/AdminLogin_ShouldSucceed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/div_more_vert_hamburgerWrapper'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/a_workAccount'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/a_account_balance_walletWallet'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/mat-cell_0001'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/i_pages'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/div_Balance()'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/mat-cell_000'))

WebUI.getText(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/mat-cell_000'))

WebUI.click(findTestObject('Object Repository/Account/Wallet/Process/Balance/Check_Balance/button_Cancel'))

WebUI.closeBrowser()

