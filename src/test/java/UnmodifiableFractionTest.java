import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

class UnmodifiableFractionTest {

    @Test
    @Tag("unmodifiableFraction")
    void unmodifiableFractionTest() {
        FractionImplementation fractionImplementation = new FractionImplementation(45,65);
        assertEquals(fractionImplementation.getNumerator(),45);
        assertEquals(fractionImplementation.getDenominator(),65);

        UnmodifiableFraction unmodifiableFraction = new UnmodifiableFraction(fractionImplementation);

        assertThrows(UnsupportedOperationException.class, () -> {
            unmodifiableFraction.setDenominator(34);
            unmodifiableFraction.setNumerator(23);
        });


    }
}