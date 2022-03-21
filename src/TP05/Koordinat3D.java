package TP05;

public class Koordinat3D extends Koordinat{
    private int z;
    public Koordinat3D(int x, int y, int z){
        super(x,y);
        this.z  = z;
    }
    
    public void setZ(int z){
        this.z = z;
    }
    
    public int getZ(){
        return z;
    }
    
    public double hitungJarak(Koordinat3D k){
        double x1 = Math.pow(super.getX() - k.getX(), 2);
        double y1 = Math.pow(super.getY() - k.getY(), 2);
        double z1 = Math.pow(this.z - k.z, 2);
        double jarak = Math.sqrt(x1 + y1 + z1);
        return jarak;
    }
}
