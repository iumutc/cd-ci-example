import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void add() {
        int a = 5;
        int b = 7;
        calculator calc = new calculator();
        int actualTotal = calc.add(a,b);
        assertEquals(12,actualTotal);
    }

    @Test
    void sub() {
        int a = 45;
        int b = 34;
        calculator calc = new calculator();
        int actualSub = calc.sub(a,b);
        assertEquals(11,actualSub);
    }
}