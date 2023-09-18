package negyzet;

public class Negyzet {
    public int oldal;

    public Negyzet(int oldal)
    {
        this.oldal = oldal;
    }

    public int kerulet()
    {
        return oldal*4;
    }

    public int terulet()
    {
        return  oldal * oldal;
    }

}
