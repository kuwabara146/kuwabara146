package object2;

class Main {

    public static void main(String[] args) {
        //インスタンス生成
        Animal animal = new Animal("ポチ", 5);
        Dog pochi = new Dog("ポチ", 5, 12.3);

        System.out.println("名前：" + pochi.name);
        System.out.println("年齢：" + pochi.age + "歳");
        System.out.println("体重：" + pochi.weight + "kg");

        //runメソッド呼び出し
        pochi.run();

        //Animalクラスのsleepメソッド呼び出し
        animal.sleep();

        //Dogクラスのsleepメソッド呼び出し
        pochi.sleep();

    }

}
