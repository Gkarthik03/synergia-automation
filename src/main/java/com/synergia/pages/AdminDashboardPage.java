package com.synergia.pages;

import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {

    private WebDriver driver;

    public AdminDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAdminDashboardDisplayed() {

        System.out.println(
                "Admin Dashboard URL : "
                        + driver.getCurrentUrl());

        return driver.getCurrentUrl()
                .toLowerCase()
                .contains("admin");
    }
}