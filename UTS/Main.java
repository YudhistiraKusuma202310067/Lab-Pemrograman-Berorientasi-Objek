import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private String[] MenuList = {"Menginput Product","Melihat Product"};
    private String[] MyProduct = {"Canon","Sony"};
    private List<Canon> listcanon  = new ArrayList<Canon>();
    private List<Sony> listsony  = new ArrayList<Sony>();

    public static void main(String[] args) {
        Main m = new Main();
        m.InputMenu();        
    }

    public void InputMenu() {
        System.out.println("\n--SELAMAT DATANG DI IT STORE--\n");
        System.out.println("Silahkan Pilih Menu yang Anda Inginkan : ");
        int i=1;
        for (String mn : this.MenuList) {
            System.out.println(i+". "+mn);
            i++;
        }
        System.out.print("Menu yang Dipilih : ");
        Scanner myObj = new Scanner(System.in);
        String inputMenu = myObj.nextLine();
        int menu = Integer.parseInt(inputMenu);

        switch (menu) {
            case 1:
                this.InputMenuProduct();
                break;
            case 2:
                this.ShowMenuProduct();
                break;
        
            default:
            System.out.println("Pilihan tidak terdaftar");
                break;
        }
        //myObj.close();
    }

    public void InputMenuProduct(){
        System.out.println("\n-------------------");
        System.out.println("Input Product");
        System.out.println("-------------------\n");
        System.out.println("Pilih Produk:");
        int i=1;
        for (String p : MyProduct) {
            System.out.println(i+". "+p);
            i++;
        }
        System.out.print("Produk yang Dipilih : ");
        Scanner myObj = new Scanner(System.in);
        String inputProduct = myObj.nextLine();
        int product = Integer.parseInt(inputProduct);
        switch (product) {
            case 1:                
                try {
                    listcanon = this.InputCanon();         
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk Canon");
                    System.out.println("Error: "+e.getMessage());
                }   
            
            
                break;
            case 2:
            try {
                listsony = this.InputSony();         
                this.InputMenu();               
            } catch (Exception e) {
                System.out.println("Failed error input produk Sony");
                System.out.println("Error: "+e.getMessage());
            }    
                
                break;
        
            default:
                break;
        }
        //myObj.close();
    }

    public List InputCanon() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Canon===");
        System.out.print("Masukan jumlah data yang akan dimasukkan : ");
        String data = myObj.nextLine();
        int jmlData = Integer.parseInt(data);

        for (int i = 0; i < jmlData; i++){   
            System.out.println("Data ke-"+(i+1)+":\n");    
            Canon cnn = new Canon();
            System.out.print("Tipe Kamera      : ");
            String tipeseries = myObj.nextLine();
            cnn.settipeseries(tipeseries);

            System.out.print("Jenis Layar      : ");
            String jenislayar = myObj.nextLine();
            cnn.setjenislayar(jenislayar);

            System.out.print("Ukuran Layar     : ");
            String ukuranlayar = myObj.nextLine();
            int layar = Integer.parseInt(ukuranlayar.trim());
            cnn.setukuranlayar(layar);

            System.out.print("Material         : ");
            String material = myObj.nextLine();
            cnn.setmaterial(material);

            System.out.print("Baterai          : ");
            String baterai = myObj.nextLine();
            int batre = Integer.parseInt(baterai.trim());
            cnn.setbaterai(batre);

            System.out.print("Jenis Kamera     : ");
            String jeniscamera = myObj.nextLine();
            cnn.setjeniscamera(jeniscamera);

            System.out.print("Jenis Sensor     : ");
            String jenissensor = myObj.nextLine();
            cnn.setjenissensor(jenissensor);

            System.out.print("Ukuran Sensor    : ");
            String ukuransensor = myObj.nextLine();
            cnn.setukuransensor(ukuransensor);

            System.out.println("---------------------------");
            this.listcanon.add(cnn); 
        }
        
        System.out.println("\n");
        //myObj.close();
        return this.listcanon;
        
    }

    public List InputSony() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Sony===");
        System.out.print("Masukan jumlah data yang akan dimasukkan : ");
        String data = myObj.nextLine();
        int jmlData = Integer.parseInt(data);

        for (int i = 0; i < jmlData; i++){   
            System.out.println("Data ke-"+(i+1)+":\n");    
            Sony sny = new Sony();
            System.out.print("Tipe Kamera      : ");
            String tipeseries = myObj.nextLine();
            sny.settipeseries(tipeseries);

            System.out.print("Jenis Layar      : ");
            String jenislayar = myObj.nextLine();
            sny.setjenislayar(jenislayar);

            System.out.print("Ukuran Layar     : ");
            String ukuranlayar = myObj.nextLine();
            int layar = Integer.parseInt(ukuranlayar.trim());
            sny.setukuranlayar(layar);

            System.out.print("Material         : ");
            String material = myObj.nextLine();
            sny.setmaterial(material);

            System.out.print("Baterai          : ");
            String baterai = myObj.nextLine();
            int batre = Integer.parseInt(baterai.trim());
            sny.setbaterai(batre);

            System.out.print("Jenis Kamera     : ");
            String jeniscamera = myObj.nextLine();
            sny.setjeniscamera(jeniscamera);

            System.out.print("Jenis Sensor     : ");
            String jenissensor = myObj.nextLine();
            sny.setjenissensor(jenissensor);

            System.out.print("Ukuran Sensor    : ");
            String ukuransensor = myObj.nextLine();
            sny.setukuransensor(ukuransensor);

            System.out.println("---------------------------");
            this.listsony.add(sny); 
        }
        
        System.out.println("\n");
        //myObj.close();
        return this.listsony;
        
    }

    public void ShowMenuProduct(){
        for(Canon cnn : listcanon) {
            System.out.println("\n==================================");
            System.out.println("====== Katalog Kamera Canon ======");
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

        for(Sony sny  : listsony) {
            System.out.println("\n==================================");
            System.out.println("====== Katalog Kamera Sony =======");
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