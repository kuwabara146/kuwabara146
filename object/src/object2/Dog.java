package object2;

public class Dog extends Animal{
    //体重
    double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //走る
    public void run() {
        System.out.println(name + "は走った");
    }

    //sleepメソッドをオーバーライド
    public void sleep() {
        System.out.println(name + "は眠った");
    }
}
