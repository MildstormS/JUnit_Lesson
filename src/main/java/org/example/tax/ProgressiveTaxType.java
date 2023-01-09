package org.example.tax;

import org.example.TaxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal bigDecimal = new BigDecimal("100000.00");
        if ((amount.compareTo(bigDecimal)) < 0) {
            return amount.multiply(BigDecimal.valueOf(0.10));
        } else {
            return amount.multiply(BigDecimal.valueOf(0.15));
        }
    }

}
