package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SettelementTest {
    @Test
    void givenZeroBillToSettlement_thenFinalSettlement_shouldReturnZero(){
        List list=new ArrayList<Friend>();
       Friend friend=new Friend();

       Bill billSettlement=new Bill(0.0,list);

       Assertions.assertEquals(0.0,billSettlement.settle());
    }
    @Test
    void givenOneBillToSettle_thenFinalSettlement_shouldReturnOne(){
        List list=new ArrayList<Friend>();
        Friend friend=new Friend();

        Bill billSettlement=new Bill(1.0,list);

        Assertions.assertEquals(1.0,billSettlement.settle());
    }

    @Test
    void givenEmptyListToSettle_thenFinalSettlement_shouldReturnAmount(){
        List list=new ArrayList<Friend>();
        Friend friend=new Friend();
        Bill billSettlement=new Bill(1.0,  list );
        Assertions.assertEquals(1.0,billSettlement.settle());
    }

}
