package assignment9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dis = driver.findElement(By.xpath("//button[text()='Sign up']"));
		
		System.out.println(dis.isEnabled());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vaibhav");
		driver.findElement(By.id("email")).sendKeys("vaibhavbansude@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vaibhav@123");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2 	]")).click();
		
		
		Thread.sleep(2000);
		
		WebElement gen = driver.findElement(By.xpath("(//input[@id='gender'])[1]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gen);
		Thread.sleep(2000);
		gen.click();
		//WebElement ele2 = driver.findElement(By.id("gender"));
		WebElement ele = driver.findElement(By.name("state"));
		Select se = new Select(ele);
		
		se.selectByVisibleText("Maharashtra");
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[text()='Sign up']")).click();
		
		System.out.println(dis.isEnabled());
		
		

		//Identify the WebElement which will appear after scrolling down

		WebElement element = driver.findElement(By.xpath("//*[text()='Sign up']"));

		// now execute query which actually will scroll until that element is not appeared on page.

		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		element.click();
		//driver.findElement(By.xpath("//*[text()='Sign up']")).click();

	}

}
