import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        validateEmail();
        validatePhoneNumber();
        validateDate();
        validateURL();
        validateCreditCard();
        validateZipCode();
        validateJavaIdentifier();
        validateHexColorCode();
        validateTime();
    }

    private static void validateEmail() {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String[] emails = {"test@example.com", "invalid_email", "user@domain"};

        Pattern pattern = Pattern.compile(emailRegex);

        System.out.println("Email Validation:");
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            boolean isValid = matcher.matches();
            System.out.println(email + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validatePhoneNumber() {
        String phoneRegex = "^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";
        String[] phoneNumbers = {"(123) 456-7890", "(456) 7890", "123-456-7890"};

        Pattern pattern = Pattern.compile(phoneRegex);

        System.out.println("Phone Number Validation:");
        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = pattern.matcher(phoneNumber);
            boolean isValid = matcher.matches();
            System.out.println(phoneNumber + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateDate() {
        String dateRegex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/\\d{4}$";
        String[] dates = {"01/31/2023", "15/12/2022", "12-31-2021"};

        Pattern pattern = Pattern.compile(dateRegex);

        System.out.println("Date Validation:");
        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            boolean isValid = matcher.matches();
            System.out.println(date + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateURL() {
        String urlRegex = "^(http|https)://([a-zA-Z0-9_-]+\\.)+[a-zA-Z]{2,6}(/[a-zA-Z0-9_\\-\\.~]+)*$";
        String[] urls = {"http://example.com", "https://www.domain", "ftp://invalid.url"};

        Pattern pattern = Pattern.compile(urlRegex);

        System.out.println("URL Validation:");
        for (String url : urls) {
            Matcher matcher = pattern.matcher(url);
            boolean isValid = matcher.matches();
            System.out.println(url + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateCreditCard() {
        String cardRegex = "^(\\d{4}[- ]){3}\\d{4}|\\d{16}$";
        String[] cardNumbers = {"1234-5678-9012-3456", "1234567890123456", "1234 5678 9012 3456"};

        Pattern pattern = Pattern.compile(cardRegex);

        System.out.println("Credit Card Validation:");
        for (String cardNumber : cardNumbers) {
            Matcher matcher = pattern.matcher(cardNumber);
            boolean isValid = matcher.matches();
            System.out.println(cardNumber + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateZipCode() {
        String zipRegex = "^\\d{5}(-\\d{4})?$";
        String[] zipCodes = {"12345", "98765-4321", "123456"};

        Pattern pattern = Pattern.compile(zipRegex);

        System.out.println("Zip Code Validation:");
        for (String zipCode : zipCodes) {
            Matcher matcher = pattern.matcher(zipCode);
            boolean isValid = matcher.matches();
            System.out.println(zipCode + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateJavaIdentifier() {
        String identifierRegex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";
        String[] identifiers = {"validIdentifier", "9invalid", "$pecial"};

        Pattern pattern = Pattern.compile(identifierRegex);

        System.out.println("Java Identifier Validation:");
        for (String identifier : identifiers) {
            Matcher matcher = pattern.matcher(identifier);
            boolean isValid = matcher.matches();
            System.out.println(identifier + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateHexColorCode() {
        String hexColorRegex = "^#[0-9a-fA-F]{6}$";
        String[] hexColors = {"#aabbcc", "#12345g", "ffffff"};

        Pattern pattern = Pattern.compile(hexColorRegex);

        System.out.println("Hex Color Code Validation:");
        for (String hexColor : hexColors) {
            Matcher matcher = pattern.matcher(hexColor);
            boolean isValid = matcher.matches();
            System.out.println(hexColor + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }

    private static void validateTime() {
        String timeRegex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        String[] times = {"12:34", "25:00", "09:61"};

        Pattern pattern = Pattern.compile(timeRegex);

        System.out.println("Time Validation:");
        for (String time : times) {
            Matcher matcher = pattern.matcher(time);
            boolean isValid = matcher.matches();
            System.out.println(time + " is " + (isValid ? "valid" : "invalid"));
        }
        System.out.println();
    }
}
