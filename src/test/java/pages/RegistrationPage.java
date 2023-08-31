package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultModal registrationResultModal = new RegistrationResultModal();

    private final String TITLE_TEXT = "Student Registration Form";
    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput =  $("#userEmail"),
            genderInput = $("#genterWrapper"),
            phoneNumberInput = $("#userNumber"),
            dateofBirthDayInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureLoad = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#stateCity-wrapper"),
            cityInput = $("#stateCity-wrapper"),
            buttonClick = $("#submit");

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        return this;
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setlastName(String value){
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value){
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value){
        genderInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPhone(String value){
        phoneNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirtDate(String day, String mongth, String year){
        dateofBirthDayInput.click();
        calendarComponent.setDate(day, mongth, year );
        return this;
    }

    public RegistrationPage veryfyResultsModalAppears (){
        registrationResultModal.veryfyModalAppears();
        return this;
    }

    public RegistrationPage veryfyResult(String key, String value){
        registrationResultModal.veryfyResult(key, value);
        return this;
    }

    public RegistrationPage setSubjects (String value){
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies (String value){
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPicture (String file){
        pictureLoad.uploadFromClasspath(file);
        return this;
    }

    public RegistrationPage setAddress (String value){
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage setStateAndCity (String stateValue, String cityValue){
        $("#state").click();
        stateInput.$(byText(stateValue)).click();
        $("#city").click();
        $(cityInput).$(byText(cityValue)).click();
        return this;
    }
    public RegistrationPage buttonClick (){
        buttonClick.click();
        return this;
    }
}
