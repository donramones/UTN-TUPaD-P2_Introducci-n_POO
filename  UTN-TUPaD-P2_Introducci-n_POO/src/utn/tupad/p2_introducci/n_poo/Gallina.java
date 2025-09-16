/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.tupad.p2_introducci.n_poo;

/**
 *
 * @author rivar
 */
public class Gallina {
    int edad;
    int huevosPuestos;
    int idGallina;
    
    void ponerHuevos () {
        huevosPuestos ++;
    }
    void envejecer () {
        edad ++;
    }
    void mostrarEstado(int idGallina){
        System.out.println("La gallina " + idGallina + " ha puesto" + huevosPuestos + " y tiene " + edad + " anios");
    }
        
        
    
}
