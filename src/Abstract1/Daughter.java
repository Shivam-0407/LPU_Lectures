package Abstract1;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrer(String carrer) {
        System.out.println(" I will become a "+carrer);
    }

    @Override
    void partner(String partner) {
        System.out.println(" I want to marry "+partner);
    }
}
