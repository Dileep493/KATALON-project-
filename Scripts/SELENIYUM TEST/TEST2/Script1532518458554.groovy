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

WebUI.callTestCase(findTestCase('SELENIYUM TEST/TEST1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://www.seleniumeasy.com/test/')

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/i_tree-indicator glyphicon gly (1)'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/a_Bootstrap Date Picker'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/i_glyphicon glyphicon-th'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/td_26'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/td_25'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/th_'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Easy - Best Demo webs/td_6'))

