import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplementationTest {


    @Test
    @Tag("fractionImplementation")
    public void fractionImplementationTest() {
        FractionImplementation fractionImplementation = new FractionImplementation(34,56);

        assertEquals(fractionImplementation.getNumerator(),34);
        assertEquals(fractionImplementation.getDenominator(),56);

        fractionImplementation.setDenominator(76);
        fractionImplementation.setNumerator(87);

        assertEquals(fractionImplementation.getDenominator(),76);
        assertEquals(fractionImplementation.getNumerator(),87);


    }
}