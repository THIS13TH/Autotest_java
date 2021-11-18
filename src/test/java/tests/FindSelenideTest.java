package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideOnGithub(){
        //открыть страницу github
        Selenide.open("https://github.com/");
        //ввести в поле поиска selenide
        $("[name = q]").setValue("selenide").pressEnter();
        //нажать enter
        $$("ul.repo-list li").first().$("a").click();
        //выбрать первый найденый проект из списка
        //проверка: в заголовке встречается selenide/selenide
        $("h1").shouldHave(Condition.text("selenide / selenide"));
    }
}