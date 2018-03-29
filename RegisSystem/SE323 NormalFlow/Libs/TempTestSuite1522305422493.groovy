import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/App Test')

suiteProperties.put('name', 'App Test')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/qliphoth/Documents/GitHub/SE323_Project2/RegisSystem/SE323 NormalFlow/Reports/App Test/20180329_133702/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/App Test', suiteProperties, [new TestCaseBinding('Test Cases/StudentEnrollCourse', 'Test Cases/StudentEnrollCourse',  null), new TestCaseBinding('Test Cases/LecturerGrading', 'Test Cases/LecturerGrading',  null), new TestCaseBinding('Test Cases/StudentSeeGradeSummary', 'Test Cases/StudentSeeGradeSummary',  null), new TestCaseBinding('Test Cases/LecturerSeeCourseHistory', 'Test Cases/LecturerSeeCourseHistory',  null), new TestCaseBinding('Test Cases/StudentSearchCoursebyid', 'Test Cases/StudentSearchCoursebyid',  null), new TestCaseBinding('Test Cases/StudentWithdrawCourse', 'Test Cases/StudentWithdrawCourse',  null), new TestCaseBinding('Test Cases/StudentSeeTuitionFees', 'Test Cases/StudentSeeTuitionFees',  null), new TestCaseBinding('Test Cases/AdminCreateCourse', 'Test Cases/AdminCreateCourse',  null)])
