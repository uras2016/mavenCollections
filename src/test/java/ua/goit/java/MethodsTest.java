package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MethodsTest {
Methods methods = new Methods();
    ArrayList<Long> list = new ArrayList<>();
    @Test
    public void testGetAverageTime() throws Exception {
        list.add(10L);
        list.add(15L);
        list.add(98L);
        list.add(1L);
        list.add(14L);

        Long a = methods.getAverageTime(list);
        Assert.assertEquals(27.0, a, 0);
    }
}