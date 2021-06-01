package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void checkPassLength1() {
        App a = new App();
        boolean result = a.passLength("1234567");
        assertFalse(result);
    }

    @Test
    public void checkPassLength2() {
        App a = new App();
        boolean result = a.passLength("12345678");
        assertTrue(result);
    }

    @Test
    public void shortPassword() {
        //check if password is shorter than 8 characters
        App a = new App();
        boolean result = a.checkPassword("Short3#");
        assertFalse(result);
    }

    @Test
    public void longPassword() {
        //check if password is longer than 25 characters
        App a = new App();
        boolean result = a.checkPassword("PassWORDisTOooLong23%14637");
        assertFalse(result);
    }


    @Test
    public void hasNoUpperCase() {
        App a = new App();
        //password consists of only lowercase letters
        boolean result = a.hasUpperAndLowerCase("password3%");
        //assertion
        assertFalse(result);
    }

    @Test
    public void hasNoLowerCase() {
        App a = new App();
        //password consists of only uppercase letters
        boolean result = a.hasUpperAndLowerCase("PASSWORD3%");
        //assertion
        assertFalse(result);
    }

    @Test
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
    public void hasNoNumbers() {
        App a = new App();
        //password consists of no digits
        boolean result = a.hasNumber("Password??");
        //assertion
        assertFalse(result);
    }

    @Test
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
        boolean result = c.hasNumber("Password4##");
        assertTrue(result);
    }

    @Test
    public void checkHasNumberFalse() {
        App c = new App();
        boolean result = c.hasNumber("Password&##");
        assertFalse(result);
    }

    @Test
    public void checkHasSpecialCharacterTrue() {
        App c = new App();
        boolean result = c.hasSpecialCharacter("Password4##");
        assertTrue(result);
    }

    @Test
    public void checkHasSpecialCharacterFalse() {
        App c = new App();
        boolean result = c.hasSpecialCharacter("Password40");
        assertFalse(result);
    }

    @Test
    public void checkHasNoFollowingNumTrue() {
        App d = new App();
        boolean result = d.hasNoFollowingNumber("Password13#");
        assertTrue(result);
    }

    @Test
    public void checkHasNoFollowingNumFalse() {
        App d = new App();
        boolean result = d.hasNoFollowingNumber("Password123#");
        assertFalse(result);
    }



    @Test
    public void checkHasNoRepeatingNumTrue() {
        App d = new App();
        boolean result = d.hasNoRepeatingNumbers("Password1#?");
        assertTrue(result);
    }


}













