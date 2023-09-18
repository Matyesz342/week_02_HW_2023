public class Kor {
    public double sugar;

    public Kor(double sugar)
    {
        this.sugar = sugar;
    }

    public double kerulet()
    {
        return 2 * sugar * Math.PI;
    }

    public double terulet()
    {
        return sugar * sugar * Math.PI;
    }
}
