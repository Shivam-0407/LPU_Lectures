package InterFaces.G1;

import InterFaces.G2.Media_Player;

public class AI_Media_Player implements Media_Player {
    @Override
    public void start() {
        System.out.println("Welcome to the world of AI 🤖");
    }

    @Override
    public void stop() {
        System.out.println("Hope you had a blast with us 😎");
    }
}
