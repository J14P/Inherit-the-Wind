import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Joe", "Johnson", "Mr.", 1995, 22.25);
        w2 = new Worker("000002", "Susan", "Bee", "Mrs.", 1965, 21.50);
        w3 = new Worker("000003", "Emily", "Pots", "Ms.", 1999, 14.35);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1056.875, w1.calculateWeeklyPay(45));
        assertEquals(752.5, w2.calculateWeeklyPay(35));
        assertEquals(890.0, w1.calculateWeeklyPay(40));
    }


}