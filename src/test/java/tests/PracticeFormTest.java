package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.*;


public class PracticeFormTest {
    Keys b = BACK_SPACE;


    @BeforeAll
    static void config(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @BeforeEach
    void openPage(){
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void FillForm(){
        $("[id=firstName]").setValue("FirstnameTest");
        $("[id=lastName]").setValue("LastnameTest");

        $("[id=userEmail]").setValue("Test@test.ru");

        $(byXpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();

        $("[id=userNumber]").setValue("1234567891");

        for (int i = 0; i < 10; i++) {
            $("[id=dateOfBirthInput]").sendKeys(b);
        }
        $("[id=dateOfBirthInput]").setValue("1 Jun 1993");
        $("[id=userEmail-label]").click();


        $("[id=subjectsInput]").setValue("Test");
        $(byXpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();

        $("[id=currentAddress]").setValue("asdasdasdasdasda");


        $("[id=state]").click();
        $("[id=react-select-3-input]").setValue("Haryana").doubleClick().pressEnter();


        $("[id=city]").click();
        $("[id=react-select-4-input]").setValue("Karnal").doubleClick().pressEnter();


        $("[id=submit]").click();


        //$(".modal-body").click();
        $(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")).shouldHave(
                text("FirstnameTest") , text("LastnameTest"));
        $(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).shouldHave(
                text("Test@test.ru")
        );
        $(byXpath("//html/body/div[4]/div/div/div[2]/div/table/tbody/tr[3]/td[2]")).shouldHave(
                text("Male")
        );
        $(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]")).shouldHave(
                text("1234567891")
        );
        $(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[7]/td[2]")).shouldHave(
                text("Sports")
        );
        $(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[9]/td[2]")).shouldHave(
                text("asdasdasdasdasda")
        );
        $(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[10]/td[2]")).shouldHave(
                text("Haryana"), text("Karnal")
        );
        //$(byXpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[5]/td[2]")).shouldHave(
                //text("11 Jun,1993")
        //);
    }

}
