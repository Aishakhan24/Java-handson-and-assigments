package websitestd;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/studentlogin.html");
		driver.findElement(By.id("std-btn")).click();
		driver.findElement(By.id("regi-id")).click();
		driver.findElement(By.id("Firstname")).sendKeys("Dora");
		driver.findElement(By.id("Lastname")).sendKeys("cake");
		driver.findElement(By.id("Emailid")).sendKeys("dora23@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dora23");
		driver.findElement(By.id("confirm-id")).sendKeys("Dora23");
		driver.findElement(By.id("gender1")).click();
		driver.findElement(By.id("gender2"));
		driver.findElement(By.id("gender3"));
		driver.findElement(By.className("check-box")).click();
		driver.findElement(By.className("submit-btn")).submit();
		driver.close();
		
	}

	

}
