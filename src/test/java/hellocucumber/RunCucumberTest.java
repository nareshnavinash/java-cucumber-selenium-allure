package hellocucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import io.qameta.allure.Allure;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty:target/pretty/pretty.txt", "html:target/html", "json:target/json-reports/Cucumber.json"}, 
		strict = false, 
		monochrome = true,
		features = "src/test/resources/")
public class RunCucumberTest
{
	@BeforeClass
	public static void setUpClass() {
	    
	}
	
	
	@AfterClass
    public static void writeExtentReport() {
		 // Allure.addAttachment("Some Screenshot", imageAsByteArrayIS);
		 // Allure.addAttachment(nameTest, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }
}

// mvn test -Dcucumber.options='--tags "@test"'
// mvn install "-Dmyproperty=my property from command line"