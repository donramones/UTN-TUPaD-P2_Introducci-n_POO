/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.tupad.p2_introducci.n_poo;

/**
 *
 * @author rivar
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCombustible() {
        return combustible;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    public void despegar(){
        System.out.println("La nave despegó.");
    }
    public boolean suficienteCombustible(int distancia){
        return this.combustible > distancia;
    }
    public void avanzar(int distancia){
        if (suficienteCombustible(distancia)){
            System.out.println("La nave avanzó la distancia de "+distancia+".");
            this.combustible -= distancia;
        }else{
            System.out.println("No tienes suficiente combustible para avanzar "+ distancia +".");
        }
    }
    public void recargarCombustible(int cantidad){
         //la nave puede cargar hasta 100 unidades
        if (cantidad + this.combustible > 100){
            System.out.println("El tanque tiene "+ this.combustible + " unidades de combustible.");
            System.out.println("No se puede cargar más que "+ (100 - this.combustible)+" unidades de combustible");
            System.out.println("Intentelo otra vez.");
        }else{
            this.combustible+= cantidad;
            System.out.println("Se cargaron "+cantidad+" unidades de combustible.");
            System.out.println("El tanque tiene "+ this.combustible +" unidades de combustible.");
            
        }
    }
    public void mostrarEstado(){
        System.out.println("La nave tiene "+this.combustible+" unidades de combustible.");
    }
     
}
