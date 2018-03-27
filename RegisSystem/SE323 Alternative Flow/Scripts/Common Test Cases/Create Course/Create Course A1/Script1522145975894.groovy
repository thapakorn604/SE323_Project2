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

WebUI.navigateToUrl('https://se323project1-regis-mockup.firebaseapp.com/admin/addcourse')

WebUI.click(findTestObject('Create Course A1/input'))

WebUI.click(findTestObject('Create Course A1/input'))

WebUI.setText(findTestObject('Create Course A1/input_input'), '3')

WebUI.setText(findTestObject('Create Course A1/input_input_1'), '150')

WebUI.setText(findTestObject('Create Course A1/input_input_2'), 'Lect.Krit Sriphomsett, Lect.Prakarn Unachak')

WebUI.setText(findTestObject('Create Course A1/input_input_3'), 'Physics:Scince that change the world')

WebUI.setText(findTestObject('Create Course A1/input_input_4'), '207110')

WebUI.click(findTestObject('Create Course A1/button_Submit'))

WebUI.dismissAlert()

WebUI.closeBrowser()

