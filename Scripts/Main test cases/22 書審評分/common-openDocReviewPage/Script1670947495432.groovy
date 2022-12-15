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

WebUI.callTestCase(findTestCase('常用case/common-openReviewerPage'), [:], FailureHandling.STOP_ON_FAILURE)

program_name = WebUI.getText(findTestObject('Reviewer/homepage/button_program'))

WebUI.click(findTestObject('Reviewer/homepage/button_program'))

WebUI.delay(2)

WebUI.verifyTextPresent(program_name, false)

WebUI.verifyElementPresent(findTestObject('Reviewer/programPage/div_programbox'), 0)

WebUI.click(findTestObject('Reviewer/programPage/button_DocReview'))

WebUI.verifyElementPresent(findTestObject('Reviewer/ReviewPage/button_scoreResult'), 0)

WebUI.verifyElementPresent(findTestObject('Reviewer/ReviewPage/div__justify-center'), 0)

WebUI.verifyElementPresent(findTestObject('Reviewer/ReviewPage/div_applicantList'), 0)

