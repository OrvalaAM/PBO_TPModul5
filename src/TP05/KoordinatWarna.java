package TP05;

public class KoordinatWarna extends Koordinat {
    private String warna;
    public KoordinatWarna(int x, int y, String warna){
        super(x, y);
        this.warna = warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public String hitungJarak(KoordinatWarna k){
        double x1 = Math.pow(super.getX() - k.getX(), 2);
        double y1 = Math.pow(super.getY() - k.getY(), 2);
        double jarak = Math.sqrt(x1 + y1);
        System.out.println(jarak);
        return warna;
    }
}
