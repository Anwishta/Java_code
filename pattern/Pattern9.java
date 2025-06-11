public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int st = 1;
        int sp = n/2;
        int val = 1 ;
        int cval = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            cval = val;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + " ");
                if (j<= st/2) {
                    cval++;
                }else{
                    cval--;
                }
            }
            if(i <= n/2){
                sp--;
                st += 2;
                val++;
            }else{
                sp++;
                st -= 2;
                val--;
            }
            System.out.println();
        }
    }
}
