package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {




    @Test
    @DisplayName("Password is valid!")
    public void checkPasswordValid1() {
        App a = new App();
        boolean result = a.checkPassword("Hello34!Hi");
        //assertion
        assertTrue(result);
    }

    @Test
    @DisplayName("Password is valid!")
    public void checkPasswordValid2() {
        App a = new App();
        boolean result = a.checkPassword("HeLLO45!/?");
        //assertion
        assertTrue(result);
    }

    @Test
    @DisplayName("Password is NOT valid!")
    public void checkPasswordValid3() {
        App a = new App();
        boolean result = a.checkPassword("Short3#");
        //assertion
        assertFalse(result);
    }



    //check password length
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
    @DisplayName("Password has no uppercase letters! ")
    public void hasNoUpperCase() {
        App a = new App();
        //password consists of only lowercase letters
        boolean result = a.checkPassword("password3%");
        //assertion
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has no lowercase letters! ")
    public void hasNoLowerCase() {
        App a = new App();
        //password consists of only uppercase letters
        boolean result = a.checkPassword("PASSWORD3%");
        //assertion
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has both lower and uppercase")
    public void checkUpAndLow() {
        App b = new App();
        boolean result = b.hasUpperAndLowerCase("Password43!");
        assertTrue(result);
    }

    @Test
    public void checkLowerOnly() {
        App b = new App();
        boolean result = b.hasUpperAndLowerCase("password43!");
        assertFalse(result);
    }

    @Test
    public void checkUpperOnly() {
        App b = new App();
        boolean result = b.hasUpperAndLowerCase("PASSWORD43!");
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has no numbers in it")
    public void hasNoNumbers() {
        App a = new App();
        //password consists of no digits
        boolean result = a.hasNumber("Password??");
        //assertion
        assertFalse(result);
    }

    @Test
    @DisplayName("Password has numbers in it")
    public void hasNumbers() {
        App a = new App();
        //password consists of digits
        boolean result = a.hasNumber("Password??3");
        //assertion
        assertTrue(result);
    }

    @Test
    public void checkHasNumberTrue() {
        App c = new App();
        boolean result = c.checkPassword("Password4##");
        assertTrue(result);
    }

    @Test
    public void checkHasNumberFalse() {
        App c = new App();
        boolean result = c.checkPassword("Password&##");
        assertFalse(result);
    }

    @Test
    public void checkHasSpecialCharacterTrue() {
        App c = new App();
        boolean result = c.checkPassword("Password4##");
        assertTrue(result);
    }

    @Test
    public void checkHasSpecialCharacterFalse() {
        App c = new App();
        boolean result = c.checkPassword("Password40");
        assertFalse(result);
    }

    @Test
    public void checkHasNoFollowingNumTrue() {
        App d = new App();
        boolean result = d.checkPassword("Password13#");
        assertTrue(result);
    }

    @Test
    public void checkHasNoFollowingNumFalse() {
        App d = new App();
        boolean result = d.checkPassword("Password123#");
        assertFalse(result);
    }






    @Test
    @DisplayName("Password has no repeating numbers!")
    public void checkHasNoRepeatingNumTrue() {
        App d = new App();
        boolean result = d.checkPassword("Password11##?");
        assertTrue(result);
    }

    @Test
    @DisplayName("Password has no repeating numbers!")
    public void checkHasNoRepeatingNumFalse() {
        App d = new App();
        boolean result = d.hasNoRepeatingNumbers("Password444#");
        assertFalse(result);
    }
    @Test
    public void checkHasNoRepeatingNumFalse2() {
        App d = new App();
        boolean result = d.hasNoRepeatingNumbers("Password1111#");
        assertFalse(result);
    }


}













