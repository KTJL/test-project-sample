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

WebUI.callTestCase(findTestCase('Main test cases/22 書審評分/common-openDocReviewPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Reviewer/ReviewPage/button_Applicant_test02'))

expectName = WebUI.getText(findTestObject('Reviewer/ReviewPage/button_Applicant_test02'))

actualName = WebUI.getText(findTestObject('Reviewer/ReviewPage/th_ApplicantName'))

WebUI.verifyEqual(expectName, actualName)

WebUI.click(findTestObject('Reviewer/ReviewPage/div_checkbox'))

WS.comment('click textbox')

WebUI.verifyElementPresent(findTestObject('Reviewer/ReviewPage/textarea_reason'), 0)

WebUI.click(findTestObject('Reviewer/ReviewPage/div_checkbox'))

WebUI.verifyElementNotPresent(findTestObject('Reviewer/ReviewPage/textarea_reason'), 0)

