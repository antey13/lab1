package company;

import java.util.Arrays;

public class ValueClass {
    public int min;
    public byte[][] image;

    public ValueClass(byte[][] image, int min) {
        this.image = image;
        this.min = min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueClass that = (ValueClass) o;
        return Arrays.equals(image, that.image) && that.min == min;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(image) + min;
    }
}