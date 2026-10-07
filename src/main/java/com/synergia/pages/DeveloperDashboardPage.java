package com.synergia.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeveloperDashboardPage {

    private WebDriver driver;

    public DeveloperDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDeveloperDashboardDisplayed() {

        System.out.println(
                "Dashboard URL : "
                        + driver.getCurrentUrl());

        return driver.getCurrentUrl()
                .toLowerCase()
                .contains("developer");
    }
}