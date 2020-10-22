import java.lang.Math;
public class Fraction {

// look at luke's code
// Partner: Luke 
// 

        private int num = 1;
        private int dem = 2;

        public static double posdiff(double a, double b) {
            return ((a/b)-(a/b));

        }

         public static double add(double a, double b) {
                return ((a + a)/ b);

         }
         public static double multi(double a, double b) {
             b = b*b;

                return (b);
         }
         public static double div(double a, double b) {
                return ((a/b)/ (a/b));
         }
         public  double change() {

            Fraction diff = new Fraction();
            double ansdiff = diff.posdiff(num, dem);
            System.out.println(ansdiff);
            return ansdiff;
         }
         
         public String ans(double num, double dem) {
             Fraction poo = new Fraction();
             double  sub = poo.posdiff(num, dem);
             System.out.println( "Subtraction: " + (int)sub + "/" + (int)sub);
             double add = poo.add(num, dem);
             System.out.println("Addition:"+(int)add+"/1");
             double mult = poo.multi(num, dem);
             System.out.println("Multiplication:" + num + "/"+(int)mult);
             double div = poo.div(num, dem);
             System.out.println("Divition:"+(int)div + "/1");
             return "";
         }

        }