package demoqa.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectTests extends BaseTest{

    @Tag("UI")
    @Test
    void successfulRegistrationTest() {

        registrationPage.openPage()
                .setFirstName(testData.userName)
                .setlastName(testData.lastName)
                .setEmail(testData.userEmail)
                .setGender(testData.userGender)
                .setPhone(testData.numberPhone)
                .setBirtDate(testData.day, testData.month, testData.year)
                .setSubjects(testData.subject)
                .setHobbies(testData.hobbie)
                .setPicture(testData.file)
                .setAddress(testData.address)
                .setStateAndCity(testData.state, testData.city)
                .buttonClick();

        registrationPage.veryfyResultsModalAppears()
                .veryfyResult("Student Name", testData.userName + " " + testData.lastName)
                .veryfyResult("Student Email", testData.userEmail)
                .veryfyResult("Gender", testData.userGender)
                .veryfyResult("Mobile", testData.numberPhone)
                .veryfyResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year);
    }

}
