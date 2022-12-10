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

println(programName)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_basicInfo_addItem'))

if (type == 'default') {
    WebUI.click(findTestObject('ProgramManager/AddNewFormPage/input__nonLimit'))
} else if (type == 'email') {
    WebUI.click(findTestObject('ProgramManager/AddNewFormPage/input__Email'))
} else if (type == 'number') {
    WebUI.click(findTestObject('ProgramManager/AddNewFormPage/input__NumberOnly'))
}

if (BI_required == 'true') {
    WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div__checkbox_Must'))
}

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/input__BI_name'), BIName)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div_file'))

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_file_addItem'))

if (file_required == 'true') {
    WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div__checkbox_Must'))
}

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/input__file_Name'), fileName)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div_other'))

if (recommand == 'true') {
    WebUI.click(findTestObject('ProgramManager/AddNewFormPage/div__checkboxRecommand'))
}

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/input__startDate'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/input__startDate'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/input__startDate'), startDate)

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/input__endDate'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ProgramManager/AddNewFormPage/input__endDate'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('ProgramManager/AddNewFormPage/input__endDate'), endDate)

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_add'))

WebUI.click(findTestObject('ProgramManager/AddNewFormPage/button_confirm'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewFormPage/div_addApplyFormModal'), 0)

if (WebUI.verifyElementNotPresent(findTestObject('ProgramManager/HomePage/div_inprogessList'), 0)) {
    WebUI.click(findTestObject('ProgramManager/HomePage/div_inprogess'))
}

if (WebUI.verifyElementPresent(findTestObject('ProgramManager/HomePage/div_unstartList'), 0)) {
    WebUI.click(findTestObject('ProgramManager/HomePage/div_unstart'))
}

WebUI.verifyTextPresent(programName, false)

