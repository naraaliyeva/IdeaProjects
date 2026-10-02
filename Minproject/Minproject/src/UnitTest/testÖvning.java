package UnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;



public class testÖvning {

    @Test
    public void firstTestCase() {

        String text = "some text";
        int actual= text.length();
        int expected=9;

        assertEquals(expected, actual);
    }


    @Test
    public void add() {

       Calculator calc= new Calculator (5,3);
        int expected = 5;
        int actual= calc.add();

        assertEquals(expected, actual);
    }

}
