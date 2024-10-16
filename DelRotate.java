import java.util.ArrayList;

public class DelRotate {
     public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int sz= arr.size();
        int n = sz;
        for(int k=1; k<=sz/2; k++){
            rightrotate(arr);
            int delIndex = n-k;
            arr.remove(delIndex);
            n=arr.size();
        }
        return arr.get(0);
    }
    public static void rightrotate(ArrayList<Integer> arr){
        int lastEle = arr.remove(arr.size()-1);
        arr.add(0, lastEle);
    }
}
