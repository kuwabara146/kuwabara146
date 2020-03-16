import java.util.HashMap;

public class task3 {

    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<>();
        price.put("りんご", 130);
        price.put("みかん", 120);
        price.put("バナナ", 98);
        price.put("メロン", 6000);

        for(HashMap.Entry<String, Integer> fruit : price.entrySet()) {
            System.out.print(fruit.getKey() + ": ");
            System.out.println(fruit.getValue() + "円");
        }
    }

}
