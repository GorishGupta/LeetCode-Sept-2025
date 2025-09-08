public class DS1317 {
    public int[] getNoZeroIntegers(int n) { 
        for(int i=1;i<n;i++)
        {
            int left = i;
            int right=n-left;
            if(!String.valueOf(left).contains("0")&&!String.valueOf(right).contains("0"))
            return new int[] {left,right};
        }
        return new int[0];
    }
    public static void main(String[] args) {
        DS1317 obj = new DS1317();
        System.out.println(obj.getNoZeroIntegers(2));
    }
}

