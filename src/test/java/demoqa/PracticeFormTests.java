package demoqa;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeFormTests {



    @BeforeAll
    static public void setup(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;

    }

    @Test
    void fillPracticeForm() {
        open("https://demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));
//        $(".practice-form-wrapper").$(byText("Student Registration Form"))
//                .shouldHave(text("Student Registration Form"));
//        $("#firstName").setValue("Igor");
//        $("#lastName").setValue("Akinfeev");
//        $("#userEmail").setValue("IgorAKIII@ya.ru");
//        $("#gender-radio-1[value=Male]").click();


    }

}
