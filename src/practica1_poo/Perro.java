/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_poo;

/**
 *
 * @author Alberto
 */
public class Perro {
    private String raza;
    private int edad;
    private String nombre;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro(){
        
    }

    public Perro(String raza, int edad, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }

}
