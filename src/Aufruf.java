import Aufgabe_1.Mensch;
import Aufgabe_2.Student;
import Aufgabe_3.Auto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Aufgabe 1
        System.out.println("Aufgabe 1");
        Mensch dennis = new Mensch("Dennis", 25,"Männlich");

        System.out.println(dennis.printAll());
        System.out.println("_____________________________________________________________________________________");


        //Aufgabe 2
        System.out.println("Aufgabe 2 Polymorphismus");

        //Instanz von einem neuen Menschen
        Aufgabe_2.Mensch dennis2 = new Aufgabe_2.Mensch("Dennis", "Cetin", 25);
        dennis2.status();

        //Instanz von einem Studenten
        Student a = new Student("Dennis", "Cetin", 25, 1810653806, "Web Business & Technology");
        a.status();

        System.out.println("_____________________________________________________________________________________");

        //Aufgabe 3 NOCH PUSHEN!!!
        System.out.println("Aufgabe 3 sortierte Liste (absteigend)");

        //Neue Instanzen erstellt vom Typ Auto
        Auto audi = new Auto((short)4, " Silber ", (short)120, (short)3, (short)4);
        Auto bmw = new Auto ((short)4, " Blau ", (short)200, (short)5, (short)4);
        Auto seat = new Auto ((short)4, " Rot ", (short)110, (short)5, (short)6);
        Auto fiat = new Auto ((short)4, " Schwarz ", (short)80, (short)3, (short)4);
        Auto porsche = new Auto ((short)4, " Silber ", (short)220, (short)5, (short)6);

        //Eine Liste erstellt und meine zuvor generierten Instanzen zur Liste hinzugefügt
        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(seat);
        liste.add(fiat);
        liste.add(porsche);
        Collections.sort(liste);


        //For-each Schleife diese läuft solange wie die Anzahl meiner Instanzen in meiner Liste
        for (Auto item : liste)
        {
            System.out.println(item);
        }
        System.out.println("_____________________________________________________________________________________");

    }
}