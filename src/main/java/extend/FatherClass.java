package extend;

public class FatherClass {


    private int age = 0;
    public String name;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public FatherClass(){
        System.out.println("start father construction ......no paras ");
    }
    public FatherClass(String name){
        this.name = name;
        System.out.println("start father construction ......");
    }

    public void makeMoney(String money){
        System.out.println("father make money");
    }
}
