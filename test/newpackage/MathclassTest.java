/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathclassTest {

    private int a;
    private int b;
    private int c;

    public MathclassTest(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    @Parameters
    public static Object[] params() {
        return new Object[][]{
            {2, 2, 4},
            {5, 6, 11},
            {5, 6, 12},
            {5, 67, 72},
            {-5, 6, 1}};
    }

    @Test
    public void testGetSum() {
        Mathclass instance = new Mathclass(a, b);
        int expResult = c;
        int result = instance.getSum();
        assertThat(result, is(expResult));

    }
}
