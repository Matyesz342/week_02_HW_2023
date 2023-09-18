public class Gomb {
    public double sugar;

    public Gomb(double sugar)
    {
        this.sugar = sugar;
    }

    public double felszin()
    {
        return 4 * Math.pow(sugar,2) * Math.PI;
    }

    public double terfogat()
    {
        return 4 * Math.pow(sugar,3) * Math.PI / 3;
    }
}
