package OOPs;

public class Enum_demo {
    enum Days{
        Mon, Tue, Wed,Th, Fr, Sat, Sund; // enumeration constants

//        Days(){
//            System.out.println(" Constructor values = "+this);
//        }
    }

    public static void main(String[] args) {
        Days day1;
        day1 = Days.Fr;

//        System.out.println(Days.valueOf("Mon"));

        for(Days day:Days.values()){
            System.out.println(day);
        }

    }
}
