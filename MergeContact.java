package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		String title=driver.getTitle();
		System.out.println(title);
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
         driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys("Test");
         driver.findElement(By.xpath("(//input[@type='text'])[30]")).sendKeys("leaf");
         driver.findElement(By.xpath("//a[text()='Merge']")).click();
         Alert alert=driver.switchTo().alert();
         alert.accept();
         System.out.println(driver.getTitle());
         
 		
	
	
	}

}
