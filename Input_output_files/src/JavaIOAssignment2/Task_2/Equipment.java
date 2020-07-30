package JavaIOAssignment2.Task_2;

import java.util.Objects;

public class Equipment {
    private String name;
    private int price;

    public Equipment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;
        Equipment equipment = (Equipment) o;
        return price == equipment.price &&
                Objects.equals(name, equipment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return " === Equipment {" +
                "name = '" + name + '\'' +
                ", price = " + price + "}";
    }
}
