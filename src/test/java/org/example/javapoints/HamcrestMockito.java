package org.example.javapoints;

import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMockito {

    @Test
    public void hamcrestMockito_demo(){
        List<Integer> num= Arrays.asList(99,1,2,3,55);
        assertThat(num,hasSize(5));
        assertThat(num, hasItems(1,2));
        assertThat(num, everyItem(greaterThan(0)));
        assertThat(num, everyItem(lessThan(100)));

    }
}
