package OOPs.Static_Blocks;

public class StaticBlock2 {
    static int a = 4;
    static int b;

    static {
        System.out.println("Hi there I am inside static block ");
        b = a+4;
    }

    public static void main(String[] args) {
        StaticBlock2 test1 = new StaticBlock2();
        System.out.println(StaticBlock2.a+" "+StaticBlock2.b);
        StaticBlock2 s2 = new StaticBlock2();
        System.out.println(StaticBlock2.a+" "+StaticBlock2.b);
    }
}
