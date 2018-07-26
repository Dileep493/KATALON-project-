import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LOGIN/Test Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/b_Dashboard (1)'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/b_Directory (1)'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/b_Leave (1)'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/b_PIM (1)'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/b_Recruitment (1)'), 10)

WebUI.click(findTestObject('Page_OrangeHRM/b_PIM'))

WebUI.mouseOver(findTestObject('Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__search'))

WebUI.click(findTestObject('Page_OrangeHRM/a_Raj'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_btnSave'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_-- Select --AfghanAlban'), '15', true)

WebUI.getText(findTestObject('Page_OrangeHRM/select_-- Select --AfghanAlban'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__search'))

