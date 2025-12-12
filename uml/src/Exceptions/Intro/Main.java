package Exceptions.Intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DATA UNA stringa e un int => restituire il in quella posizione
        Scanner in = new Scanner(System.in);

        System.out.print("Dammi una stringa, please: ");
        String s = in.nextLine();

        System.out.print("gimme index: ");

        try {
            int index = in.nextInt();
            char res = searchChar(s, index);
            System.out.println(res);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException _) {
            System.out.println(searchChar(s, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static char searchChar(String s, int i) {
        if (s.length() > 10) throw new IllegalArgumentException("Ha inserito una strigna troppo lunga");
        return s.charAt(i);
    }

}
