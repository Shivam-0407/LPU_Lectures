package Abstraction.Data_Hiding;

import java.util.Objects;

public class Access_Modifiers {
    private int val;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Access_Modifiers that = (Access_Modifiers) o;
        return val == that.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
