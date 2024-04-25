package ObjectStreaming.G2;

import java.io.Serializable;

public class Object1 implements Serializable {
    int number;

    public Object1(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Object1{" +
                "number=" + number +
                '}';
    }
}
