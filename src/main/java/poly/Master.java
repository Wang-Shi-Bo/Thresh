package poly;

public class Master {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    // 主人给动物喂食
    public void feed(Dog dog, Bone bone){
        System.out.println("主人" + name + "给" + dog.getName() + "喂食" + bone.getName());

    } 
    //poly
    public void feed(Animal animal, Food food){
        System.out.println("主人" + name + "给" + animal.getName() + "喂食" + food.getName());

    }

}
