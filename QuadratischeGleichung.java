import javax.swing.*;

public class QuadratischeGleichung {

   public static double a;
    public static double b;
    public static double c;

    public QuadratischeGleichung(int a ,int b ,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
   public static void parameterAusgaben()
   {
       JOptionPane.showMessageDialog(null,"a est " + a + " b est  " + b + " c est "+ c );
   }

   public static void  gleichungLoesung(){
        double resultat=0;
        double discriment;
        if (a==0) {
            if (a == 0 && b != 0 && c != 0) {
                resultat = (-c / b);
               System.out.println(resultat);
            } else if (a == 0 && b == 0 && c != 0) {
                System.out.println(resultat);
            } else if (a == 0 && b == 0 && c == 0) {
                System.out.println("es gibt gar keine Lösungen");
            }

        } else if (a!=0)
        {
            discriment = ( b*b- (4*a*c));

            if(discriment>0)
            {
                double x1 = (-b+Math.sqrt(discriment))/(2*a);
                double x2 =(-b-Math.sqrt(discriment))/(2*a);
                System.out.println(" Die Lösungen lauten " + x1 + " und " + x2);
            }  else if (discriment<0)
            {
                System.out.println("keine Lösungen");
            }  else if (discriment==0){
                double x3= -b/(2*a);
                 System.out.print("nur eine Lösung ." +
                         "die lautet " + x3);
            }
        }

   }


    public static void main (String[] args){


         QuadratischeGleichung quadrat = new QuadratischeGleichung(3,-6,3);
         quadrat.gleichungLoesung();
          //parameterAusgaben();
    }
}
