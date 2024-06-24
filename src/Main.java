//Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            System.out.println(methodName);
        }
    }
}