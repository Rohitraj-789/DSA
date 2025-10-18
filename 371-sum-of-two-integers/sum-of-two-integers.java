class Solution {
    public static int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1;
            a = a ^b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSum(a,b));
    }
}