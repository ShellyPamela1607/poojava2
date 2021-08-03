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
public class Tarjeta extends Vehiculo {
    private String no_tarjeta,uso;

    public Tarjeta(){}
    public Tarjeta(String no_tarjeta, String uso, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos);
        this.no_tarjeta = no_tarjeta;
        this.uso = uso;
    }

    public String getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(String no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
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
    System.out.println("No_tarjeta: "+getNo_tarjeta());
    System.out.println("Uso: "+getUso());
    System.out.println("_______________________________________");
}
    
}
