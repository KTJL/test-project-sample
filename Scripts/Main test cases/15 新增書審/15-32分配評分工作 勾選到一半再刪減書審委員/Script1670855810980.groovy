import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Main test cases/15 新增書審/common-openAddDoc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/button_chooseReviewer_allselect'))

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/div_confirmApplicant'))

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/button_chooseReviewer_allselect'))

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/div_assignReviewer'))

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String ExpectedValue = 'testReviewer01'

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop: for (int row = 1; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    'Loop will execute till the last cell of that specific row'
    for (int column = 1; column < columns_count; column++) {
        'It will retrieve text from each cell'
        println(Columns_row.get(column).getText())

        Columns_row.get(column).findElement(By.xpath(((('//tr[' + (row + 1)) + ']/td[') + (column + 1)) + ']/div[@class=\'n-checkbox\']')).click()
    }
}

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/div_choose_docreviewer'))

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/div__checkboxReviewer'))

WebUI.click(findTestObject('ProgramManager/AddNewDocPage/div_assignReviewer'))

WebUI.verifyTextNotPresent('testReviewer01', false)

