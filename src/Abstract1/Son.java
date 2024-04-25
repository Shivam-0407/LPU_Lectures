package Abstract1;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void carrer(String name) {
        System.out.println(" I want to be a "+name);
    }

    @Override
    void partner(String partner) {
        System.out.println(" I will marry "+partner);
    }
}
