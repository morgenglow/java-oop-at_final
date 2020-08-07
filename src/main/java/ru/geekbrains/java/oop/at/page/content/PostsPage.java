package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

public class PostsPage extends ContentBasePage{

    public PostsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContentBasePage openUrl() {
        driver.get("https://geekbrains.ru/posts");
        return this;
    }
}
