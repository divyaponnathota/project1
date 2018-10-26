package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\personal\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.google.com");
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.close();
	}

}
