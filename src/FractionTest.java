import java.util.Arrays;
import java.util.Random;

/**
 * @author Matthew Yurkunas
 */
public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(2, 3);
        System.out.println(f1.multipliedBy(2));
        if (f1 == f2)
            System.out.println("Yes, they're equal.");
        else
            System.out.println("No, they're not equal.");

        Fraction f4 = f1;
        if (f1 == f4)
            System.out.println("Yes, they're equal.");
        else
            System.out.println("No, they're not equal.");

        //This only works because we override the equals class.
        if (f2.equals(f1))
            System.out.println("Yes, they're equal");
        else
            System.out.println("No, they're not equal.");

        f2 = f1.add(f1);
        System.out.println("f1= " + f1.getNumerator() +"/" + f1.getDenominator());
        System.out.println("f1= " + f1.toString());
        System.out.println("f1= " + f1);
        System.out.println("f1 + f1 = " + f2);
        System.out.println(f1.toDecimal());

        System.out.println("The greatest common divisor of 15 and 13 is " + Fraction.gcd(15,35));
        System.out.println("The greatest common divisor of 15 and 13 is " + f1.gcd(15,35));

        // 03-08-2023
        Fraction[] farr = new Fraction[20];
        Random r = new Random();
        for (int i = 0; i < farr.length; i++)
            farr[i] = new Fraction(r.nextInt(100),r.nextInt(99) + 1);

        for(int i = 0; i < farr.length; i++)
            System.out.print(farr[i] + ", ");
        System.out.println();
        //Arrays.sort(farr);


        Arrays.sort(farr, new NewOrdering());
        for(int i = 0; i < farr.length; i++)
            System.out.print(farr[i] + ", ");
        System.out.println();
    }
}
