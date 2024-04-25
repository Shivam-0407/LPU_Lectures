package Anonymous;

public class Main {
    public static void main(String[] args) {
        // anonymous class
        Anime an = new Anime() {
            @Override
            public void greet() {
                System.out.println("greetings from anonymous class");
            }

            @Override
            public void namaste() {
                System.out.println("namaste from anonymous class");
            }
        };

        an.greet();
        an.namaste();

 //        local class
        class naruto implements Anime{

            @Override
            public void greet() {
                System.out.println("Welcome to the leaf village ");
            }

            @Override
            public void namaste() {
                System.out.println("Namaste, would u like some ramen");
            }
        }

        Anime boruto = new naruto();
        boruto.greet();
        boruto.namaste();
    }
}
