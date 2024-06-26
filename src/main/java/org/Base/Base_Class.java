package org.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver launch_Browser() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void takescreenshot(String pathname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File n = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(pathname);
		FileUtils.copyFile(n, f);

	}

	public static void geturl( String path) {
		driver.get(path);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitly_waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void clear(WebElement element) {
		element.clear();
			
	}

	public static void Sleep(int num) throws InterruptedException {
		Thread.sleep(num);
	}
	
	public static void move_To_Element(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.moveToElement(element).build().perform();
			
	}
	
	public static void action_Click(WebElement element) {
		Actions a=new Actions(driver);
		a.click(element).build().perform();
	}
	
	public static void action_doubleclick(WebElement elemnet) {
		Actions a=new Actions(driver);
		a.doubleClick(elemnet).build().perform();
	}

	public static void send_keys(WebElement element,String string) {
		element.sendKeys(string);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void select_By_Index(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public static void select_By_Value(WebElement element,String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	public static void slect_Visibletext(WebElement element,String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void javascript(WebDriver driver,String key,WebElement args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(key, args);
	}
	
	public static void alert_Accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	public static void alert_dismiss() {
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static void switch_frame(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		
	}
	
	public static void downkey() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void enter_Key() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
	
	public static void control_key() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void isDisplyed(WebElement element) {
		isDisplyed(element);
	}
	
	public static void isSelected(WebElement element) {
		isSelected(element);
	}
	public static void isEnabled(WebElement element) {
		isEnabled(element);
	}
	
	
	

}
