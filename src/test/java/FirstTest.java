import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test(description = "Description for test1FirstTest")
    public void test1FirstTest() {
        Assert.assertEquals(1, 2, "Four is not equal to eight");
    }

    @Test(description = "Description for test1FirstTest")
    public void test2FirstTest() {
        Assert.assertEquals(2, 2, "Eight is not equal to eight");
    }

    @Test(description = "Description for test3FirstTest")
    public void test3FirstTest() {
        Assert.assertEquals(3, 3, "Eight is not equal to eight");
    }

    @Test(description = "Description for test4FirstTest")
    public void test4FirstTest() {
        Assert.assertEquals(4, 4, "Eight is not equal to eight");
    }

    @Test(description = "Description for test5FirstTest")
    public void test5FirstTest() {
        Assert.assertEquals(5, 5, "Eight is not equal to eight");
    }

}
