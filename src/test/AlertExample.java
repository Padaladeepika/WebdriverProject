package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");    
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		// alert accept

WebElement elem =driver.findElement(By.xpath("//button[@id='alertButton']"));
elem.click();

Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();

// alert cancel

WebElement elem1 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
elem1.click();

Alert alert1 = driver.switchTo().alert();
System.out.println(alert.getText());
alert1.dismiss();


// alert message


WebElement elem2 = driver.findElement(By.xpath("//*[@id='promtButton']"));

// used to avoid error

JavascriptExecutor obj = (JavascriptExecutor) driver;
obj.executeScript("arguments[0].scrollIntoView();", elem2);


elem2.click();

Alert alert2 = driver.switchTo().alert();

System.out.println(alert2.getText());
alert2.sendKeys("Some text");
alert2.accept();


}

	
}


