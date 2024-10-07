package com.jira.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProjectsPage extends BaseJiraPage{
    //Locators
    //ProjectList - all projects
    public ProjectsPage() {
        super("");
    }
    private final By allProjectsList = By.className("_4t3ickbl _kqswh2mm _189e18uv _1dqoglyw _1h6d18uv _1bsb1osq _irr3k6hx");
    public List<WebElement> getJiraProjects() {
        return driver().findElements(allProjectsList);
    }
    //Actions
    //selectProjectByName(String projName)  -  select and click on a specific project
    public void clickBugsRepoProject(){
        List<WebElement> projects = getJiraProjects();
        projects.get(0).click();
    }

    public void clickBugsProject() {
        WebElement element = driver().findElement(By.xpath("//span[text()='Bugs Repository']"));
        element.click();
    }

}
