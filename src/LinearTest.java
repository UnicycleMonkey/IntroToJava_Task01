import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class LinearTest {

    @org.junit.jupiter.api.Test
    void calculate1() {
    assertEquals(Linear.Calculate1(-3, 7 ,12), -9);
    }

    @Test
    void calculate2Correct(){
        double result = Linear.Calculate2(7,12,6);
        assertTrue(result>-2056&& result<-2055); //Mathlab говорит -2055,874232...
    }

    //Проверка на деление на 0
    @org.junit.jupiter.api.Test
    void calculate2IncorrectA() {
        RuntimeException thrown = assertThrows(RuntimeException.class,()-> Linear.Calculate2(0, 5.5,7)); //Лямбда-выражение!
        assertTrue(thrown.getMessage().contains("Division by 0"));
    }

    //Подкоренное выражение <0
    @org.junit.jupiter.api.Test
    void calculate2IncorrectRoot() {
        RuntimeException thrown = assertThrows(RuntimeException.class,()-> Linear.Calculate2(-8, 2.5,12)); //Лямбда-выражение!
        assertTrue(thrown.getMessage().contains("b^2+4ac < 0"));
    }

    @org.junit.jupiter.api.Test
    void calculate3() {
        double x = Math.PI/2;
        double y =Math.PI/3;
        double p1, p2, p3; //Числитель, знаменатель и тангенс произведения соответственно, разбито для читаемости
        p1 = Math.sin(x)+Math.cos(y);
        p2 = Math.cos(x)-Math.sin(y);
        p3 = Math.tan(x*y);
        assertEquals((p1/p2)*p3, Linear.Calculate3(x,y));

    }

    @org.junit.jupiter.api.Test
    void calculate4() {
        double result = Linear.Calculate4(123.45678);
        assertEquals(456.123, result);
    }

    //1 час ровно
    @Test
    void calculate5SingleHour() {
        LocalTime result = Linear.Calculate5(3600);
        LocalTime testValue = LocalTime.of (1,0,0);
        assertEquals(testValue,result);
    }

    //Произвольное значение someValue
    @Test
    void calculate5SomeValue() {
        int someValue = 10000;
        int hours = someValue/3600; //целочисленное деление
        int minutes = (someValue/60)%60; //отбрасываем секунды делением, остаток в минуты
        int secunds = someValue%60;
        LocalTime result = Linear.Calculate5(someValue);
        LocalTime testValue = LocalTime.of (hours,minutes,secunds);
        assertEquals(testValue,result);
    }

    //Принадлежность точек (0,0), (-8,1.5), (1, 2.5)
    @Test
    void calculate6Point() {
        assertTrue(Linear.Calculate6(0,0));
        assertFalse(Linear.Calculate6(-8, 1.5));
        assertTrue(Linear.Calculate6(1,2.5));
    }
}