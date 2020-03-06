import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("numA: ");
        int numA = sc.nextInt();
        System.out.print("numB: ");
        int numB = sc.nextInt();
        System.out.print("numC: ");
        int numC = sc.nextInt();
        sc.close();

        int max = numA;

        if(max < numB) {
            max = numB;
        }
        if(max < numC) {
            max = numC;
        }

        System.out.println("最大値: " + max);

    }

}
