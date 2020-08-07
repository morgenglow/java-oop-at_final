package ru.geekbrains.java.oop.at;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.page.content.TestsPage;

import java.util.stream.Stream;

import static ru.geekbrains.java.oop.at.block.LeftNavigation.Button;

@Feature("Навигация")
@Story("Переход на страницы")
@DisplayName("Переход на страницы")
public class LeftNavigationWebTest extends BeforeAndAfterStep {

    public static Stream<Button> stringProviderNotPopUp() {
        return Stream.of(
                Button.TOPICS,
                Button.EVENTS,
                Button.TESTS,
                Button.CAREER
        );
    }

    @Description("Тесты которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(Button button) {
        new TestsPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(button)
                .getHeader().checkNamePage(button.getText());
    }


    @Test
    @DisplayName("Нажатие на элемент навигации")
    public void checkNavigationPopUp() {
        new TestsPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(Button.POSTS)
                .closedPopUp()
                .getHeader().checkNamePage(Button.POSTS.getText());
    }
}
