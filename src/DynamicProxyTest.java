import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyHandler myHandler = new MyHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(),myHandler);
        userServiceProxy.save();
    }
}
