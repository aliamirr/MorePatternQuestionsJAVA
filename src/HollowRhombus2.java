//Hollow Rhombus by another method....

public class HollowRhombus2 {
    public static void main(String[] args) {
        int m = 5;

        for (int i = 1; i <= m; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++){
                if( i ==1 || j == 1 | j==m ||i==m ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
