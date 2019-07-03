import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountSampleTest {

    @Disabled
    @Test
    void sexCheck() {
        DiscountSample sc = new DiscountSample();
        assertEquals(0.2, sc.sexCheck("f"), 0.0);
        assertEquals(0.1, sc.sexCheck("m"), 0.0);
    }

    @Test
    void testPriceCheck() {
        DiscountSample pc = new DiscountSample();
        assertTrue(pc.priceCheck(50000));
        assertFalse(pc.priceCheck(10000));
    }

    @Test
    public void testAgeCheck() {
        // fail("まだ実装されていません");
        DiscountSample ac = new DiscountSample();
        assertEquals(3000, ac.ageCheck(18));
        assertEquals(1000, ac.ageCheck(20));
    }

}