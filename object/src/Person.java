
public class Person {
    //お財布(静的フィールド)
    static int wallet = 0;
    //名前
    private String name = "";
    //nameフィールドのgetter
    public String getName() {
        return this.name;
    }
    //nameフィールドのsetter
    public void setName(String name) {
        this.name = name;
    }
    //年齢
    private int age = 0;
    //nameフィールドのgetter
    public int getAge() {
        return this.age;
    }
    //nameフィールドのsetter
    public void setAge(int age) {
        this.age = age;
    }

    //引数なしのコンストラクタ
    Person(){}
    //引数ありのコンストラクタ
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(int money){
        wallet += money;
    }

    public void myProfile() {
        System.out.println("私の名前は" + this.name + "です。");
        System.out.println("私の年齢は" + this.age + "です。");
        System.out.println("よろしくお願いします。");
    }

}
