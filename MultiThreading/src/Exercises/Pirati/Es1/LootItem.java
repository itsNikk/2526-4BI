package Exercises.Pirati.Es1;

public class LootItem {
    private String name;
    private double value;

    public LootItem(String name, double value) {
        this.name = name;
        this.value = value;
    }

    // Formato (nome, valore)
    @Override
    public String toString() {
        return "(" + name + ", " + value + ")";
    }
}
