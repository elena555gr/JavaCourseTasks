import java.lang.reflect.*;

public class TestingReflection {

    public static void main(String[] args) {
        Class reflectClass = Student.class;
        String className = reflectClass.getName();
        System.out.println(className);

        Method[] methods = reflectClass.getMethods();
        for(Method method : methods) {
            if (method.getName().startsWith("get")){
                System.out.println("Getter");
            }
            // Get the method name
            System.out.println("Method Name: " + method.getName());
            System.out.println(method.getReturnType());


            Class[] parameterType = method.getParameterTypes();
            System.out.println("Parameters:");
            for(Class parameter:parameterType){
                System.out.println(parameter.getName());
            }



        }


        int classModifiers = reflectClass.getModifiers();
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
