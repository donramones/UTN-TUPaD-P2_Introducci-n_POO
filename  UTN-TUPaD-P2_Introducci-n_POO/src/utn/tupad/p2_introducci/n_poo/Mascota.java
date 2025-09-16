/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.tupad.p2_introducci.n_poo;

/**
 *
 * @author rivar
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("nombre mascota: " + nombre + " " + "especie: " +  especie + " " + "Anios " + edad);
    }
    void cumpliAnios(){
        edad ++;
        
    }
    
}
