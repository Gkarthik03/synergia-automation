package com.synergia.pages;

import org.openqa.selenium.WebDriver;

public class ExecutiveDashboardPage {

    private WebDriver driver;

    public ExecutiveDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isExecutiveDashboardDisplayed() {

        System.out.println(
                "Executive Dashboard URL : "
                        + driver.getCurrentUrl());

        return driver.getCurrentUrl()
                .toLowerCase()
                .contains("executive");
    }

}