package Array;

public class ShallowCopy {
 public static void main(String[] args) {
    int arr[];
    arr = new int[5]; // new array
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 6;
    arr[3] = 5;
    arr[4] = 7;
    int two[] = arr; // shallow copy
    two[3] = 66;
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    for(int i=0; i<two.length; i++){
        System.out.println(two[i]);
    }
 }
}
// deep copy = creates a new reference in the heap memory so two different arrays are referred (using new keyword)
//shallow copy = creates a new variable in the stack memory that refers/points to the same array so if one array is modified both will be changed together
