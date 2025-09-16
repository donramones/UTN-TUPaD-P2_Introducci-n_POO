/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utn.tupad.p2_introducci.n_poo;

/**
 *
 * @author rivar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante est1 = new Estudiante();
        
        //asignar valor a los atributos
        
        est1.nombre = "Agu";
        est1.apellido ="Rivarola";
        est1.curso = "Programacio_II";
        est1.calificacion = 7;
        
        est1.mostrarInfo();
        est1.subiCalificacion(2);
        est1.mostrarInfo();
        est1.bajarCalificacion(5);
        est1.mostrarInfo();
        
        //ejercicio 2
        Mascota masc2 = new Mascota();
                
        masc2.nombre = "chicha";
        masc2.especie = "Gato";
        masc2.edad = 6;
        
        masc2.mostrarInfo();
        masc2.cumpliAnios();
        masc2.mostrarInfo();
        
        //ejercicio 3
        Libro lib3 = new Libro();
        lib3.setAñoPublicacion(0);
        lib3.setAñoPublicacion(1999);
        System.out.println(lib3.getAñoPublicacion());
        System.out.println(lib3.getTitulo() + " " + lib3.getAutor() + " " + lib3.getAñoPublicacion());
        
        //ejercicio 4
        Gallina galli1 = new Gallina();
        Gallina galli2 = new Gallina();
        
        galli1.huevosPuestos = 3;
        galli1.edad = 1;
        galli1.ponerHuevos();
        galli1.mostrarEstado(1);
        
        galli2.huevosPuestos = 5;
        galli2.edad = 3;
        galli2.idGallina = 2;
        
        galli1.mostrarEstado(1);
        galli2.envejecer();
        galli2.ponerHuevos();
        galli1.mostrarEstado(1);
        galli1.idGallina = 1;
        
        galli1.mostrarEstado(1);
        galli1.envejecer();
        
        //ejercicio 5 
        NaveEspacial nave = new NaveEspacial("Nave1", 50);
        nave.despegar();
        nave.mostrarEstado();
        nave.avanzar(60);
        nave.recargarCombustible(20);
        nave.avanzar(60);
        nave.mostrarEstado();
        
        
    
                
    }
    
}
