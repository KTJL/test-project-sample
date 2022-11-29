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

WebUI.callTestCase(findTestCase('Main test cases/7 新增使用者/common-openAdduserModal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__email'), email)

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__password'), password)

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__name'), name)

WebUI.sendKeys(findTestObject('Admin/Manage_Usr/addUsrModal/input__birthday'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Admin/Manage_Usr/addUsrModal/input__birthday'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__birthday'), birthday)

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__cellphone'), phone)

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__address'), address)

WebUI.setText(findTestObject('Admin/Manage_Usr/addUsrModal/input__ID'), ID)

WebUI.click(findTestObject('Admin/Manage_Usr/addUsrModal/div__school'))

for (def index : (0..2)) {
    WebUI.verifyTextPresent(school[index], false)
}

WebUI.click(findTestObject('Admin/Manage_Usr/addUsrModal/div_role'))

for (def index : (0..3)) {
    WebUI.verifyTextPresent(role[index], false)
}

WebUI.click(findTestObject('Admin/Manage_Usr/addUsrModal/button_add'))

