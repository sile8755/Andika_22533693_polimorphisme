/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorphismepbo;

/**
 *
 * @author USER
 */
public class ObjekGeometri {
    private String Jenis;
    private String luas;
    private String color = "red";
    
    ObjekGeometri(){
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return this.color;    
    }
    public String getLuas(){
        return luas;
    }
    
}
