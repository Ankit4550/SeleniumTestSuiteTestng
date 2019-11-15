 package TestNG;
 import org.testng.annotations.Test;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestNG {
	@Test
	public void f() {
	System.setProperty("webdriver.gecko.driver","/home/ankits/SeleniumGecko/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String appurl=driver.getTitle();
	System.out.println(appurl);
	driver.close();
	// System.exit(0);
	}
}