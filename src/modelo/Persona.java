/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Date;
/**
 *
 * @author Shelly Pam
 */
abstract class Persona {
    private String nombres,apellidos,direccion;
    private int telefono,edad;
    private Date fecha_nacimiento,fechaact;

    public Persona(String nombres, String apellidos, String direccion, int telefono, int edad, Date fecha_nacimiento, Date fechaact) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fechaact = fechaact;
    }
    //Date.fechaact=new Date();
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
     public Date getFechaact() {
        return fechaact;
    }

    public void setFechaact(Date fechact) {
        this.fechaact = fechaact;
        
    }
    
    
    
    protected void agregar(){}
    protected void mostrar(){}
}
