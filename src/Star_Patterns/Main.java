package Star_Patterns;

public class Main {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);

        pattern5(5);

    }

    private static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private  static  void  pattern3(int n){
//        int in=n;
//        for (int i=in; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i=0;i<4;i++){
//            for(int j=4-i-1;j>=0;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i = 1; i <= n; i++){
//            for(int j = 0; j <n-i; j++){
//                System.out.print( "* ");
//            }
//            System.out.println();
//        }

//        for (int i = n; i >0; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }


    private static void pattern5(int n) {
        int start = 2;
        for (int row = 0; row < 2 * n; row++) {
            int cols = row > n ? ((2 * n) - row) : row;
            for (int col = 0; col < cols; col++) {
                System.out.print("* ");
            }
                System.out.println();
            }


//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = n; j > i+1; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    for (int i = 0; i < numOfRows; i++){
//        for(int j = 0; j <= i; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//
//        if(i == numOfRows - 1){
//            for (int i1 = numOfRows - 1 ; i1 >0; i1--){
//                for(int j1 = 1; j1 <= i1; j1++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
//    } Kushagra

//    int r = 4;
//for (int i = 0; i < 2 * r - 1; i++) {
//        int C = (i < r) ? i + 1 : 2 * r - 1 - i;
//        for (int j = 0; j < C; j++)
//            System.out.print("* ");
//        System.out.println();
//    } //  VIkas


        }
    }



