package com.jira.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AtlassianLoginPage extends BaseJiraPage{
    public AtlassianLoginPage() {
        super("/login");
    }
    // Locators
    private final By usernameLocator = By.xpath("//input[@data-testid='username']");
    private final By passwordLocator = By.xpath("//input[@data-testid='password']");
    private final By continueButtonLocator = By.xpath("//button[@id='login-submit']");

    // Actions
    public void authentication(String username, String password) {
        WebElement loginButton = driver().findElement(continueButtonLocator);

        WebElement usernameInput = driver().findElement(usernameLocator);
        usernameInput.sendKeys(username);
        loginButton.click();

        WebElement passwordInput = driver().findElement(passwordLocator);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
