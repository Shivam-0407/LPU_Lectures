package InterFaces.G1;

public class Anonymous_Main {
    public static void main(String[] args) {
        Anime ai = new Anime() {
            @Override
            public void greet() {
                System.out.println("Hi we're in anonymous's greet method");
            }

            @Override
            public void namaste() {
                System.out.println("Namaste, my friend 🌸");
            }
        };

        ai.greet();
        ai.namaste();

        class Naruto implements Anime{

            @Override
            public void greet() {
                System.out.println("Welcome to the leaf village");
            }

            @Override
            public void namaste() {
                System.out.println("Konichiwa");
            }
        }

        Anime an = new Naruto();
        an.namaste();
        an.greet();
    }
}
