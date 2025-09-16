/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.tupad.p2_introducci.n_poo;

/**
 *
 * @author rivar
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " " + curso + " " + "Calificacion: " + calificacion);
    }
    double subiCalificacion(double puntos){
        calificacion += puntos;
        return calificacion;    
    }
    double bajarCalificacion(double puntos){
        calificacion -= puntos;
        return calificacion;
    
    }
    
    
}
