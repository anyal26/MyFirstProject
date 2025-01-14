package com.bigshop.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageLoader {
    private final WebDriver driver;
    private static final int DRIVER_WAIT_TIME = 10;

    public PageLoader(WebDriver driver) {
        this.driver = driver;
    }

    public void isElementPresent(By locator) {
        try {
            getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (WebDriverException e) {
            throw new WebDriverException("Element is ot present: " + e.getMessage());
        }
    }

    public void isListVisible(List<WebElement> elements, int waitTimeSec) {
        try {
            getWait().until(ExpectedConditions.visibilityOfAllElements(elements));
        } catch (WebDriverException e) {
            throw new WebDriverException("Element is ot present: " + e.getMessage());
        }
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(this.driver, Duration.ofSeconds(DRIVER_WAIT_TIME));
    }

    private WebDriverWait getWait(int waitTimeSec) {
        return new WebDriverWait(this.driver, Duration.ofSeconds(waitTimeSec));
    }
}