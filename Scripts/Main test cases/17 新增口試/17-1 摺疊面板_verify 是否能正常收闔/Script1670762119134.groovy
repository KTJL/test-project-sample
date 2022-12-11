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

WebUI.callTestCase(findTestCase('Main test cases/17 新增口試/common-openAddOral'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_chooseReviewer'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewOralPage/div_chooseReviewerList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_chooseReviewer'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewOralPage/div_chooseReviewerList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_scoreItem'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewOralPage/div_scoreitemList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_scoreItem'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewOralPage/div_scoreitemList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_AssignPeople'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewOralPage/div_AssignPeopleList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_AssignPeople'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewOralPage/div_AssignPeopleList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_AssignOrder'))

WebUI.verifyElementPresent(findTestObject('ProgramManager/AddNewOralPage/div_AssignOrderList'), 0)

WebUI.click(findTestObject('ProgramManager/AddNewOralPage/div_AssignOrder'))

WebUI.verifyElementNotPresent(findTestObject('ProgramManager/AddNewOralPage/div_AssignOrderList'), 0)

