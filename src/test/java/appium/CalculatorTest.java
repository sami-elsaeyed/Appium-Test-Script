package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
	
	static AndroidDriver<WebElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException, SQLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability("browserstack.user", "samielsaeyed_*******");
	    //cap.setCapability("browserstack.key", "******************");

		cap.setCapability("deviceName", "3542343449563098");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		//cap.setCapability("device", "Galaxy S9+");
	    //cap.setCapability("os_version", "9.0");

		cap.setCapability("noReset", "true");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		//cap.setCapability("app", "bs://<app-id>");
		
		
	    driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		openCalculator(driver);
	}
	
	public static void openCalculator(AndroidDriver<WebElement> driver) throws MalformedURLException, InterruptedException, SQLException{
		
		System.out.println("Application Works");
		
		WebElement nine = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
		WebElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
		WebElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		WebElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		WebElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		

		nine.click();
		plus.click();
		five.click();
		equals.click();
		
		String res = result.getText();
		
		System.out.println(res);
		
	}

	
}
