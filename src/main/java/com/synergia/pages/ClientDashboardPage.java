package com.synergia.pages;
 
import org.openqa.selenium.WebDriver;
 
public class ClientDashboardPage {
 
    private WebDriver driver;
 
    public ClientDashboardPage(WebDriver driver) {
        this.driver = driver;
    }
 
    public boolean isClientDashboardDisplayed() {
 
        System.out.println(
                "Client Dashboard URL : "
                        + driver.getCurrentUrl());
 
        return driver.getCurrentUrl()
                .toLowerCase()
                .contains("client");
    }
}
 