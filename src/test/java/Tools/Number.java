package Tools;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Number {
    public static String RamdoString(int value) {
        String generatedString = RandomStringUtils.randomAlphanumeric(value);
        System.out.println(generatedString);
        return generatedString;

    }

    public static String RamdoNumber(int value) {
        String ramdo = "";
        ramdo = RandomStringUtils.randomNumeric(value);
        return ramdo;
    }

    public static String RamdoCharSpecial(String specialChar, int value) {
        String ramdo = "";
        ramdo = RandomStringUtils.random(value, specialChar);
        return ramdo;
    }



}
