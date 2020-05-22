package top.zhujiayu;

/**
 *  @auther zjy
 *  @date 2020/5/22
 *
 *  获取class对象的方式：
 *  1. Class.forName("全类名")：多用于配置文件
 *  2. 类名.class 多用与传参
 *  3. 对象.getclass() 多用于对象
 *  同一个字节码文件(*.class)在一次程序运行的过程中这会被加载一次，不论那种方式获取的class对象都是同一个
 *
 */

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        //1.
        Class<?> cls = Class.forName("top.zhujiayu.Person");
        System.out.println(cls);

        //2.
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);


        System.out.println(cls == cls2);//t
        System.out.println(cls == cls3);//t
        System.out.println(cls3 == cls2);//t
    }

}

