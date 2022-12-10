import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Main test cases/13 建立報名表單/common-openProgramManagerPage'), [:], FailureHandling.STOP_ON_FAILURE)

def wid = WebUI.getElementWidth(findTestObject('ProgramManager/HomePage/div_wid'))

WebUI.click(findTestObject('ProgramManager/HomePage/div__opensidebar'))

def wid2 = WebUI.getElementWidth(findTestObject('ProgramManager/HomePage/div_wid'))

WebUI.verifyNotEqual(wid, wid2)

WebUI.click(findTestObject('ProgramManager/HomePage/div__opensidebar'))

WebUI.verifyTextPresent('未開始的計畫', false)

WebUI.verifyTextPresent('進行中的計畫', false)

WebUI.verifyTextPresent('結束的計畫', false)

WebUI.verifyTextPresent('建立新計畫', false)

WebUI.click(findTestObject('ProgramManager/HomePage/div_unstart'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/HomePage/div_unstartList'), 0)

WebUI.click(findTestObject('ProgramManager/HomePage/div_unstart'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/HomePage/div_unstartList'), 0)

WebUI.click(findTestObject('ProgramManager/HomePage/div_inprogess'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/HomePage/div_inprogessList'), 0)

WebUI.click(findTestObject('ProgramManager/HomePage/div_inprogess'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/HomePage/div_inprogessList'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProgramManager/HomePage/div_ended'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/HomePage/div__endedlist'), 0)

WebUI.click(findTestObject('ProgramManager/HomePage/div_ended'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/HomePage/div__endedlist'), 0)

