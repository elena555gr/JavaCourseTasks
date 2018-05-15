

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class TestingReflection {

    public static void main(String[] args) {


        //получаем имя класса
        Class reflectClass = Student.class;
        String className = reflectClass.getName();
        System.out.println(className);

        //получаем имена всех публичных методов класса. Если есть есть геттеры, то заменяем имя на слово Геттер. Получаем также параметры методов
        Method[] methods = reflectClass.getMethods();
        for(Method method : methods) {
//            if (method.getName().startsWith("get")){
//                System.out.println("Getter");
//            }else {
//                // Get the method name
//                System.out.println("Method Name: " + method.getName());
//                System.out.println(method.getReturnType());
//            }
//
//            Class[] parameterType = method.getParameterTypes();
//            System.out.println("Parameters:");
//            for(Class parameter:parameterType){
//                System.out.println(parameter.getName());
//            }

            //если есть аннотация, то выводим имя, return type и запускаем метод
            if (method.isAnnotationPresent(MyAnnotation.class)){
                System.out.println( "method name:" + method.getName());
                System.out.println("return type"+ method.getReturnType());

            }



        }

        //получаем модификаторы доступа
        int classModifiers = reflectClass.getModifiers();
        //вывести на екран есть ли публичные методы
        System.out.println(Modifier.isPublic(classModifiers));


        Field privateStringName = null;
        Student newStudent = new Student("Anna", 2);
        try {
            String nameString = "name";
            privateStringName = Student.class.getDeclaredField(nameString);
            privateStringName.setAccessible(true);
            String valueOfName =(String) privateStringName.get(newStudent);
            System.out.println("Private Field Name: " + valueOfName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


}
