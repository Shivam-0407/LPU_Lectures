package DC;

import java.util.Arrays;

public class SuperMan {
    public static void main(String[] args) {
        System.out.println(Character.isWhitespace(' '));

        System.out.println("my name is \n shivam");

        int paths = findPaths(1,3,3,0,1);
        System.out.println(paths);

        // method chaining
//        char x = 'X';
//        boolean res = Character.isLowerCase(Character.toLowerCase(x));
//        System.out.println(res);

    }

    static long[][] ans;
    int m = 1000000007;
    public static int findPaths(int m, int n, int maxMove, int sR, int sC) {
        ans = new long[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],-1);
        }

        int res = (int)(solve(m,n,sR,sC,maxMove));

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(ans[i]));
        }


        return res;
    }

    public static long solve (int m,int n,int sR, int sC ,int maxMove){
        if((sR==m || sC==n || sR<0 || sC<0) && (maxMove>=0)){
            // System.out.println("hi");
            return 1;
        }
        if(maxMove<0){
            // System.out.println("hi 0 ");
            return 0;
        }
        if(ans[sR][sC]!=-1)
            return ans[sR][sC];

        long local_ans = solve(m,n,sR+1,sC,maxMove-1)+
                solve(m,n,sR-1,sC,maxMove-1)+
                solve(m,n,sR,sC+1,maxMove-1)+
                solve(m,n,sR,sC-1,maxMove-1);
        // local_ans = local_ans%m;
        System.out.println(" sR = "+sR+" sC = "+sC+" maxMove = "+maxMove);
        return ans[sR][sC]=Math.max((local_ans+ans[sR][sC]>=0?ans[sR][sC]:0),ans[sR][sC]);

    }
}
