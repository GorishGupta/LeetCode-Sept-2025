public class DS3227 {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++)
            if ((0x104111 >> (s.charAt(i) - 97) & 1) != 0)
                return true;
        return false;
    }
    public static void main(String[] args) {
        DS3227 obj = new DS3227();
        String s = "leetcoder";
        System.out.println(obj.doesAliceWin(s));
    }
}

