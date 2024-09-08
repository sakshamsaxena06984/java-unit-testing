package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssertionExample {
    // Assertion : Validating actual result with expected result ..

    @Test
    public void Testing(){
        float f_actual=2f;
        Float f_expected=2.0f;
        Assertions.assertEquals(f_expected,f_actual);

        int arr_actual[]={1,2,3};
        int arr_expected[]={1,2,3};

        Assertions.assertArrayEquals(arr_expected,arr_expected);
        String str_actual="kk";
        String str_expected="kk";
        Assertions.assertSame(str_expected,str_actual);

        List<Integer> list1= Arrays.asList(1,2,3);
        List<Integer> list2= Arrays.asList(1,2,3);

        Assertions.assertIterableEquals(list1,list2);

        Assertions.assertThrows(RuntimeException.class, () ->{
            throw new RuntimeException("This is testing exception");
        });
    }
}
