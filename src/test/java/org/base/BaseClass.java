package org.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

	public static WebDriver driver;
	public static final String AUTOMATE_USERNAME = "praveenboss1";
	public static final String AUTOMATE_ACCESS_KEY = "ZfcFUcb4qE8NPBUeBq3R";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriverCloud() throws MalformedURLException {
		if (driver == null) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "10");
			caps.setCapability("resolution", "1920x1080");
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "86.0 beta");
			caps.setCapability("os", "Windows");
			driver = new RemoteWebDriver(new URL(URL), caps);

		}
		return driver;

	}

	public static WebDriver getDriver() {
		if (driver == null) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sony\\eclipse-workspace\\CucumberUsingSingleton\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public void Title() {
		driver.getTitle();
	}

	public String getcurrenturl() {
		return driver.getCurrentUrl();
	}

	public void close() {
		driver.close();

	}

	public void quit() {
		driver.quit();
	}

	public  static void insert(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String getAttribute(WebElement element, String data) {
		String attribute = element.getAttribute(data);
		return attribute;

	}

	public static String tagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;

	}

	public static Dimension getSize(WebElement element) {
		Dimension size = element.getSize();
		return size;

	}

	public static Point location(WebElement element) {
		Point loc = element.getLocation();
		return loc;

	}

	public static boolean displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean enabled(WebElement element) {
		boolean enabled = element.isDisplayed();
		return enabled;
	}

	public static boolean selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	public static void submit(WebElement element) {
		element.submit();

	}

	public static String cssValue(WebElement element, String value) {
		String cssValue = element.getCssValue(value);
		return cssValue;

	}

	public static void jsSrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void jsSrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void jsInsert(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);

	}

	public static void jsGetAttribute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);

	}
	
	public static void jsGetClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].click", element);

	}
	
	
	

	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	public static void alertInserttxt(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);

	}

	public static String alertGetText() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		return text;

	}

	public static void selectByIndex(WebElement element, int num) {
		Select s = new Select(element);
		s.selectByIndex(num);

	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public static void deselectByIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.deselectByIndex(value);

	}

	public static void deselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);

	}

	public static void deselectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}

	public static void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	public static void mouseOver(WebElement element) {
		Actions a = new Actions(driver);

		a.moveToElement(element).perform();

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);

		a.dragAndDrop(source, target);

	}

	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);

		a.contextClick(element).perform();
	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);

		a.doubleClick(element).perform();
	}

	public static void windowById(String value) {
		driver.switchTo().window(value);

	}

	public static void windowByTitle(String value) {
		driver.switchTo().window(value);

	}

	public static void windowByUrl(String value) {
		driver.switchTo().window(value);

	}

	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);

	}

	public static void frameByname(String name) {
		driver.switchTo().frame(name);

	}

	public static void frameBywebelement(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void frameBy(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void frameBywebId(String id) {
		driver.switchTo().frame(id);

	}
	
	public void datadriven() {
		// TODO Auto-generated method stub

	}

	public static void navigateBack(String value) {
		driver.navigate().to(value);

	}

	public static void navigateForward() {
		driver.navigate().back();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}
}
