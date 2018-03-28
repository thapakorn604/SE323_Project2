import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/2r/xqsmcqjj0t947c0q7k823p600000gn/T/Katalon/Test Cases/StudentSearchCoursebyid/20180328_112637/execution.properties')

TestCaseMain.beforeStart()
try {
    
	    TestCaseMain.runTestCase('Test Cases/StudentSearchCoursebyid', new TestCaseBinding('Test Cases/StudentSearchCoursebyid', [:]), FailureHandling.STOP_ON_FAILURE )
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/StudentSearchCoursebyid')
}
