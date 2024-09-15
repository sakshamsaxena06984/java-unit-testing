package org.example.javapoints;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 * BDD : Behavior Driven Development..
 */
public class BDDTest {
    @Test
    public void bdd_test(){
        List<String> mockList=mock(List.class);
        given(mockList.get(Mockito.anyInt())).willReturn("BDD");
        String result= mockList.get(0);
        assertThat(result, is("BDD"));

    }
}
