package Type_Casting_And_Type_Conversion;

public class Main {
    public static void main(String[] args) {
        // Automatic Type Casting
//        short s = 56;
        char c = '0';

        int x = c;
        long l = x;
        float f = l;
        double d = f;
        System.out.println(x);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d);

        int eg = 1;
        char cd = (char)(eg+'0');

        System.out.println("explicit type casting of integer = "+cd); //'1'

        

        // Explicit Type Casting

//       double d = 97.54;
//        int x = (int) d;
//        System.out.println(x);

//        float f = 54.67f;
//        long l = 63;
//        short s = 34;
//        byte b = 12;
//        //char c = 'a';
//        double res = (f*b)+(x/s)+(d*x);
//////        double res1 = (x/c);
//        System.out.println(res);
//
//        double z = 0.03;
//        double y = 0.05;
//        double res3 = y-z;
//        BigDecimal a = new BigDecimal("0.03");
//        BigDecimal b = new BigDecimal("0.05");
//        BigDecimal ans = b.subtract(a);
//        //System.out.println("normal subtraction = "+res3);
//        System.out.println("Big Decimal sub ="+ans);
//        System.out.println(b.add(a));
//        System.out.println(b.multiply(a));
//        System.out.println(b.pow(2));
//        System.out.println(b.negate());

        Integer zz  = 10;
        System.out.println(zz);
        modify(zz);
        System.out.println("After = "+zz);
    }

    private static void modify(Integer x) {
        x ++;
        System.out.println("Inside method = "+x);
    }

    // byte -> short->int->long->float->double (Automatic Type Casting)
    // double -> float->long->int->short->byte (Explicit Type Casting)


}
