import java.util.Scanner;
public class FractionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner poo = new Scanner(System.in);

        System.out.println("what is the numerator of the first Fraction?");
        System.out.println("*the denomiatos will be the same");
            int num = poo.nextInt();
            System.out.println("what is the denominator of the first one?");
        int dem = poo.nextInt();
        System.out.println("What is the Numerator of the second Fraction");
        int num2= poo.nextInt();
        int dem2 = dem;

        Fraction pood = new Fraction();
                String print = pood.ans(num, dem, num2, dem2);
        System.out.println(print);

    }

}