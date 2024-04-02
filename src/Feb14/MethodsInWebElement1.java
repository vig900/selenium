package Feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.findElement(By.id("username_span")).getText());
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
