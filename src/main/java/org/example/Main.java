package org.example;

import org.example.tax.IncomeTaxType;
import org.example.tax.ProgressiveTaxType;
import org.example.tax.VATaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal(107), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(107), new VATaxType(), taxService),
                new Bill(new BigDecimal(107), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(150000), new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}

