package org.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Main extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		getDriver();
		loadUrl("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		LoginPage page = new LoginPage();
		WebElement logIn = page.getLoginMouseOver();
		// mouseOver(logIn);
		// WebElement signupButton = page.getSignupButton();
		// click(signupButton);
		WebElement mobileNumber = page.getMobileNumber();
		insert(mobileNumber, "7845638852");
		WebElement passWord = page.getPassWord();
		insert(passWord, "praveenkv7845");
		WebElement submitButton = page.getSubmitButton();
		click(submitButton);
		Thread.sleep(4000);
		WebElement textBox = page.getTextBox();
		textBox.sendKeys("mobiles",Keys.ENTER);
		
		//jsGetClick(textBox);

		WebElement inputSearch = page.getInputSearch();
		click(inputSearch);
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if (!windowHandle.equalsIgnoreCase(x)) {
				driver.switchTo().window(x);
				
				
			}
		}
		
		
		WebElement notifyButton = page.getNotifyButton();
		jsGetClick(notifyButton);
		WebElement denyClick = page.getDenyClick();
		click(denyClick);
		Thread.sleep(3000);
		System.out.println("done....");
		
		driver.quit();
		
		

	}

}
