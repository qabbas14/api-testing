package b;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

    @Test(description = "Description for test1ThirdTest")
    public void test1ThirdTest() {
        Assert.assertEquals(2, 4, "Two is not equal to four");
    }

    @Test(description = "Description for test2ThirdTest")
    public void test2ThirdTest() {
        Assert.assertEquals(2, 2);
    }

    @Test(description = "Description for test3ThirdTest")
    public void test3ThirdTest() {
        Assert.assertEquals(3, 3);
    }

    @Test(description = "Description for test5ThirdTest")
    public void test5ThirdTest() {
        Assert.assertEquals(5, 5);
    }

    @Test(description = "Description for test6ThirdTest")
    public void test6ThirdTest() {
        Assert.assertEquals(6, 6);
    }

    @Test(description = "Description for test7ThirdTest")
    public void test7ThirdTest() {
        Assert.assertEquals(7, 7);
    }

    @Test(description = "Description for test8ThirdTest")
    public void test8ThirdTest() {
        Assert.assertEquals(8, 8);
    }

}
