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
		        //1 st tab
		        driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> newWindow=new LinkedList<String>(windowHandles);
			driver.switchTo().window(newWindow.get(1));
			driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
			driver.switchTo().window(newWindow.get(0));
		        
		//second tab
		      driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Set<String> windowHandles2 = driver.getWindowHandles();
			List<String> newWindow2=new LinkedList<String>(windowHandles2);
			driver.switchTo().window(newWindow2.get(1));
			driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
			driver.switchTo().window(newWindow2.get(0));   
		
		//driver.findElement(By.xpath("(//input[@type='text'])[30]")).sendKeys("10610");
         driver.findElement(By.xpath("//a[text()='Merge']")).click();
         Alert alert=driver.switchTo().alert();
         alert.accept();
         System.out.println(driver.getTitle());
         
 		
	
	
	}

}

 		
	
	
	}

}
