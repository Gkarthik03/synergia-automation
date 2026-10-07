package com.synergia.pages;

import org.openqa.selenium.WebDriver;

public class ProductOwnerDashboardPage {

    private WebDriver driver;

    public ProductOwnerDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductOwnerDashboardDisplayed() {

        System.out.println(
                "Product Owner Dashboard URL : "
                        + driver.getCurrentUrl());

        return driver.getCurrentUrl()
                .toLowerCase()
                .contains("product-owner");
    }
}