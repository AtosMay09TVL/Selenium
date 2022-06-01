package basic_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) throws InterruptedException {
    //Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\syntel\\eclipse-workspace\\Selenium_Training_Excersises\\src\\basic_commands\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    //Open the URL(https://github.com)
		String Url="https://github.com";
		driver.get(Url);
    // Enter Email Address
		driver.findElement(By.id("user_email")).sendKeys("athihindhundr@gmail.com");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[1]/div[1]/div/div/div[1]/form/div/button")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.id("email")).clear();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.id("email")).sendKeys("athi@gmail.com");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//*[@id=\"email-container\"]/div[2]/button")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.id("password")).sendKeys("pass143pass");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[@id=\"password-container\"]/div[2]/button")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("login")).sendKeys("AathiMuthuT");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[3]/div[2]/button")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("opt_in")).sendKeys("n");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/text-suggester/div[1]/form/div[4]/div[2]/button")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/a")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("login_field")).sendKeys("Aathimuthu");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.id("password")).sendKeys("Aathimuthu@143");
		driver.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/div/input[12]")).click();
		
		TimeUnit.SECONDS.sleep(10);
		
		driver.quit();
	}

}
