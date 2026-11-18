package com.locate360.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public static final String URL = "https://d3ycgtg2r9kfs.cloudfront.net/";

    public static void launchBrowser() {
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public static void openApplication() { driver.get(URL); }
    public static WebDriver getDriver() { return driver; }
    public static void closeBrowser() { if (driver != null) { driver.quit(); driver = null; } }
}
