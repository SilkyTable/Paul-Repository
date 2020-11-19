import java.lang.Math;
public class Fraction {
// we tried to do the fraction project with another way but that was poo so i made a whole new one and called it Fraction2 pls 
    //don't take points off
    //Partner = paul.epic
/*add me on xbox 
 * my gamertag: skywalker499
 * well play MC and MW if you have it. if you dont want to thats fine paul and i were talking about
 * you liking games so... if you wanna play
 * 
 */

        
        private int num = 1;
        private int dem = 2;
        private int Num2 =3;
        private int Dem2 =2;
        
        public static double posdiff(double num, double num2) {
            return (num - num2);    
        }
         public static double add(double num, double num2) {
                return ((num + num2));
         }
         public static String multi(double num, double dem, double num2, double dem2) {
             int dem3 = (int) (dem*dem2);
             int num3 = (int)(num*num2);
             String multians = (num3 + "/"+ dem3);
                return (multians);
         }
         public static String div(double num, double dem, double num2, double dem2) {
            String Div = (int)(num*num2)+ "/"+ (int)(num2*dem2);    
                        return (Div);
         }
         public  double change() {
            
            Fraction diff = new Fraction();
            double ansdiff = diff.posdiff(num, dem);
            System.out.println(ansdiff);
            return ansdiff;
         }
         public   String ans(int num, int dem, int num2, int dem2)
         {
                
                Fraction poo = new Fraction();
                System.out.println("The Fractions used are:(" + num+ "/"+dem+ ") and (" +num2+"/"+dem2+")");
                double  sub = poo.posdiff(num, num2);
                System.out.println( "Subtraction: "+ (int)sub + "/" + (int)dem);
                double add = poo.add(num, num2);
                System.out.println("Addition:"+ (int)add+"/"+ dem);
                String mult = poo.multi(num, dem, num2, dem2);
                System.out.println("Multiplication:" + mult);
                String div = poo.div(num, dem, dem2, num2);
                System.out.println("Division:"+ div );
                return " "; 
         }
        }