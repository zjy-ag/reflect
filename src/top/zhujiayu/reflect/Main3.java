package top.zhujiayu.reflect;

import top.zhujiayu.Student;

import javax.xml.transform.Source;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @auther zjy
 * @date 2020/5/23
 *
 * 获取构造方法
 **/

public class Main3 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Student> studentClass = Student.class;

        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("--------------");
        Constructor<Student> constructor = studentClass.getConstructor(String.class, int.class, int.class, int.class);
        System.out.println(constructor);
        Student student = constructor.newInstance("lisi", 19, 8, 1006);
        System.out.println(student.toString());
        System.out.println("--------------");
        //使用无参构造器有更简便的方法
        Student student1 = studentClass.newInstance();
        System.out.println(student1);
    }
}