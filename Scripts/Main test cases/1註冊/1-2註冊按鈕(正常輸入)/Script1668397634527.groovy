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

WebUI.callTestCase(findTestCase('Main test cases/1註冊/common-openRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register_Page/input__email'), email)

WebUI.setText(findTestObject('Register_Page/input__password'), password)

WebUI.setText(findTestObject('Register_Page/input__pswdConfirm'), password)

WebUI.setText(findTestObject('Register_Page/input__name'), name)

WebUI.sendKeys(findTestObject('Register_Page/input__birthday'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Register_Page/input__birthday'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Register_Page/input__birthday'), birthday)

WebUI.setText(findTestObject('Register_Page/input__cellphone'), phone)

WebUI.setText(findTestObject('Register_Page/input__address'), address)

WebUI.setText(findTestObject('Register_Page/input__ID'), ID)

WebUI.click(findTestObject('Register_Page/div__school'))

for (def index : (0..3)) {
    WebUI.verifyTextPresent(school[index], false)
}

WebUI.comment('select an option')

WebUI.delay(5)

WebUI.click(findTestObject('Register_Page/button_registerConfirm'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Login_Page/div_loginbox'), 0)

WebUI.verifyElementPresent(findTestObject('Login_Page/div_guidebar'), 0)

