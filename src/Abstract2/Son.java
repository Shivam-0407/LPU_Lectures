package Abstract2;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void carrer(String c) {
        System.out.println(" I'll follow "+c +" carrer");
    }

    @Override
    void partner(String partner) {
        System.out.println(" I'll marry "+partner );
    }
}
