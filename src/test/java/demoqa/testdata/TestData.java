
package demoqa.testdata;


import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    public String
            userName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = getRandomValue("Male", "Female", "Other"),
            numberPhone = String.valueOf(faker.number().numberBetween(9041111111L, 9879999999L)),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = getRandomValue("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            year = String.valueOf(faker.number().numberBetween(1900, 2022)),
            subject = getRandomValue("Arts", "Maths", "English", "Chemistry"),
            hobbie = getRandomValue("Sports", "Reading", "Music"),
            file = "1.png ",
            address = faker.address().fullAddress(),
            state = getRandomValue("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = cityGenerator(state);

    private String getRandomValue(String...value){
        return faker.options().option(value);
    }

    private String cityGenerator(String state){
        String city = null;
        if(state.equals("NCR")){
            city = faker.options().option("Delhi", "Gurgaon", "Noida");
        }

        else if(state.equals("Uttar Pradesh")){
            city = faker.options().option("Agra", "Lucknow", "Merrut");
        }

        else if(state.equals("Haryana")){
            city = faker.options().option("Karnal", "Panipat");
        }

        else if(state.equals("Rajasthan")){
            city = faker.options().option("Jaipur", "JaiselMer");
        }

        return city;
    }


}
