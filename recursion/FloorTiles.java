package recursion;

public class FloorTiles {
    public static int tiles(int m, int n){
        if(m==n){
            return 2;
        }
        if(m < n){
            return 1;
        }
        int horizontal = tiles(m-1, n);
        int vertical = tiles(m-n, n);
        return horizontal + vertical;
    }
    public static void main(String[] args) {
        int res = tiles(4, 2);
        System.out.println(res);
    }
}
