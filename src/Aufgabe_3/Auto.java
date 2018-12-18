package Aufgabe_3;

public class Auto extends Fahrzeug implements Comparable<Auto>
{
    private boolean klimaanlage;
    private short airbags;

    public void klimaanlageAn()
    {
        if(this.klimaanlage==true)
        {
            System.out.println("Klimaanlage ist bereits an");

        }
        else
        {
            this.klimaanlage=true;
        }

    }

    public void klimaanlageAus()
    {
        if(this.klimaanlage==false)
        {
            System.out.println("Die Klimaanlage ist bereits aus");
        }
        else
        {
            this.klimaanlage=false;
        }

    }


    //Konstruktor
    public Auto(short reifen, String farbe, short ps, short tueren, short airbags)
    {
        super(reifen, farbe, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
    }

    //Getter und Setter
    public boolean isKlimaanlage()
    {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage)
    {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags()
    {
        return airbags;
    }

    public void setAirbags(short airbags)
    {
        this.airbags = airbags;
    }


//Aufgabe 6 Überschreiben einer Methode

    @Override
    public String toString()
    {
        return "Mein Auto hat " + this.getPs() + " PS und fährt mit " + this.getGeschwindigkeit() + " km/h";
    }



    //Leistungsbeurteilung Aufgabe 3
    @Override
    public int compareTo(Auto o)
    {
        if (this.getPs()== o.getPs()){
            return 0;
        }
        if (this.getPs() < o.getPs()){
            return 1; //jede positive Nummer ist möglich
        }
        return -1; //jede negative Nummer ist möglich
    }

        //Wenn das erste Auto mehr PS hat als das zweite Auto soll es in der Liste "über" den dem anderen Auto stehen und umgekehrt
        //Bei gleicher Anzahl PS soll es "gleichgestellt" sein (es wird die Reihenfolge in der Liste verwendet)
        //in diesem Fall sind die Autos absteigend geordnet - wenn ich sie absteigend geordnet haben will kann ich einfach
        //">" zu "<" umdrehen

}