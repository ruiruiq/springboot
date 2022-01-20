import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class classlearning {

    private String name = "Tom";
    //公有属性
    public int age = 18;
    //构造方法
    public classlearning() {
    }
    //私有方法
    private void say(){
        System.out.println("private say()...");
    }
    //公有方法
    public void work(){
        System.out.println("public work()...");
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        classlearning t1 = new classlearning();
        Class c2 = t1.getClass();
        Field f = c2.getDeclaredField("name");

        Object p2 =  c2.newInstance();
//将 p2 对象的  f2 属性赋值为 Bob，f2 属性即为 私有属性 name
        f.set(p2,"Bob");
//使用反射机制可以打破封装性，导致了java对象的属性不安全。
        System.out.println(f.get(p2)); //Bob
    }
}