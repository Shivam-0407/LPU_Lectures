package OOPs.Polymorphism.G2;

public class Square extends Shape{
//    @Override // happens in the periphery of inheritance
//    public void area(){
//        System.out.println(" OLA from the Square 😎✌️");
//    }

    @Override
    public void business(){
        System.out.println(" Business run by Kush");
    }
    public void area2(){
        super.area();
    }

    @Override // annotation
    public String toString() {
        return "This is pointing to the object of square class ";
    }
}
