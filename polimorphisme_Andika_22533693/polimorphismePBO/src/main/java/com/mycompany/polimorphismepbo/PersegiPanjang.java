package com.mycompany.polimorphismepbo;

/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PersegiPanjang extends ObjekGeometri{
   private double panjang, lebar;
    
    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public String getLuas(){
        return "Luas Persegi Panjang = "+ panjang * lebar;
    }
}
