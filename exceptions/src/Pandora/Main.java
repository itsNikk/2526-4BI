package Pandora;

public class Main {
    public static void main(String[] args) {
        try {
            Coordinata c = new Coordinata(16516, 468468);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
