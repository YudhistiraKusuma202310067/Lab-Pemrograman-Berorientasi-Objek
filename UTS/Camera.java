public class Camera {
    public String jenislayar, material;
    public int ukuranlayar, baterai; 
    
    public void setjenislayar(String jenislayar){ 
        this.jenislayar = jenislayar; 
    } 
    
    public String getjenislayar(){ 
        return this.jenislayar; 
    } 
    
    public void setukuranlayar(int ukuranlayar){ 
        this.ukuranlayar = ukuranlayar; 
    } 
        
    public int getukuranlayar(){
        return this.ukuranlayar; 
    } 
        
    public void setmaterial(String material){ 
        this.material = material; 
    } 
        
    public String getmaterial(){ 
        return this.material; 
    } 

    public void setbaterai(int baterai){ 
        this.baterai = baterai; 
    } 
        
    public int getbaterai(){
        return this.baterai; 
    } 
}