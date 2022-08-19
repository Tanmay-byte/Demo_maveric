package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class asses1 {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
	    
	     WebDriver driver=new ChromeDriver();
	     driver.navigate().to("https://askomdch.com/");
	     driver.manage().window().maximize();
	     //driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
	     Thread.sleep(2000);
	     //driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("shoes");
	     //driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,1000)");
	     driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[3]/div[2]/a[2]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[3]/div[2]/a[3]")).click();
	     js.executeScript("window.scrollBy(0,1000)");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Tamay");
	     driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("Nayak");
	     driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("204,LBS Marg");
	     driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("Mahavir Universe,Bhandup");
	     driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Mumbai");
	     driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("90202");
	     driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("tanmayt@maveric-systems.com");
	     driver.findElement(By.xpath("//*[@id=\"payment_method_cod\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	     Thread.sleep(10000);
	     File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileHandler.copy(srcFile,new File("screenshot\\screenshot15.png"));
	     //Thread.sleep(2000);
	     //js.executeScript("window.scrollTo(document.body.scrollHeight,0 )");
	}

}
