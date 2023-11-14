package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class NopCommerce {
    //Setup Chrome browser
    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //Multiple browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        //Open URL
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Timeout for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current url.
        System.out.println(driver.getCurrentUrl());
        //print the page source.
        System.out.println(driver.getPageSource());
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Navigate to other Url
        driver.navigate().to(loginUrl);
        //Print current URL
        System.out.println("This is the current URL: " + driver.getCurrentUrl());
        //Navigate back to the home page.
        driver.navigate().back();
        //Navigate to the login page.
        driver.navigate().forward();
        //Print the current url.
        System.out.println("This is the current URL: " + driver.getCurrentUrl());
        //Refresh the page.
        driver.navigate().refresh();
        //Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("sjalpar@gmail.com");
        //Enter the password to password field.
        driver.findElement(By.id("Password")).sendKeys("par123455");
        //Click on Login Button.
        driver.findElement(By.className("login-button")).click();
        //Close the browser.
        driver.quit();

    }
}
