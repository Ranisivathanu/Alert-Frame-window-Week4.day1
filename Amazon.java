package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	   driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("oneplus 9 pro",Keys.ENTER);
	   String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	   System.out.println("Price:"+price);
	   driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	   
	   String rating = driver.findElement(By.xpath("//span[text()='4.1 out of 5']")).getText();
	   System.out.println("Rating:"+rating);
	   driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	   
	   String TotalPrice = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base sc-price sc-white-space-nowrap sw-subtotal-amount a-text-bold']")).getText();
	   System.out.println("TotalPrice:" +TotalPrice);
	   
	   if (price== TotalPrice) {
		   
		   System.out.println("Total price value is correct");
	   }else
		   
		   System.out.println("Total price value is not correct");	
	   
	
	}

}
