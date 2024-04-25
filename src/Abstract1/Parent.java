package Abstract1;

 public abstract class Parent {
    static int age;
    final String DEGREE="MD";
    public Parent(int age) {
        Parent.age = age;
    }

//    abstract Parent();
// it'll give us an error saying
// method not declared properly
// how will u be able to call this

    static void car(){
        System.out.println(" We have Mahindra Scorpio with us");
    }

    void location(){
        System.out.println(" We live in Punjab");
    }

    abstract void carrer(String carrer);
    abstract void partner(String partner);
}
