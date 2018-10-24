import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ListProxy {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        List<String> listProxy = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("添加之前=====");
                Object result = method.invoke(list,args);
                System.out.println("添加之后=====");
                return result;
            }
        });
        listProxy.add("hello");
        System.out.println(list);
    }
}
