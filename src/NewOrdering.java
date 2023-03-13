import java.util.Comparator;

/**
 * @author Matthew Yurkunas
 */
public class NewOrdering implements Comparator<Fraction>
{
    public int compare(Fraction f1, Fraction f2)
    {
        if(f1.toDecimal()>f2.toDecimal()) return -1;
        if(f1.toDecimal()<f2.toDecimal()) return 1;
        return 0;
    }
}
