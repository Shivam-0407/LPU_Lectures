package OOPs.AccessModifiers;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Casino owner = new Casino(24);
        owner.setSp_no(54);
        System.out.println(owner.sp_no);
        System.out.println(owner.getSp_no());
        Casino new_emp = owner;
        System.out.println(new_emp.getSp_no());

        minCasino m = new minCasino(63);
        int x = m.sp_no;
        System.out.println(x);
    }
}
