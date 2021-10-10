public class person {

    private String nama, ttl, departemen, jurusan;
    private int umur, tinggi, berat;
    private double jarak, waktu;
    private static double detik;

    public static void main(String[] args){
        person data = new person();
        data.setname("Yudhistira Kusuma");
        String nama = data.getname();
        System.out.println("Name        : " +nama);
        
        data.setbirthdate("17 Desember 2002");
        String ttl = data.getbirthdate();
        System.out.println("Birthdate   : " +ttl);

        data.setdepartment("IBI Kesatuan");
        String departemen = data.getdepartment();
        System.out.println("Department  : " +departemen);

        data.setmajor("Teknologi Informasi");
        String jurusan = data.getmajor();
        System.out.println("Major       : " +jurusan);
    
        person data2 = new person();
        data2.setage(18);
        int umur = data2.getage();
        System.out.println("Age         : " +umur+ " Tahun");

        data2.setheight(170);
        int tinggi = data2.getheight();
        System.out.println("Height      : " +tinggi+ " Cm");

        data2.setweight(90);
        int berat = data2.getweight();
        System.out.println("Weight      : " +berat+ " Kg");

        data2.setdistance(6.7);
        double jarak = data2.getdistance();
        System.out.println("Distance    : " +jarak+ " Km");

        data2.settime(jarak);
        double waktu = data2.gettime();
        System.out.println("Time        : " +waktu+ " Menit atau " +detik+ " Detik");

    }

    public void setname(String x){
        this.nama = x;
    }

    public String getname(){
        return this.nama;
    }

    public void setbirthdate(String x){
        this.ttl = x;
    }

    public String getbirthdate(){
        return this.ttl;
    }
        
    public void setdepartment(String x){
        this.departemen = x;
    }

    public String getdepartment(){
        return this.departemen;
    }

    public void setmajor(String x){
        this.jurusan = x;
    }

    public String getmajor(){
        return this.jurusan;
    }

    public void setage(int x){
        this.umur = x;
    }

    public int getage(){
        return this.umur;
    }
        
    public void setheight(int x){
        this.tinggi = x;
    }

    public int getheight(){
        return this.tinggi;
    }

    public void setweight(int x){
        this.berat = x;
    }

    public int getweight(){
        return this.berat;
    }

    public void setdistance(double x){
        this.jarak = x;
    }

    public double getdistance(){
        return this.jarak;
    }

    public void settime(double x){
        this.waktu = x;
        waktu = jarak/80;
        detik = waktu*60;
    }

    public double gettime(){
        return this.waktu;
    }


}