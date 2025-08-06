/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_poo;

/**
 *
 * @author Alberto
 */
public class Practica1_poo {

    public static void main(String[] args) {
        
        //int x=0;
        //Alumno y = new Alumno();
        //y.setMatricula("");
        //y.setNombre("");
        Perro a = new Perro(); //Usando el 1er constructor
        Perro b = new Perro("Labrador",7,"Terron de azúcar"); //Usando el 2do
        

        // Mostrar los datos del perro sin cambiar valores y usando el constructor 1 con valores por defecto
        System.out.println("Primer perro:");
        System.out.println("Raza: " + a.getRaza());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nombre: " + a.getNombre());

        // Cambiar los valores del mismo perro
        a.setRaza("Pastor Alemán");
        a.setEdad(5);
        a.setNombre("Rocky");

        // Mostrar los nuevos datos
        System.out.println("\nDatos actualizados:");
        System.out.println("Raza: " + a.getRaza());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nombre: " + a.getNombre());
        
        // Mostrar los datos del 2do objeto
        System.out.println("\nDatos actualizados:");
        System.out.println("Raza: " + b.getRaza());
        System.out.println("Edad: " + b.getEdad());
        System.out.println("Nombre: " + b.getNombre());
        
        //Hola git hub este es mi 2do cambio
    }
}