import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Main m = new Main();
       System.out.print("Masukkan Judul   : ");
       Scanner myObj = new Scanner(System.in);
       String judul = myObj.nextLine();
       System.out.println("Output           : " +judul);
       System.out.println();
       LinkedList<Canon> listcanon = new LinkedList<Canon>();
                
       for (int i = 0; i < 1; i++){       
            System.out.println("====== Katalog Kamera Canon ======");
            Canon cnn = new Canon();
            System.out.print("Tipe Kamera      : ");
            String tipeseries = myObj.nextLine();
            System.out.print("Jenis Layar      : ");
            String jenislayar = myObj.nextLine();
            System.out.print("Ukuran Layar     : ");
            String ukuranlayar = myObj.nextLine();
            System.out.print("Material         : ");
            String material = myObj.nextLine();
            System.out.print("Baterai          : ");
            String baterai = myObj.nextLine();
            System.out.print("Jenis Kamera     : ");
            String jeniscamera = myObj.nextLine();
            System.out.print("Jenis Sensor     : ");
            String jenissensor = myObj.nextLine();
            System.out.print("Ukuran Sensor    : ");
            String ukuransensor = myObj.nextLine();

            cnn.settipeseries(tipeseries);
            cnn.setjenislayar(jenislayar);
            int layar = Integer.parseInt(ukuranlayar.trim());
            cnn.setukuranlayar(layar);
            cnn.setmaterial(material);
            int batre = Integer.parseInt(baterai.trim());
            cnn.setbaterai(batre);
            cnn.setjeniscamera(jeniscamera);
            cnn.setjenissensor(jenissensor);
            cnn.setukuransensor(ukuransensor);
               
            listcanon.add(cnn);  
       }

       for(Canon cnn : listcanon) {
           System.out.println("==================================");
           System.out.println("Tipe Kamera      : "+cnn.gettipeseries());
           System.out.println("Jenis Layar      : "+cnn.getjenislayar());
           System.out.println("Ukuran Layar     : "+cnn.getukuranlayar()+ " inch");
           System.out.println("Material         : "+cnn.getmaterial());
           System.out.println("Baterai          : "+cnn.getbaterai()+ " mAh");
           System.out.println("Jenis Kamera     : "+cnn.getjeniscamera());
           System.out.println("Jenis Sensor     : "+cnn.getjenissensor());
           System.out.println("Ukuran Sensor    : "+cnn.getukuransensor());
       }
   

       LinkedList<Sony> listsony = new LinkedList<Sony>();
       System.out.println();  
       for (int i = 0; i < 1; i++){       
        System.out.println("====== Katalog Kamera Sony ======");
        Sony sny = new Sony();
        System.out.print("Tipe Kamera      : ");
        String tipeseries = myObj.nextLine();
        System.out.print("Jenis Layar      : ");
        String jenislayar = myObj.nextLine();
        System.out.print("Ukuran Layar     : ");
        String ukuranlayar = myObj.nextLine();
        System.out.print("Material         : ");
        String material = myObj.nextLine();
        System.out.print("Baterai          : ");
        String baterai = myObj.nextLine();
        System.out.print("Jenis Kamera     : ");
        String jeniscamera = myObj.nextLine();
        System.out.print("Jenis Sensor     : ");
        String jenissensor = myObj.nextLine();
        System.out.print("Ukuran Sensor    : ");
        String ukuransensor = myObj.nextLine();

        sny.settipeseries(tipeseries);
        sny.setjenislayar(jenislayar);
        int layar = Integer.parseInt(ukuranlayar.trim());
        sny.setukuranlayar(layar);
        sny.setmaterial(material);
        int batre = Integer.parseInt(baterai.trim());
        sny.setbaterai(batre);
        sny.setjeniscamera(jeniscamera);
        sny.setjenissensor(jenissensor);
        sny.setukuransensor(ukuransensor);
           
        listsony.add(sny);   
            }

       for(Sony sny : listsony) {
           System.out.println("==================================");
           System.out.println("Tipe Kamera      : "+sny.gettipeseries());
           System.out.println("Jenis Layar      : "+sny.getjenislayar());
           System.out.println("Ukuran Layar     : "+sny.getukuranlayar()+ " inch");
           System.out.println("Material         : "+sny.getmaterial());
           System.out.println("Baterai          : "+sny.getbaterai()+ " mAh");
           System.out.println("Jenis Kamera     : "+sny.getjeniscamera());
           System.out.println("Jenis Sensor     : "+sny.getjenissensor());
           System.out.println("Ukuran Sensor    : "+sny.getukuransensor());
       }
    }
}
