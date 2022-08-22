package StepDefinitions;



import java.io.File;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.*;
import junit.framework.Assert;



public class GoogleSearchSteps {



   WebDriver driver = null;



   @Given("browser window is open")
    public void browser_is_open() {
        
        System.out.println("Inside Step - browser is open");
        
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);
        String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", filePath);
        //System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
    }



   @And("user is on google search page")
    public void user_is_on_google_search_page() {
        
        System.out.println("Inside Step - user is on goolge search page");
        
        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php/");
        
    }



   @SuppressWarnings("deprecation")
@When("click on shop now")
    public void click_on_shop_now() throws InterruptedException {
        
        System.out.println("Inside Step - click on shop now");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Tanmay");
        
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Nayak");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys("9380413755");
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("tanmayt@maveric-systems.com");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Phoenix Mahavir Universe");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys("Sydney");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys("Queensland");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys("4822");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")).sendKeys("Australia");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tanmay");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("tanmay123");
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("tanmay1232");
        
        
        Thread.sleep(2000);

      	WebElement assertionnec = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
      	Assert.assertEquals(true, assertionnec.isDisplayed());
      	System.out.println("Confirmation text printed in command line");
        }   
    
    



   @And("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
        
        System.out.println("Inside Step - user enters a text in search box");
        
//        driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("Shoes");
        Thread.sleep(2000);
    }



   
     @Then ("user clicks on search button")
     public void user_clicks_on_search_button() throws InterruptedException{
         System.out.println("Inside Step - user clicks on serach button");
         driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
         Thread.sleep(2000);
         WebElement assertionnecc = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/span"));
       	Assert.assertEquals(true, assertionnecc.isDisplayed());
       	System.out.println("Password and confirm password does not match-Negative scenario");
     }
    
    @Then("click on first search result and add the first search result to cart")
    public void click_on_first_search_result_and_add_the_first_search_result_to_cart() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"product-1215\"]/div[2]/form/button")).click();
    	
        
    }
   





}

