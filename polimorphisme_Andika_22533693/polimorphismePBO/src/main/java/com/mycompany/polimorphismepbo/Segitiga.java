/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorphismepbo;

/**
 *
 * @author USER
 */
public class Segitiga extends ObjekGeometri {
     private double alas, tinggi;
    
    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public String getLuas(){
        return "Luas Segitiga = "+0.5 * alas * tinggi;
    }
    
}
