package TP05;

import java.math.*;

public class Koordinat {
    private int x;
    private int y;
    
    public Koordinat(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double hitungJarak(Koordinat k){
        double x1 = Math.pow(x - k.x, 2);
        double y1 = Math.pow(y - k.y, 2);
        double jarak = Math.sqrt(x1 + y1);
        return jarak;
    }
}
