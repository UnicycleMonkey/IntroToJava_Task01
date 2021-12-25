import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchedTest {

    @Test
    void calculate1() {
        assertTrue(Branched.Calculate1(-100, -80).contains("не существует"));
        assertTrue(Branched.Calculate1(20, 80).contains("не прямоугольный"));
        assertTrue(Branched.Calculate1(45, 45).contains("треугольник прямоугольный"));
    }

    @Test
    void calculate2() {
        assertEquals(Branched.Calculate2(2,5,7,-4.2), 2);
        assertEquals(Branched.Calculate2(-1,-3.15,85,0.2), 0.2);
        assertEquals(Branched.Calculate2(1001,85000.5,Math.PI,-285), 1001);
    }

    @Test
    void calculate3() {
        assertTrue(Branched.Calculate3(-2,-5,-2,8,-2,84));
        assertFalse(Branched.Calculate3(-2,-5,-2,8,-2.2,84));
        assertTrue(Branched.Calculate3(-1,-2,4,8,-5,-10));
        assertFalse(Branched.Calculate3(-1,-2,4,8,-5,-10.001));
    }

    @Test
    void calculate4() {
        assertTrue(Branched.Calculate4(20,10,80,20,15));
        assertFalse(Branched.Calculate4(20,10,80,10,15));
    }

    @Test
    void calculate5() {
        assertEquals(Branched.Calculate5(1), 7);
        assertEquals(Branched.Calculate5(3), 9);
        assertEquals(Branched.Calculate5(0), 9);
        assertEquals(Branched.Calculate5(-1), 13);
        assertEquals(Branched.Calculate5(4), 1./70);
        assertEquals(Branched.Calculate5(10), 1./1006);
    }
}