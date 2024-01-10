/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorphismepbo;

/**
 *
 * @author USER
 */
class TestPolymorphism {
 
    public static void main(String[] args) {
        ObjekGeometri obj;
        obj = new PersegiPanjang (15,20);
        System.out.println(obj.getLuas());
        obj = new Segitiga (5,10);
        System.out.println(obj.getLuas());
        obj = new Lingkaran (5);
        System.out.println(obj.getLuas());
        obj = new Kotak (12);
        System.out.println(obj.getLuas());
    }
    
//    public static void main(String[] args) {
//        Kotak persegi = new Kotak();
//        persegi.setColor("Blue");;
//        ObjekGeometri bentukSem = new ObjekGeometri();
//        bentukSem.setColor("Black");
//        
//        displayObject(persegi);
//        displayObject(new Lingkaran());
//        displayObject(bentukSem);
//    }
//    public static void displayObject(ObjekGeometri obj){
//        System.out.println(obj.getColor());
//    }

}
