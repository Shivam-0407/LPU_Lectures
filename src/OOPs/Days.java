package OOPs;

import java.lang.reflect.Constructor;

public enum Days {
    Mon,Tue,Wed,Thu,Fr,Sat,Sund;
    // public static final
    Days(){
        System.out.println("Constructor is calling "+this);
    }

    public static void main(String[] args) {
        Days d;
        d = Days.Fr;
        System.out.println(Days.valueOf("Mon"));
        System.out.println(d.ordinal());

    }
}
