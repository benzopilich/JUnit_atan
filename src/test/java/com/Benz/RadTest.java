package com.Benz;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;
class RadTest {

    @Test
    void arctan_d1() {
       double x=-0.99;
       int k=10;
       Rad Calc = new Rad(x, k);
       double res=Calc.Arctan_d();
       BigDecimal res_b=new BigDecimal(res);
       res_b=res_b.setScale(k, RoundingMode.HALF_UP);
       BigDecimal LongRes1= new BigDecimal(Math.atan(x));
       LongRes1=LongRes1.setScale(k, RoundingMode.HALF_UP);
       assertEquals(LongRes1,res_b);
    }

    @Test
    void arctan_d2() {
        double x=0.99;
        int k=10;
        Rad Calc = new Rad(x, k);
        double res=Calc.Arctan_d();
        BigDecimal res_b=new BigDecimal(res);
        res_b=res_b.setScale(k, RoundingMode.HALF_UP);
        BigDecimal LongRes1= new BigDecimal(Math.atan(x));
        LongRes1=LongRes1.setScale(k, RoundingMode.HALF_UP);
        assertEquals(LongRes1,res_b);
    }

    @Test
    void arctan_Bd1() {
        double x=-0.99;
        int k=10;
        Rad Calc = new Rad(x, k);
        BigDecimal res=Calc.Arctan_Bd();
        BigDecimal LongRes1= new BigDecimal(Math.atan(x));
        LongRes1=LongRes1.setScale(k, RoundingMode.HALF_UP);
        assertEquals(LongRes1,res);
    }

    @Test
    void arctan_Bd2() {
        double x=0.99;
        int k=10;
        Rad Calc = new Rad(x, k);
        BigDecimal res=Calc.Arctan_Bd();
        BigDecimal LongRes1= new BigDecimal(Math.atan(x));
        LongRes1=LongRes1.setScale(k, RoundingMode.HALF_UP);
        assertEquals(LongRes1,res);
    }
}