package poly;

public class PolyApp {

    public static void main(String[] args) {
        Master master = new Master("Mata");

        Dog dog = new Dog("dog");
        Bone bone = new Bone("bone");
        master.feed(dog, bone);

        Animal animal = new Dog("dog");
        Food food = new Bone("bone");
        master.feed( animal, food);
    }
}
