import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test(description = "Description for test1SecondTest")
    public void test1SecondTest() {
        Assert.assertEquals(2, 4, "Two is not equal to four");
    }

    @Test(description = "Description for test2SecondTest")
    public void test2SecondTest() {
        Assert.assertEquals(2, 2);
    }

    @Test(description = "Description for test3SecondTest")
    public void test3SecondTest() {
        Assert.assertEquals(3, 3);
    }

    @Test(description = "Description for test5SecondTest")
    public void test5SecondTest() {
        Assert.assertEquals(5, 5);
    }

    @Test(description = "Description for test6SecondTest")
    public void test6SecondTest() {
        Assert.assertEquals(6, 6);
    }

    @Test(description = "Description for test7SecondTest")
    public void test7SecondTest() {
        Assert.assertEquals(7, 7);
    }

    @Test(description = "Description for test8SecondTest")
    public void test8SecondTest() {
        Assert.assertEquals(8, 8);
    }

}
