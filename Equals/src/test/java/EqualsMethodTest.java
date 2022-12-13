import org.junit.Assert;
import org.junit.Test;

public class EqualsMethodTest {

    /**
     * An object should be equal to itself.
     */
    @Test
    public void implementEqualsMethodTest1(){
        SampleClassA sample1 = new SampleClassA();
        sample1.a = 1;
        sample1.b = true;
        Assert.assertTrue(sample1.equals(sample1));
    }

    /**
     * An object should be equal to an object which is exactly equivalent to it.
     */
    @Test
    public void implementEqualsMethodTest2(){
        SampleClassA sample1 = new SampleClassA();
        sample1.a = 3;
        sample1.b = true;
        SampleClassA sample2 = new SampleClassA();
        sample2.a = 3;
        sample2.b = true;
        Assert.assertTrue(sample1.equals(sample2));
    }

    /**
     * An object should not be equal to an object which has a differing value (b)
     */
    @Test
    public void implementEqualsMethodTest3(){
        SampleClassA sample1 = new SampleClassA();
        sample1.a = 4;
        sample1.b = true;
        SampleClassA sample2 = new SampleClassA();
        sample2.a = 4;
        sample2.b = false;
        Assert.assertFalse(sample1.equals(sample2));
    }
    /**
     * An object should not be equal to an object which has a differing value (a)
     */
    @Test
    public void implementEqualsMethodTest4(){
        SampleClassA sample1 = new SampleClassA();
        sample1.a = 1;
        sample1.b = true;
        SampleClassA sample2 = new SampleClassA();
        sample2.a = 5;
        sample2.b = true;
        Assert.assertFalse(sample1.equals(sample2));
    }
    /**
     * An object should be equal to an object which is exactly equivalent to it.
     */
    @Test
    public void implementEqualsMethodTest5(){
        SampleClassA sample1 = new SampleClassA();
        sample1.a = 7;
        sample1.b = false;
        SampleClassA sample2 = new SampleClassA();
        sample2.a = 7;
        sample2.b = false;
        Assert.assertTrue(sample1.equals(sample2));
    }
}