package Aufgabe_1;

public class Mensch extends Saeugetier
{
    public Mensch(String name, int alter, String geschlecht)
    {
        super(name, alter, geschlecht);
    }

    @Override
    public String printAll()
    {
        return String.format("%s#%d#%s",getName(), getAlter(), getGeschlecht());
        //Platzhalter: mit einem # getrennt
        // %s für einen String
        // %d für einen Integer
    }
}
