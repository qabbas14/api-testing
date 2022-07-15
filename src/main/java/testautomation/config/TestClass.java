package testautomation.config;

public class TestClass {

    public static void main(String[] str) {

        ConfigProvider instance1 = ConfigProvider.getApplicationConfigProvider();
        ConfigProvider instance2 = ConfigProvider.getApplicationConfigProvider();
        ConfigProvider instance3 = ConfigProvider.getApplicationConfigProvider();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

        //28b46423
   }
}
