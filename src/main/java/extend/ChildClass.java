package extend;

public class ChildClass extends FatherClass{


    public ChildClass(){
        super("child");
        System.out.println("start child construction .......");
    }
    public  void getFatherAge(){
        System.out.println("get age ===" + getAge()); //error can not get fatherclass ‘s private attribute;

    }
    public void getFatherName(){
        System.out.println(name);
    }

    @Override
    public void makeMoney(String money){
        System.out.println("child make money");
    }
}
