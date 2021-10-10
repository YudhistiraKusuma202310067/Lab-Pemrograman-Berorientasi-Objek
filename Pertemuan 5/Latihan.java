class camera{
    public double layar = 3.2;
    public String material = "Plastik ABS";
    public int baterai = 500;

    public void jenislayar(){
        System.out.println("Jenis layar yang digunakan adalah IPS Level");
    }

    public double ukuranlayar(){
        return this.layar;
    }

    public String bahan(){
        return this.material;
    }

    public int batre(){
        return this.baterai;
    }
}


class canon extends camera{
    public String jeniscamera = "DSLR";
    public String ukuransensor = "APS-C";
    public void sensor(){
        System.out.println("Jenis sensor yang digunakan adalah CMOS");
    }

    public String jenis(){
        return this.jeniscamera;
    }

    public String ukuran(){
        return this.ukuransensor;
    }
}

class sony extends camera{
    public String jenis, ukuran, sensor;
    public static String jenissensor;

    public void setjenis(String jenis){
    this.jenis = jenis;
    } 

    public String getjenis(){
        return jenis;
    }
    
    public void setukuran(String ukuran){
        this.ukuran = ukuran;
    } 

    public String getukuran(){
        return ukuran;
    }

    public void setsensor(String sensor){
        this.sensor = sensor;
    } 

    public String getsensor(){
        return sensor;
    }
}

public class Latihan {
    public static void main(String[] args){
        camera cmr = new camera();
        System.out.println("======== Class Camera (Main Class) ========");
        cmr.jenislayar();
        double ukuran = cmr.ukuranlayar();
        System.out.println("Ukuran layar pada kamera adalah "+ukuran+ " inch");
        String material = cmr.bahan();
        System.out.println("Material yang digunakan dalam pembuatan adalah "+material);
        int baterai = cmr.batre();
        System.out.println("Kapasitas baterai yang digunakan adalah "+baterai+" mAh");
        
        System.out.println();
        System.out.println("======== Class Canon (Sub Class) ========");
        canon cnn = new canon();
        cnn.jenislayar();
        ukuran = cnn.ukuranlayar();
        System.out.println("Ukuran layar pada kamera adalah "+ukuran+ " inch");
        material = cnn.bahan();
        System.out.println("Material yang digunakan dalam pembuatan adalah "+material);
        baterai = cnn.batre();
        System.out.println("Kapasitas baterai yang digunakan adalah "+baterai+" mAh");
        String jenis = cnn.jenis();
        System.out.println("Kamera ini termasuk jenis "+jenis);
        String luassensor = cnn.ukuran();
        System.out.println("Ukuran sensor yang digunakan adalah "+luassensor);
        cnn.sensor();

        System.out.println();
        System.out.println("======== Class Sony (Sub Class) ========");
        sony sny = new sony();
        sny.jenislayar();
        ukuran = sny.ukuranlayar();
        System.out.println("Ukuran layar pada kamera adalah "+ukuran+ " inch");
        material = sny.bahan();
        System.out.println("Material yang digunakan dalam pembuatan adalah "+material);
        baterai = sny.batre();
        System.out.println("Kapasitas baterai yang digunakan adalah "+baterai+" mAh");
        sny.setjenis("Mirrorless");
        jenis = sny.jenis;
        System.out.println("Kamera ini termasuk jenis "+jenis);
        sny.setukuran("Full Frame");
        luassensor = sny.ukuran;
        System.out.println("Ukuran sensor yang digunakan adalah "+luassensor);
        sny.setsensor("CCD (Charge-coupled device)");
        String jenissensor = sny.sensor;
        System.out.println("Jenis sensor yang digunakan adalah "+jenissensor);
    }
}