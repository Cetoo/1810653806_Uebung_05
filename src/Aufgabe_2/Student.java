package Aufgabe_2;

public class Student extends Mensch
{
    //Attribute von Student
    private int matrikelnummer;
    private String studiengang;


    //Konstruktor von Student mit den zwei neuen Attributen von Student
    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang)
    {
        //Attribute von Mensch in super + die zwei Attribute von Student
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    //Override Methode die nur für die Instanzen von einem Student zählt
    @Override
    public void status()
    {
        System.out.println(getVorname()+ " " +getNachname()+ " ist ein Student und ist " +getAlter()+ " Jahre alt besitzt die Matrikelnummer: " +getMatrikelnummer()+ " und studiert " +getStudiengang()+ ".");
    }

    //Getter und Setter

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang()
    {
        return studiengang;
    }

    public void setStudiengang(String studiengang)
    {
        this.studiengang = studiengang;
    }
}
