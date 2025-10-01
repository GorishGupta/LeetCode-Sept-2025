public class DS1518{
    public int numWaterBottles(int b, int n) {
        return b + (b - 1) / (n - 1);
    }
    public static void main(String[] args) {
        int numBottles = 9, numExchange = 3;
        DS1518 obj = new DS1518();
        System.out.println(obj.numWaterBottles(numBottles, numExchange));
    }
}