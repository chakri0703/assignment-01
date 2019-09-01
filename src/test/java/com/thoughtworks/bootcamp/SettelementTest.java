package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SettelementTest {

    @Test
    void givenEmptyBillToSettlement_thenFinalSettlement_shouldReturnZero(){
       Friend friend=new Friend();
       Bill billSettlement=new Bill();

       Assertions.assertEquals(0.0,billSettlement.settle());
    }
}
