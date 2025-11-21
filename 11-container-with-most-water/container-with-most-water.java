class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int x = 0, y = n - 1;
        while(x < y){
            final int minheight = Math.min(height[x],height[y]);
            ans = Math.max(ans,minheight * (y-x));
        
        if(height[x] < height[y]){
            ++x;
        } else{
            --y;
        }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(maxArea(arr));
    }
}