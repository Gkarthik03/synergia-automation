package com.synergia.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver,
                Duration.ofSeconds(15));
    }

    private By emailTxt = By.id("email");

    private By passwordTxt = By.id("password");

    private By signInBtn =
            By.xpath("//button[@type='submit']");

    public void login(String username,
                      String password) {

        wait.until(ExpectedConditions
                        .visibilityOfElementLocated(emailTxt))
                .sendKeys(username);

        wait.until(ExpectedConditions
                        .visibilityOfElementLocated(passwordTxt))
                .sendKeys(password);

        wait.until(ExpectedConditions
                        .elementToBeClickable(signInBtn))
                .click();
    }
}