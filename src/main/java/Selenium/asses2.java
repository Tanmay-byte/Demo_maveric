package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithBody;

public class asses2 {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
	    
	     WebDriver driver=new EdgeDriver();
	     driver.navigate().to("https://demoqa.com/automation-practice-form");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("tanmay");
	     driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("nayak");
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,250)", "");
	     File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileHandler.copy(srcFile,new File("screenshot.png"));
	}

}
