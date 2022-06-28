package websitestd;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
public class studentlogin {
	public static boolean isSelected;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting12\\Desktop\\Demo\\studentlogin.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("login-page"));
		driver.findElement(By.className("toggle-btn"));
        driver.findElement(By.id("e-mail")).sendKeys("aisha23@gmail.com");
		driver.findElement(By.id("pass-id")).sendKeys("Aishakhan23");
		driver.findElement(By.className("check-box")).isSelected();
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("std-btn")).click();
		driver.findElement(By.id("regi-id")).click();
		driver.findElement(By.className("form-box"));
		driver.findElement(By.id("firstname")).sendKeys("Dora");
		driver.findElement(By.id("lastname")).sendKeys("Cakes");
		driver.findElement(By.id("mailid")).sendKeys("dora23@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dora23@");
		driver.findElement(By.id("cpassword")).sendKeys("Dora23@");
		driver.findElement(By.id("gender1"));
		driver.findElement(By.id("gender2")).click();
		driver.findElement(By.id("gender3"));
		driver.findElement(By.className("check-box")).click();
		WebElement selected=driver.findElement(By.id("check"));
		boolean a= selected.isSelected();
		System.out.println(a);
		if(isSelected ==false) {
			System.out.println("yes your check box is selected");
		}
		driver.findElement(By.className("submit-btn")).click();
		driver.close();
		
	}

}