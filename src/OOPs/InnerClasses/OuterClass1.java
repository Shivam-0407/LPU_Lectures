package OOPs.InnerClasses;
import packetzz.Outer;




public  class OuterClass1 {

     public static class InnerClass{
         public String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        OuterClass1 outerInstance = new OuterClass1();
        //OuterClass1.InnerClass innerInstance = outerInstance.new InnerClass("Example");
        InnerClass i = new InnerClass("Aswin");
        InnerClass i2 = new InnerClass("Sheraz");

        System.out.println(i.name);
        System.out.println(i2.name);
    }
}
