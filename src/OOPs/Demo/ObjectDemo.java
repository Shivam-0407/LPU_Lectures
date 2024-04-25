package OOPs.Demo;

import java.util.Objects;

public class ObjectDemo {
    int num;
    float salary;

    public ObjectDemo(int num, float salary) {
        this.num = num;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        return this.num==((ObjectDemo)other).num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, salary);
    }
}
