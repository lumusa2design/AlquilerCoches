/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alquileres;


public class Vehiculo {
    private String modelo;
    private int plazas;
    private TipoVehiculo tipo;
    private int numPuertas;
    private Combustible combustible;
    private boolean aireAcon;
    private Cambio cambio;
    
    public Vehiculo(String modelo, int plazas, TipoVehiculo tipo, int numPuertas,
            Combustible combustible, boolean aireAcon, Cambio cambio){
        this.modelo = modelo;
        this.plazas = plazas;
        this.tipo = tipo;
        this.numPuertas = numPuertas;
        this.combustible = combustible;
        this.aireAcon = aireAcon;
        this.cambio = cambio;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the plazas
     */
    public int getPlazas() {
        return plazas;
    }

    /**
     * @param plazas the plazas to set
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    /**
     * @return the tipo
     */
    public TipoVehiculo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numPuertas
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * @param numPuertas the numPuertas to set
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     * @return the combustible
     */
    public Combustible getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the aireAcon
     */
    public boolean isAireAcon() {
        return aireAcon;
    }

    /**
     * @param aireAcon the aireAcon to set
     */
    public void setAireAcon(boolean aireAcon) {
        this.aireAcon = aireAcon;
    }

    /**
     * @return the cambio
     */
    public Cambio getCambio() {
        return cambio;
    }

    /**
     * @param cambio the cambio to set
     */
    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }
}
