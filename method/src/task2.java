
public class task2 {

    public static void main(String[] args) {
        double base = 27.4;
        double height = 9.8;
        double area;

        //三角形の面積を求めるメソッドを呼び出す
        area = getTriangleArea(base, height);
        System.out.println("三角形の面積");
        System.out.println(area);

    }
    public static double getTriangleArea(double base, double height) {
        double area;

        //三角形の面積の計算をする 底辺、高さ、面積は四捨五入する
        area = Math.round(base) * Math.round(height) / 2;
        return Math.round(area);
    }

}
