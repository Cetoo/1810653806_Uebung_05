import Aufgabe_1.Mensch;
import Aufgabe_2.Student;

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
        System.out.println("Aufgabe 2");
        //Instanz von einem neuen Menschen
        Aufgabe_2.Mensch dennis2 = new Aufgabe_2.Mensch("Dennis", "Cetin", 25);
        dennis2.status();

        //Instanz von einem Studenten
        Student a = new Student("Dennis", "Cetin", 25, 1810653806, "Web Business & Technology");
        a.status();


        //Aufgabe 3

    }
}


