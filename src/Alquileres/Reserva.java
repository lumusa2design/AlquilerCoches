/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquileres;


public class Reserva {
    private int id;
    private Seguro seguro;
    private TipoPago formaPago;
    
    public Reserva(int id, Seguro seguro, TipoPago formaPago){
        this.id = id;
        this.seguro = seguro;
        this.formaPago = formaPago;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the seguro
     */
    public Seguro getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the formaPago
     */
    public TipoPago getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(TipoPago formaPago) {
        this.formaPago = formaPago;
    }
}
