package com.synergia.pages;

import org.openqa.selenium.WebDriver;

public class ScrumMasterDashboardPage {

    private WebDriver driver;

    public ScrumMasterDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isScrumMasterDashboardDisplayed() {

        System.out.println(
                "Scrum Master Dashboard URL : "
                        + driver.getCurrentUrl());

        return driver.getCurrentUrl()
                .toLowerCase()
                .contains("scrum-master");

    }
}