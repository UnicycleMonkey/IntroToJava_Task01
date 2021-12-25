import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycledTest {

    @Test
    void calculate1() {
        assertEquals(Cycled.Calculate1(1),1);
        assertEquals(Cycled.Calculate1(2),3);
        assertEquals(Cycled.Calculate1(3),6);
        assertEquals(Cycled.Calculate1(4),10);
    }

    @Test
    void calculate2() {
        double[] array = Cycled.Calculate2(1,5,1);
        assertEquals(array[0], -1);
        assertEquals(array[1], -2);
        assertEquals(array[2], 3);
        assertEquals(array[3], 4);
        assertEquals(array[4], 5);
        array = Cycled.Calculate2(-1,-5.5,1);
        assertEquals(array[0], 5.5);
        assertEquals(array[1], 4.5);
        assertEquals(array[2], 3.5);
        assertEquals(array[3], 2.5);
        assertEquals(array[4], 1.5);
    }

    @Test
    void calculate3() {
        assertEquals(Cycled.Calculate3(), 338350);
    }
}