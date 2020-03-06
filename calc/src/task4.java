
public class task4 {

    public static void main(String[] args) {
        int numA = 192837;
        int numB = numA / 10;
        int numC = numA % (numB * 10);

        System.out.println("一の位を除く数:" + numB);
        System.out.println("一の位の数:" + numC);
    }

}
