public class Handphone {

    public static int layar = 2;
    public int camera = 8;
    public static int batre = 24;
    //public static double hasil;
    

public static void main(String args[]){
    Handphone myobj = new Handphone();
    menelpon();
    //hasil = berfoto(camera);
    System.out.println("Kualitas foto hp ini adalah "+berfoto(myobj.camera)+" megapixel");
    //hasil = engine(camera, batre);
    System.out.println("Kekuatan engine nya sebesar "+engine(myobj.camera, batre)+" megavolt");        
}


    public static void menelpon(){
        System.out.println("Sedang menelpon dengan layar hp ke "+ layar );            
    }


    public static int berfoto(int x){
        Handphone myobj = new Handphone();
        myobj.camera = x * 6;
        return myobj.camera;
    }


    public static double engine(int x, int y){
        Handphone myobj = new Handphone();
        myobj.camera = x;
        batre = y;
        return batre / myobj.camera;
        //return Integer.parseInt(batre) / camera;
    }
}