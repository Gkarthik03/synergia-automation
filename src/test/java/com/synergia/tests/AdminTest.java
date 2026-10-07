package com.synergia.tests;

import com.synergia.base.BaseClass;
import com.synergia.pages.AdminDashboardPage;
import com.synergia.pages.LoginPage;
import com.synergia.utils.ExcelUtils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminTest extends BaseClass {

    @DataProvider(name = "adminData")
    public Object[][] getAdminData() throws Exception {

        return ExcelUtils.getTestData(
                "src/test/resources/testdata/Admin_testing.xlsx",
                "Sheet1");
    }

    @Test(dataProvider = "adminData")
    public void verifyAdminLogin(
            String username,
            String password,
            String expected) throws Exception {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(username, password);

        Thread.sleep(5000);

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("Expected : " + expected);
        System.out.println("Current URL : "
                + driver.getCurrentUrl());

        AdminDashboardPage dashboard =
                new AdminDashboardPage(driver);

        boolean loginSuccessful =
                dashboard.isAdminDashboardDisplayed();

        if (expected.equalsIgnoreCase("valid")) {

            Assert.assertTrue(
                    loginSuccessful,
                    "Admin login failed");

        } else {

            Assert.assertFalse(
                    loginSuccessful,
                    "Invalid login should fail");
        }
    }
}
