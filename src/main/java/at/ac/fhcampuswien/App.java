package at.ac.fhcampuswien;


public class App {

    public boolean checkPassword(String password) {
     /*   Length of password should be from 8-25 characters,
        password should consist of both lower and uppercase letter,
          password should have number, a special character in it,
        password should have no following numbers, and number can't repeat itself in a row...*/


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
     /*   [1]-[9]
        {4,} matches the previous token between 4 and unlimited times, as many times as possible, giving back as needed (greedy)
        1 matches the character 1 literally (case sensitive)
     . matches any character (except for line terminators)
     * matches the previous token between zero and unlimited times,
      as many times as possible, giving back as needed (greedy)*/


        //return password.matches(("\\d{0,3}"));
        if (password.matches(".*[1]{4,}.*") ||
                password.matches(".*[2]{4,}.*") ||
                password.matches(".*[3]{4,}.*") ||
                password.matches(".*[4]{4,}.*") || password.matches(".*[5]{4,}.*") ||
                password.matches(".*[6]{4,}.*") ||
                password.matches(".*[7]{4,}.*") || password.matches(".*[8]{4,}.*") ||
                password.matches(".*[9]{4,}.*") ||
                password.matches(".*[0]{4,}.*")) {
            return false;
        } else {
            return true;
        }


    }

    public static void main(String[] args) {

    }


}







