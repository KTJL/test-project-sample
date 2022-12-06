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

WebUI.click(findTestObject('ProgramManager/UnstartedProjectPage/button_createform'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/h1_title'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/svg_openbasic'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/svg_openfile'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/svg_openother'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div__starttime'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/svg_arrow'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_endtime'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/path_deltime'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/button_finishadding'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/button_addbasic'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_basic'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_file'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_other'), 0)

