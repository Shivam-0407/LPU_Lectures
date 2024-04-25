package inheritance;

public class Numbers {
    int num;

    public Numbers() {
    }

    public Numbers(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "num=" + num +
                '}';
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }



    public static void main(String[] args) {
        Numbers no = new Numbers();
        no.add(4,5,6);

        System.out.println(no);
    }
}
