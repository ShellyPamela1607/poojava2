/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Shelly Pam
 */
public class Tipo extends Vehiculo{
    private String tipo;

    public Tipo() {}
    public Tipo(String tipo, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void agregar (){
    System.out.println("Placa: "+getPlaca());
    System.out.println("Chasis: "+this.getChasis());
    System.out.println("Serie: "+getSerie());
    System.out.println("Motor: "+getMotor());
    System.out.println("Cilindros: "+getCilindros());
    System.out.println("Marca: "+getMarca());
    System.out.println("Modelo: "+getModelo());
    System.out.println("Linea: "+getLinea());
    System.out.println("Asientos: "+getAsientos());
    System.out.println("Tipo: "+getTipo());
    System.out.println("_______________________________________");
}
    
}
