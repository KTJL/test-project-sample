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

WebUI.callTestCase(findTestCase('Main test cases/13 建立報名表單/common-openAddNewFormPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_addbasic'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewFormPage/button_addbasic'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_basicobject'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div__nolimit'))

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/div__basicname'), '測試testbasic01')

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/svg_openfile'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewFormPage/div_basicobject'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/button_addfile'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_addfile'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewFormPage/button_addfile'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_fileobject'), 0)

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/div__filename'), '測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試testfile01測試')

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/svg_openother'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewFormPage/div_fileobject'), 0)

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewFormPage/div_recommendletter'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div__recommendletter_yesorno'))

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div__starttime'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/div__starttime'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/div__starttime'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/div__starttime'), starttime)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div_endtime'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/div_endtime'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/div_endtime'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/div_endtime'), endtime)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_finishadding'), FailureHandling.STOP_ON_FAILURE)

