package top.zhujiayu.reflect;

import top.zhujiayu.Person;
import top.zhujiayu.Student;

import java.lang.reflect.Field;

/**
 * @auther zjy
 * @date 2020/5/23
 *
 * 获取成员变量
 **/

public class Main2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class cls = Student.class;

        Field[] fields = cls.getFields();//获取包括继承的所有public成员变量
        Field[] declaredFields = cls.getDeclaredFields();//获取不包括继承的所有成员变量

        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------------");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("--------------");
        Field clsField = cls.getField("number");
        Field clsDeclaredField = cls.getDeclaredField("number");
        Field clsDeclaredField2 = cls.getDeclaredField("grade");
        Student student = new Student("zhangsan", 18, 9, 1001);
        System.out.println(clsField.get(student));
        clsField.set(student, 1002);
        System.out.println(clsDeclaredField.get(student));//get方法不能获取private对象
        clsDeclaredField2.setAccessible(true);//暴力反射，忽略访问权限，可获取私有变量
        System.out.println(clsDeclaredField2.get(student));
    }
}
