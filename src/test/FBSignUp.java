package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
//relative xpath locator
        
        WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        
        Signup.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LastName= driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Email = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		FirstName.sendKeys("Deepika");
		LastName.sendKeys("Padala");
		Email.sendKeys("@bsd@gmail.com");
		Password.sendKeys("adbds@4");
		
		String strGender = "Female";
		
		  //input[@value='1']
        //input[@value='2']
        //input[@value='-1']
        
        //label[text()='Male']/following-sibling::input
        //label[text()='Female']/following-sibling::input
        //label[text()='Custom']/following-sibling::input
		
		
        
		String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
		
		
		//String genXpath = " //input[@value='1']";
        
        WebElement gen = driver.findElement(By.xpath(genXpath));
        gen.click();
    
List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));
        
        for(WebElement elm : Months) {
            
            System.out.println(elm.getText());
            
            
//            WebElement CurrMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
            
//            System.out.println("Current Month " + CurrMonth.getText());
            
            WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
            
            Select ddDay = new Select(Day);
            ddDay.selectByVisibleText("25");
            
          

WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
           
            Select ddMonth = new Select(Month);
            
           ddMonth.selectByVisibleText("Mar");
           
           
           WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
           
           Select ddYear = new Select(Year);
           ddYear.selectByVisibleText("1995");
           		
           
           
           
        }
		
		
	}
	
	
		
	}

	
	


