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

WebUI.callTestCase(findTestCase('Main test cases/13 建立報名表單/common-openUnstartedProjectPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProgramManager/UnstartedProjectPage/button_checkscore'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/CheckScorePage/h1_checkscore_title'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/CheckScorePage/button_print'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/CheckScorePage/div__open_scorelist'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/CheckScorePage/div_score_list_forall'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/CheckScorePage/div_setup_peoplenum_scoreweight'), 0)

