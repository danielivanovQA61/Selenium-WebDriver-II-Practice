package com.jira.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AtlassianHome extends BaseJiraPage{
    public AtlassianHome() {
        super("/o/9aca846e-4e02-45e8-9acf-2b08050fa7d2/?cloudId=6f54bb84-bda9-4840-9129-68bc8154572c");
    }
    //Locators

    private final By profileButton = By.xpath("//button[@data-testid='nav-profile-button--trigger']");
    private final By apps = By.className("sc-gldTML errIdA");
    public List<WebElement> getAtlassianApps() {
        return driver().findElements(apps);
    }

    //Actions

    public void clickJiraApp(){
        List<WebElement> items = getAtlassianApps();
        items.get(0).click();
    }
    public void waitForProfileButton() {
        var title = driver().findElement(profileButton);
        driverWait().until(ExpectedConditions.visibilityOf(title));
    }
}
