package com.bigshop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By profileIcon = By.id("profileIcon");

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }
    public boolean isUserLoggedIn() {
        return driver.findElement(profileIcon).isDisplayed();
    }
}