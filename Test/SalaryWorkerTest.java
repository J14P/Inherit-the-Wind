import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1, s2, s3;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000004", "Tom", "Wulf", "Mr.", 1950, (200000/(52*7*24)), 200000);
        s2 = new SalaryWorker("000005", "Jackson", "Pinchot", "Mr.", 2000, (500000/(52*7*24)), 500000);
        s3 = new SalaryWorker("000006", "Pamela", "Pinchot", "Mrs.", 1973, (1000000/(52*7*24)), 1000000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(3846.153846153846, s1.calculateWeeklyPay(45));
        assertEquals(9615.384615384615, s2.calculateWeeklyPay(41));
        assertEquals(19230.76923076923, s3.calculateWeeklyPay(48));
    }

}