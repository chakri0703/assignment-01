package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SettelementTest {

    @Test
    void givenEmptyBillToSettlement_thenFinalSettlement_shouldReturnZero(){
       Friend friend=new Friend();
       Bill billSettlement=new Bill(0.0);

       Assertions.assertEquals(0.0,billSettlement.settle());
    }
    @Test
    void givenOneBillToSettle_thenFinalSettlement_shouldReturnOne(){
        Friend friend=new Friend();
        Bill billSettlement=new Bill(1.0);

        Assertions.assertEquals(1.0,billSettlement.settle());
    }
}
