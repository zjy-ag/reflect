package top.zhujiayu.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @auther zjy
 * @date 2020/5/23
 *
 * 案例
 **/

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Properties properties = new Properties();

        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //加载类进内存
        Class<?> cls = Class.forName(className);
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //创建对象
        Constructor<?> constructor = cls.getConstructor(String.class, int.class, int.class, int.class);
        Object obj = constructor.newInstance("lisi", 19, 8, 1006);

        //执行方法
        method.invoke(obj);
    }
}
