package com.noah.demo.loader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Title: MyClassLoaderTest.java <br>
 * Description:             <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2020/10/13
 */
public class MyClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        // 声明类加载器
        MyClassLoader myClassLoader = new MyClassLoader();

        // 使用myClassLoader 加载HelloWorld
        Class<?> aClass = myClassLoader.loadClass("com.noah.demo.loader.HelloWorld");

        System.out.println(aClass.getClassLoader());

        // 1.注释
        Object helloWorld = aClass.newInstance();
        System.out.println(helloWorld);
        System.out.println(helloWorld.getClass().getName());
        System.out.println(helloWorld.hashCode());


        Method welcomeMethod = aClass.getMethod("welcome");
        String result = (String) welcomeMethod.invoke(helloWorld);
        System.out.println("Result:" + result);

    }

}
