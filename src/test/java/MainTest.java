
import org.example.tax.IncomeTaxType;
import org.example.tax.ProgressiveTaxType;
import org.example.tax.VATaxType;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void incomeTaxTypeTest() {
        // given:
        IncomeTaxType tax = new IncomeTaxType();
        BigDecimal amount = new BigDecimal(107);
        BigDecimal expected = new BigDecimal(0);

        // when:
        BigDecimal result = tax.calculateTaxFor(amount);

        // then:
        assertEquals(expected, result);
    }

    @Test
    public void progressiveTaxTypeTest() {
        // given:
        ProgressiveTaxType tax = new ProgressiveTaxType();
        BigDecimal amount = new BigDecimal(107);
        BigDecimal expected = new BigDecimal("10.7");

        // when:
        BigDecimal result = tax.calculateTaxFor(amount);

        // then:
        assertEquals(expected, result);
    }

    @Test
    public void vATaxTypeTestTest() {
        // given:
        VATaxType tax = new VATaxType();
        BigDecimal amount = new BigDecimal(107);
        BigDecimal expected = new BigDecimal("19.26");

        // when:
        BigDecimal result = tax.calculateTaxFor(amount);

        // then:
        assertEquals(expected, result);
    }
}