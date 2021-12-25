import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearTest {

    @org.junit.jupiter.api.Test
    void calculate1() {
    assertEquals(Linear.Calculate1(-3, 7 ,12), -9);
    }

    @Test
    void calculate2Correct() {
        double result = Linear.Calculate2(7,12,6);
        System.out.println(result);
        assertTrue(result>-2056&& result<-2055); //Mathlab говорит -2055,874232...
    }

    //Проверка на деление на 0
    @org.junit.jupiter.api.Test
    void calculate2IncorrectA() {
        RuntimeException thrown = assertThrows(RuntimeException.class,()-> Linear.Calculate2(0, 5.5,7)); //Лямбда-выражение!
        assertTrue(thrown.getMessage().contains("Division by 0"));
    }

    @org.junit.jupiter.api.Test
    void calculate2IncorrectRoot() {
        RuntimeException thrown = assertThrows(RuntimeException.class,()-> Linear.Calculate2(-8, 2.5,12)); //Лямбда-выражение!
        assertTrue(thrown.getMessage().contains("b^2+4ac < 0"));
    }

    @org.junit.jupiter.api.Test
    void calculate3() {

    }

    @org.junit.jupiter.api.Test
    void calculate4() {
        double result = Linear.Calculate4(123.45678);
        assertEquals(456.123, result);
    }
}