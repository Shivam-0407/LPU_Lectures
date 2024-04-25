package OOPs.InnerClasses;


public  class OuterClass2 {

    static class InnerClass{
         String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }



    public static void main(String[] args) {

        InnerClass i = new InnerClass("Vikas");
        InnerClass i2 = new InnerClass("Madhav");
        System.out.println(i.name);
        System.out.println(i2.name);

    }
}
