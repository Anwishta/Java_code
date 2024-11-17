// public class MWC {
//     public static int maxArea(int[] height) {
//         int left=0;
//         int right=height.length-1;
//         int max_area = 0;
//         while(left<right){
//             int h = height[left]<height[right] ? height[left] : height[right];
//             int width = right-left;
//             int area = h*width;
//             if(area>max_area){
//                 max_area = area;
//             }
//             if(height[left]<height[right]){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//         return max_area;
//     }
//     public static void main(String[] args) {
//         int []height = new int[]{4, 6, 8, 1, 10};
//         int res = maxArea(height);
//         System.out.println(res);
//     }
// }
public class MVC{
    public int maxWater(int [] height){
        int left = 0;
        int right = height.length-1;
        int max_area = 0;
        while(left<right){
            int h = height[left]<height[right] ? height[left] : height[right];
            int width = right - left;
            int max = h*width;
            if(max>max_area){
                max_area=max;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return max_area;
    }
    public static void main(String[] args) {
        MVC res = new MVC();
        int [] height = new int[]{5, 8, 1, 2, 4,9};
        res.maxWater(height);
        
    }
}