package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithBody;

public class asses4 {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chromedriver","chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.navigate().to("https://www.google.com/");
	        driver.manage().window().maximize();
	        




	    Actions acc = new Actions(driver);
	    WebElement txtUsername = driver.findElement(By.name("q"));
	    org.openqa.selenium.interactions.Action seriesOfActions = acc
	        .moveToElement(txtUsername)
	        .click()
	        .keyDown(txtUsername, Keys.SHIFT)
	        .sendKeys(txtUsername, "hello")
	        .keyUp(txtUsername, Keys.SHIFT)
	        .doubleClick(txtUsername)
	        .contextClick()
	        .build();
	        
	    seriesOfActions.perform() ;
	}
	}
