package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideOnGithub(){
        //открыть страницу github
        open("https://github.com/");
        //ввести в поле поиска selenide
        $("[name = q]").setValue("selenide").pressEnter();
        //нажать enter
        $$("ul.repo-list li").first().$("a").click();
        //выбрать первый найденый проект из списка
        //проверка: в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
    }

    @Test
    void firstContributorShouldBeSolntsev(){
        //Configuration.headless = true; -запуск с бразером в фоне
        //открыть страницу selenide
        open("https://github.com/selenide/selenide");
        //подвести мышку к первому элементу в области Contirbutors
        $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("li").hover();
        //проверка: в появившемся окне(overlay)
        $$(".Popover-message").findBy(visible)
                .shouldHave(text("Andrei Solntsev"));
    }
}