package Aufgabe_2;

public class Student extends Mensch
{
    private int matrikelnummer;
    private String studiengang;


    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang)
    {
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

    //Konstruktor

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
