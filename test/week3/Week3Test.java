package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(5,Week3.max(4,5));
        assertEquals(1,Week3.max(1,-4));
        assertEquals(10,Week3.max(10,4));
        assertEquals(9,Week3.max(9,2));
        assertEquals(3,Week3.max(3,2));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int a[]={1,4,2,3,6,8,2};
        int b[]={0,-2,-6,1,7,10};
        int c[]={100,2000,12,-1};
        int d[]={1,7,3,5,1};
        int e[]={4,0,5,7,8,2};
        assertEquals(1,Week3.minOfArray(a));
        assertEquals(-6,Week3.minOfArray(b));
        assertEquals(-1,Week3.minOfArray(c));
        assertEquals(1,Week3.minOfArray(d));
        assertEquals(0,Week3.minOfArray(e));

    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Bình Thường",Week3.calculateBMI(50, 1.60));
        assertEquals("Béo Phì",Week3.calculateBMI(60, 1.00));
        assertEquals("Bình Thường",Week3.calculateBMI(45, 1.52));
        assertEquals("Thiếu Cân",Week3.calculateBMI(40, 1.60));
        assertEquals("Thừa Cân",Week3.calculateBMI(70, 1.70));
    }
}
