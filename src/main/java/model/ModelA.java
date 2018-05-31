package model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class ModelA {

    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelA modelA = (ModelA) o;
        return value == modelA.value &&
                Objects.equal(name, modelA.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, value);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("value", value)
                .toString();
    }
}