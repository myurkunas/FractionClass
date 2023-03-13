/**
 * Class that defines a Fraction
 * @author Matthew Yurkunas
 */
public class Fraction implements Comparable<Fraction>
{
    private int num; //Numerator
    private int den; //Denominator

    // 03-08-2023
    public int compareTo(Fraction f)
    {
        if(this.toDecimal()>f.toDecimal()) return 1;  // if this > f, return 1
        if(this.toDecimal()>f.toDecimal()) return -1;  // if this > f, return 1
        return 0; // if this == f, return 0
    }

    /**
     * Explicit constructor
     * @param n the initial value of the numerator
     * @param d the initial value of the denominator
     * @return
     */
    public Fraction(int n, int d){
        num = n;
        den = d;
    }
    public int getNumerator(){return num;}
    public int getDenominator(){return den;}

    /**
     * A method that adds this Fraction and another one
     */
    public Fraction add(Fraction f)
    {
        return new Fraction( this.num*f.den+this.den*f.num, this.den*f.den);
    }
    /**
     * A method that finds the product of this Fraction with an integer
     * @param n the integer that is used to multiply this Fraction
     */
    public Fraction multipliedBy(int n)
    {
        return new Fraction(num*n, den);
    }
    /**
     * Finds the equivalent decimal value of this Fraction
     */
    public double toDecimal()
    {
        return (double) num/den;
    }
    /**
     * Override the toString method from the Object class: Converts this object
     * to a string of the format: num/den and returns it.
     * @return this object in the format: num/den as a String
     */
    public String toString(){
    return (num + "/" + den);
}

    /**
     * Overrides the equals method
     */
    public boolean equals(Fraction f)
    {
        // You don't need if, else. Since its a boolean that is a built in functionality.
        return this.toDecimal() == f.toDecimal();
    }
    /**
     * Find the greatest common divisor of two given non-negative integers
     */
    public static int gcd(int a, int b)
    {
        int small = (a>b) ? b:a;
        for (int i = small; i > 0; i--) {
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }

    /**
     * Simplify this Fraction
     */
    public void simplify()
    {
        int g = Fraction.gcd(Math.abs(num), Math.abs(den));
        num/=g;
        den/=g;
    }

}
