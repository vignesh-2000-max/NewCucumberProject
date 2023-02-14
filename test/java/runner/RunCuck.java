package runner;


/*
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin={"json:target/RunCuck/cucumber.json","pretty","html:target/RunCuck/cucumber.html"},
		features="src/test/resources/features",
		glue= {"steps"},
		tags= "@Find-Your-Car"
		)
public class RunCuck extends AbstractTestNGCucumberTests{
	
	
/*@BeforeClass
	public static void setup() {
		
		Date d=new Date();
		String name=d.toString().replace(":", "_").replace(" ", "_");
		String fileName=System.getProperty("user.dir")+"\\target\\Extent_Reports\\"+name+".html";
		File newFile=new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		ExtentCucumberFormatter.loadConfig(new File("srs/test/resources/extent-config.xml"));
		
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser Version", "v109.0.5414.120");
		ExtentCucumberFormatter.addSystemInfo("Selenium Version", "v4.8.0");
		
		
	}
	*/

}
