/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorphismepbo;

/**
 *
 * @author USER
 */
public class Lingkaran extends ObjekGeometri {
    private double jarijari;
    private double phi = 3.14;
    
    Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    
    @Override
    public String getLuas(){
        return "Luas Lingkaran = "+ phi * jarijari * jarijari;
    }
       
}
