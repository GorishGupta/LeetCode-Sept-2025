class DS3516 {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z - x);
        int b = Math.abs(z - y);
        if (a == b) {
            return 0;
        }
        if (a < b)
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {
        DS3516 sol = new DS3516();
        System.out.println(sol.findClosest(1, 2, 3)); // Output: 2
        System.out.println(sol.findClosest(1, 3, 2)); // Output: 0
        System.out.println(sol.findClosest(2, 1, 3)); // Output: 1
    }
}