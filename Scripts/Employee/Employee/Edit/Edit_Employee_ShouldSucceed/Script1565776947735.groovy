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

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/div_Username'))

WebUI.setText(findTestObject('Object Repository/Employee/Employee/Edit_OR/input_Sign in_mat-input-0'), GlobalVariable.username_admin)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee/Employee/Edit_OR/input_Username_mat-input-1'), GlobalVariable.username_admins_Password)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/div_more_vert_hamburgerWrapper'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/i_account_circle'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/a_account_circleEmployee'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/mat-cell_1000'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/i_edit'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/div_Search_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/div_RVINN'))

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/button_Save'))

WebUI.verifyTextPresent('will be updated. Do you want to proceed?', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/button_Ok'))

WebUI.verifyTextPresent('updated successfully', false)

WebUI.click(findTestObject('Object Repository/Employee/Employee/Edit_OR/button_OK (1)'))

WebUI.closeBrowser()

