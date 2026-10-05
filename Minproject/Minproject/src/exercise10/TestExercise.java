package exercise10;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise {


    @Test
    public void firstTestCase() {

        // Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        // Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testLessThan8Characters() {

        // Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        // Act
        boolean actual = pass.check("pass");

        //Assert
        assertEquals(expected, actual);

    }

}