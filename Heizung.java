import javax.swing.*;

public class Heizung {

    public static int temperatur ;
    private static  int min ;
    private static int max ;
    public static int schrittweite;


    public  Heizung()
    {
      temperatur = 15;

    }
     public  Heizung( int mi , int ma)
     {
         this.min=mi;
         this.max=ma;
         schrittweite= 5;

     }


    public static void waermer(){
      if (temperatur>= max)
      {
          JOptionPane.showMessageDialog(null, "la temperature est superieur au max");
      }
    temperatur+= schrittweite;

    }
     public static void kueler()
     {
    if (temperatur<=min){
         JOptionPane.showMessageDialog(null,"temperature est inferieur au min");
    }
         temperatur= temperatur - schrittweite;


     }


     public static int gibTemperatur()
     {
         return temperatur;
     }

     public  static void  setzeSchrittweite(int schritt)
     {
    schrittweite = schritt;

     }


    public static void setMax(int max) {
        Heizung.max = max;
    }

    public static void setMin(int min) {
        Heizung.min = min;
    }

    public static void parameterAusgaben()
    {
        System.out.println("maxtemperatur est " +  max);
        System.out.println("mintemperatur est " +  min);
        System.out.println("temperatur est " +  gibTemperatur());

        System.out.println("schrittweite est " +  schrittweite);
    }

    public static void main(String[] args)
    {
        Heizung heizung  = new Heizung();
        Heizung heizung2 = new Heizung(20,13);
         setzeSchrittweite(6);
         heizung2.kueler();
        //heizung2.waermer(); //  pour utiliser ce construktor retirer les deux barres(//)

        //heizung.kueler();  // pour utiliser ce construktor retirer les deux barres(//)
      // heizung.waermer();  // pour utiliser ce construktor retirer les deux barres(//)
       //System.out.println(gibTemperatur());
       parameterAusgaben();
    }
}
