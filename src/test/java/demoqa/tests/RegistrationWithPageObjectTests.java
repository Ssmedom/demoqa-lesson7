package demoqa.tests;

import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectTests extends BaseTest{

    @Test
    void successfulRegistrationTest() {
        String userName = "Igor";
        String lastName = "Akinfeev";
        String email = "IgorAKIII@ya.ru";
        String gender = "Male";
        String numberPhone = "8889991234";
        String day = "03";
        String month = "January";
        String year = "2000";
        String subject = "Chemistry";
        String hobbie = "Sports";
        String file = "1.png ";
        String address = "Some address 222";
        String state = "NCR";
        String city = "Delhi";

        registrationPage.openPage()
                .setFirstName(userName)
                .setlastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(numberPhone)
                .setBirtDate(day, month, year)
                .setSubjects(subject)
                .setHobbies(hobbie)
                .setPicture(file)
                .setAddress(address)
                .setStateAndCity(state, city)
                .buttonClick();

        registrationPage.veryfyResultsModalAppears()
                .veryfyResult("Student Name", userName + " " + lastName)
                .veryfyResult("Student Email", email)
                .veryfyResult("Gender", gender)
                .veryfyResult("Mobile", numberPhone)
                .veryfyResult("Date of Birth", day + " " + month + "," + year);
    }

}
