package ru.geekbrains.java.oop.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.BasePageObject;
import ru.geekbrains.java.oop.at.page.content.CoursePage;

public class ContentNavigationCourseBlock extends BasePageObject {

    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    public ContentNavigationCourseBlock(WebDriver driver) {
        super(driver);
    }


    public CoursePage clickTab(Tab tab) {
        switch (tab) {
            case PROFESSIONS: {
                tabProfessions.click();
            }
            case FREE_INTENSIVE: {
                tabFreeIntensive.click();
            }
            case COURSES: {
                tabCourses.click();
            }
            case COMPANIES: {
                tabCompanies.click();
            }
        }
        return new CoursePage(driver);
    }

    public enum Tab {
        PROFESSIONS,
        FREE_INTENSIVE,
        COURSES,
        COMPANIES;
    }
}
