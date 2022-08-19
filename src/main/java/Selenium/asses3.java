package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithBody;

public class asses3 {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			
	     WebDriver driver=new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://demoqa.com/alerts");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	     
	     Alert alert=driver.switchTo().alert();
	     Thread.sleep(2000);
	     alert.accept();

	}

}
