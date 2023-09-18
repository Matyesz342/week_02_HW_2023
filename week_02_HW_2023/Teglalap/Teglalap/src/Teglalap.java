public class Teglalap {
    public int oldal_a;
    public int oldal_b;

    public Teglalap(int oldal_a, int oldal_b)
    {
        this.oldal_a = oldal_a;
        this.oldal_b = oldal_b;
    }

    public int kerulet()
    {
        return 2 * oldal_a + 2 * oldal_b;
    }

    public int terulet()
    {
        return oldal_a * oldal_b;
    }

}
