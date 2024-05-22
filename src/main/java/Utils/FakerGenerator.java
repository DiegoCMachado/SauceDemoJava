package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {

    private static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getPostalCode(){
        return faker.address().zipCode();
    }
}
