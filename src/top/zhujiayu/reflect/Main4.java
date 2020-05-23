package top.zhujiayu.reflect;

import top.zhujiayu.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther zjy
 * @date 2020/5/23
 *
 * 获取成员方法和类名
 **/

public class Main4 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<Student> studentClass = Student.class;

        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("---------------");
        Student student = new Student("zhangsan", 18, 9, 1001);
        Method study = studentClass.getMethod("study", null);
        System.out.println(study);
        study.invoke(student);
        Method study2 = studentClass.getMethod("study", String.class);
        System.out.println(study2);
        study2.invoke(student, "c++");

        System.out.println("------------");
        String name = studentClass.getName();
        System.out.println(name);
    }
}
