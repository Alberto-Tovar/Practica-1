/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_poo;

/**
 *
 * @author Alberto
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String carrera;
    private String edad;
    private String apellidoPaterno;
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    //Constructor
    public Alumno(){
        
    }

    public Alumno(String matricula, String nombre, String carrera, String edad, String apellidoPaterno) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.apellidoPaterno = apellidoPaterno;
    }
    
    
}
