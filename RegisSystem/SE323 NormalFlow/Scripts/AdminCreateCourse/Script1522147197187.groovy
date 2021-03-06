import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://se323project1-regis-mockup.firebaseapp.com/admin/index')

WebUI.click(findTestObject('AdminCreateCourse/a_Add Course'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://se323project1-regis-mockup.firebaseapp.com/admin/addcourse', false)

WebUI.setText(findTestObject('AdminCreateCourse/input_input'), '953234')

WebUI.setText(findTestObject('AdminCreateCourse/input_input_1'), 'Computer Programming')

WebUI.setText(findTestObject('AdminCreateCourse/input_input_2'), 'Thanawat Lukuan')

WebUI.setText(findTestObject('AdminCreateCourse/input_input_3'), '50')

WebUI.setText(findTestObject('AdminCreateCourse/input_input_4'), '3')

WebUI.click(findTestObject('AdminCreateCourse/input'))

WebUI.selectOptionByValue(findTestObject('Page_React App/select_125602256032560Only 122'), '2/2560', true)

WebUI.click(findTestObject('AdminCreateCourse/button_Submit'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.closeBrowser()

