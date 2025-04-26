package poly;

public class Cat extends Animal{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Cat(String name)
    {
        super(name);
    }
}
