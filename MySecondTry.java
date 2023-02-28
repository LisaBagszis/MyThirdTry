import javax.swing.*;
import java.util.Arrays;

public class MySecondTry {

    public static void main(String[] args) {

        int day = 3;


        switch (day) {
            case 1-> System.out.println("Montag: Hähnchen mit Reis");
            case 2 -> System.out.println("Dienstag: Nudeln mit Tomatensoße");
            case 3 -> System.out.println("Mittwoch: Feta-Gemüse-Auflauf");
            case 4 -> System.out.println("Donnerstag: Suppe");
            case 5 -> System.out.println("Freitag: Steak mit Kartoffelpürree");
            case 6 -> System.out.println("Samstag: Nudelauflauf");
            case 7 -> System.out.println("Sonntag: Salat mit Kartoffelecken");
            default -> System.out.println("Falsche Eingabe erfolgt");

        }
    }
}
