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

WebUI.click(findTestObject('ProgramManager/UnstartedProjectPage/button_createdoc'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/h1_createdoc_title'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/button_doc_adding_finished'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/div_assign_work'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/div_check_applicant'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/div_choose_docreviewer'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/div_choose_docreviewer_panel'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewDocPage/div_docscore_item'), 0)

