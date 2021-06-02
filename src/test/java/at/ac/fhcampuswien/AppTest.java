package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    @Test
    @DisplayName("Password length NOT enough!")
    public void shortPassword() {
        //check if password is shorter than 8 characters
        App a = new App();
        boolean result = a.checkPassword("Short3#");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password TOO long!")
    public void longPassword() {
        //check if password is longer than 25 characters
        App a = new App();
        boolean result = a.checkPassword("PassWORDisTOooLong23%14637");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has both lower and uppercase")
    public void checkUpAndLow() {
        App b = new App();
        boolean result = b.checkPassword("Password43!");
        assertTrue(result);
    }

    @Test
    @DisplayName("Password has only lowercase")
    public void checkLowerOnly() {
        App b = new App();
        boolean result = b.checkPassword("password43!");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has only uppercase")
    public void checkUpperOnly() {
        App b = new App();
        boolean result = b.checkPassword("PASSWORD43!");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has no numbers in it")
    public void hasNoNumbers() {
        App a = new App();
        //password consists of no digits
        boolean result = a.checkPassword("Password??");
        //assertion
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has numbers in it")
    public void hasNumbers() {
        App a = new App();
        //password consists of digits
        boolean result = a.checkPassword("Password??3");
        //assertion
        assertTrue(result);
    }


    @Test
    @DisplayName("Password has special character")
    public void checkHasSpecialCharacterTrue() {
        App c = new App();
        boolean result = c.checkPassword("Password4##");
        assertTrue(result);
    }

    @Test
    @DisplayName("Password has NO special characters")
    public void checkHasSpecialCharacterFalse() {
        App c = new App();
        boolean result = c.checkPassword("Password40");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has NO following numbers!")
    public void checkHasNoFollowingNumTrue() {
        App d = new App();
        boolean result = d.checkPassword("Password13#");
        assertTrue(result);
    }

    @Test
    @DisplayName("Password has following numbers!")
    public void checkHasNoFollowingNumFalse() {
        App d = new App();
        boolean result = d.checkPassword("Password123#");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has 3 identical numbers in a row!")
    public void checkHas3RepeatingNum() {
        App d = new App();
        boolean result = d.checkPassword("PassWord111#");
        assertTrue(result);
    }


    @Test
    @DisplayName("Password has NO repeating numbers!")
    public void checkHasNoRepeatingNumTrue() {
        App d = new App();
        boolean result = d.checkPassword("Password11#");
        assertTrue(result);
    }

    @Test
    @DisplayName("Password has REPEATING numbers!")
    public void checkHasNoRepeatingNumFalse() {
        App d = new App();
        boolean result = d.checkPassword("Password1111#");
        assertFalse(result);
    }


    @Test
    @DisplayName("There is no input!")
    public void checkPassInput() {
        App d = new App();
        boolean result = d.checkPassword(" ");
        assertFalse(result);
    }


}













