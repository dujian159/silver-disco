import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    private Object object;

    public MyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置拦截");
        Object result = method.invoke(object,args);
        System.out.println("后置拦截");
        return result;
    }

    public static void main(String[] args) {
        String s = new String( "abc");
        Integer num = new Integer(123);
        MyTest myTest = new MyTest();
        myTest.setValue(1);
        changeObject(myTest);
        changeString(s);
        changeNum(num);
        System.out.println(s);
        System.out.println(num);
        System.out.println(myTest.getValue());
    }

    private static void changeObject(MyTest myTest) {
        myTest.setValue(1);
        System.out.println(myTest.getValue());
    }

    private static void changeNum(int num) {
        num = new Integer(456);
        System.out.println(num);
    }

    private static void changeString(String s) {
        s = new String("def");
        System.out.println(s);
    }
}
class MyTest{
    public void setValue(int value) {
        this.value = value;
    }

    int value;

    public int getValue() {
        return value;
    }
}