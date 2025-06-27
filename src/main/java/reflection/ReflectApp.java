package reflection;

public class ReflectApp {
    public static void main(String[] args) {
        String  classPath = "reflection.Cat";
        try {
            Class<?> catClass = Class.forName(classPath);

            System.out.println(catClass);
            System.out.println(catClass.getName());






        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Cat{
    String  name;

    public void say(){
        System.out.println("miao ~");
    }
}