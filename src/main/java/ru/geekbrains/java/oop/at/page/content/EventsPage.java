package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

public class EventsPage extends ContentBasePage {

    public EventsPage (WebDriver driver) {
        super(driver);
    }

    @Override
    public ContentBasePage openUrl() {
        driver.get("https://geekbrains.ru/events");
        return this;
    }
}