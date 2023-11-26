package demoqa.tests;

import com.codeborne.selenide.Configuration;
import demoqa.testdata.TestData;
import org.junit.jupiter.api.BeforeAll;
import demoqa.pages.RegistrationPage;

public class BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
     TestData testData = new TestData();

    @BeforeAll
    static void beforAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 60000;
        Configuration.timeout = 60000;
    }
}
