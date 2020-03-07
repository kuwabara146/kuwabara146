import java.util.HashMap;

public class task3 {

    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<>();
        price.put("りんご", 130);
        price.put("みかん", 120);
        price.put("バナナ", 98);
        price.put("メロン", 6000);

        System.out.println("りんご:" + price.get("りんご") + "円");
        System.out.println("メロン:" + price.get("メロン") + "円");
        System.out.println("みかん:" + price.get("みかん") + "円");
        System.out.println("バナナ:" + price.get("バナナ") + "円");
    }

}
