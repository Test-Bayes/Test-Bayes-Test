package model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class ModelB {

    private String name;
    private int value1;
    private int value2;
    private int value3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelB modelB = (ModelB) o;
        return value1 == modelB.value1 &&
                value2 == modelB.value2 &&
                value3 == modelB.value3 &&
                Objects.equal(name, modelB.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, value1, value2);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("value1", value1)
                .add("value2", value2)
                .add("value3", value3)
                .toString();
    }
}
