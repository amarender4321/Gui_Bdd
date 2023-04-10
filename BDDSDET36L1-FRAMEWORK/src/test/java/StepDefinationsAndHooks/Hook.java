package StepDefinationsAndHooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import bddSdet36L1.genericUtility.PropertyFile;
import bddSdet36L1.injector.Base;
import bddSdet36L1.pomPages.VtigerLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	
	Base base;
	public Hook(Base base) {
		this.base=base;
	}
	@Before
	public void  setUp() throws Throwable {
		String browser = PropertyFile.readDataFromPropertyFile("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			base.driver=new ChromeDriver();
			base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			base.driver.get("http://localhost:8888/");
		}
	
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			base.driver=new FirefoxDriver();
			base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			base.driver.get("http://localhost:8888/");
		}
		else {
			System.out.println("Enter valid browser name");
		}
	          VtigerLoginPage loginPage = new VtigerLoginPage(base. driver) ;
                  String userName = PropertyFile.readDataFromPropertyFile("username");
                  System.out.println(userName);
                  String password = PropertyFile.readDataFromPropertyFile("password");
                  System.out.println(password);

                  loginPage.loginToApp(userName, password);
}
	@After
	public void  tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			TakesScreenshot takesScreenShot=(TakesScreenshot)base.driver;
		byte[] screenShot = takesScreenShot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenShot, "image/png",scenario.getName() );
			
		}
		base.driver.quit();
	}
}