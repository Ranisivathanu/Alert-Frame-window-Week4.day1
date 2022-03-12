package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frametoframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[1]")).sendKeys("Java Learning");
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath("//option[text()='Big Baby Cat']")).click();
	    driver.switchTo().defaultContent();
	}

}
