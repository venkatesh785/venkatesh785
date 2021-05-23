package seleniumTestNG;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailurScreenShot {
	 WebDriver driver;
	@Test
	public void Failur() {
		System.out.println("how to print failur screen shot");
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("sudheer");
        driver.findElement(By.id("pass2")).sendKeys("1233456");
	}
	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			        FileHandler.copy(srcFile, new File("D:\\screenshot\\failed.png"));
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}
	}
}

