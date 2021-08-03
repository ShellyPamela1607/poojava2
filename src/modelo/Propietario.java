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
public class Propietario extends Persona {
    private String nit;
    private double cui;

    public Propietario(String nit, double cui, String nombres, String apellidos, String direccion, int telefono, int edad, Date fecha_nacimiento, Date fechaact) {
        super(nombres, apellidos, direccion, telefono, edad, fecha_nacimiento,fechaact);
        this.nit = nit;
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getCui() {
        return cui;
    }

    public void setCui(double cui) {
        this.cui = cui;
    }
  
    
@Override
    public void agregar (){
          
    System.out.println("Nit: "+getNit());
    System.out.println("Cui: "+getCui());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Direccion: "+getDireccion());
    System.out.println("Telefono: "+getTelefono());
    System.out.println("Fecha Nacimiento: "+getFecha_nacimiento());
    System.out.println("_______________________________________");
}
}