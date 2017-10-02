
 

public class Fraction
{
    private double numerateur,denominateur;
    
    public Fraction(double numerateur, double denominateur)
    {
        this.numerateur= numerateur;
        this.denominateur = denominateur;
    }
    
    public Fraction()
    {
        this(0, 0);
    }
    
    @Override
    public String toString()
    {
        return Double.valueOf(numerateur).toString() + " " + Double.valueOf(denominateur).toString();
    }
}
