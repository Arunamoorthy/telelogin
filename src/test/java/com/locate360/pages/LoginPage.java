package com.locate360.pages;

import org.openqa.selenium.By;

import com.locate360.base.BaseClass;

public class LoginPage extends BaseClass {



private final By emailField =
By.xpath("//input[@type='email']");

private final By passwordField =
By.xpath("//input[@type='password']");

private final By signInButton =
By.xpath("//button[contains(normalize-space(),'Sign In')]");

private final By forgotPasswordLink =
By.xpath("//*[self::a or self::button][contains(normalize-space(),'Forgot Password')]");



public void enterEmail(String email) {
sendKeys(emailField, email);
}

private void sendKeys(By emailField2, String email) {
	
	
}

public void enterPassword(String password) {
sendKeys(passwordField, password);
}

public void clickSignIn() {
click(signInButton);
}

private void click(By signInButton2) {
	
	
}

public void clickForgotPassword() {
click(forgotPasswordLink);
}



public boolean isPasswordMasked() {
String type = driver.findElement(passwordField)
.getAttribute("type");

return "password".equalsIgnoreCase(type);
}

public boolean isForgotPasswordDisplayed() {
return driver.findElement(forgotPasswordLink)
.isDisplayed();
}

public String getCurrentUrl() {
return driver.getCurrentUrl();
}



public void login(String email, String password) {
enterEmail(email);
enterPassword(password);
clickSignIn();
}
}



