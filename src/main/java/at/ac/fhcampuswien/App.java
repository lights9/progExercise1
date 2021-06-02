package at.ac.fhcampuswien;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public boolean checkPassword(String password) {

        return password != null && passLength(password) && hasUpperAndLowerCase(password)
                && hasNumber(password) && hasSpecialCharacter(password) && hasNoFollowingNumber(password)
                && hasNoRepeatingNumbers(password);

    }

    public boolean passLength(String password) {
        return password.length() >= 8 && password.length() <= 25;

    }

    public boolean hasUpperAndLowerCase(String password) {
        return password.matches(".*[a-z].*") && password.matches(".*[A-Z].*");

    }

    public boolean hasNumber(String password) {
        return password.matches(".*[0-9].*");

    }

    public boolean hasSpecialCharacter(String password) {
        return password.matches(".*[()#$?!%/@].*");
    }

    public boolean hasNoFollowingNumber(String password) {
        return !password.contains("012") &&
                !password.contains("123") &&
                !password.contains("234") && !password.contains("345") &&
                !password.contains("456") && !password.contains("567") &&
                !password.contains("678") && !password.contains("789");

    }

    public boolean hasNoRepeatingNumbers(String password) {
        if (password == null) {
            return false;
        }
        char[] chars = password.toCharArray();

        char helper = 0;
        int count = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                if (helper == 0) {
                    helper = c;
                    count++;
                } else if (c == helper) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 3) {
                    return false;
                }
            } else {
                count = 0;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }

}
