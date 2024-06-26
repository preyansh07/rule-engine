package ai.alphastream.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTypeValidationUtil {

    public static boolean isPercentage(String value) {
        System.out.println(value);
        if (value == null || value.isEmpty()) {
            return false;
        }

        String regex = "\\d+(?:\\.\\d+)?%";
        String stringentRegex = "/\\b(?<!-)(?<!\\.)(?!0+(?:\\.0+)?%)(?:\\d|[1-9]\\d|100)(?:(?<!100)\\.\\d+)?%/g";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        System.out.println(Pattern.compile(stringentRegex).matcher(value).find());
        return matcher.matches();
    }

    public static boolean isMoney(String value) {
        System.out.println(value);
        if (value == null || value.isEmpty()) {
            return false;
        }

        String regex = "\\d+(?:\\.\\d+)?%";
        String stringentRegex = "^($|€)(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$";
        Pattern pattern = Pattern.compile(stringentRegex);
        Matcher matcher = pattern.matcher(value);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
//        System.out.println(Pattern.compile(stringentRegex).matcher(value).find());
        return matcher.matches();
    }

    public  static boolean comparePercentageValues(String value1, String value2) {
        return false;
    }
}
