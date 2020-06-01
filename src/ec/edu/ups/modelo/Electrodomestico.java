/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ariel
 */
public class Electrodomestico implements Comparable{
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double obtenerPrecioFinal() {
        if (this.consumoEnergetico == 'A') {
            this.precioBase += 100;
        }
        if (this.consumoEnergetico == 'B') {
            this.precioBase += 80;
        }
        if (this.consumoEnergetico == 'C') {
            this.precioBase += 60;
        }
        if (this.consumoEnergetico == 'D') {
            this.precioBase += 50;
        }
        if (this.consumoEnergetico == 'E') {
            this.precioBase += 30;
        }
        if (this.consumoEnergetico == 'F') {
            this.precioBase += 10;
        }
        
        if (this.peso >= 20 && this.peso <= 49) {
            this.precioBase += 50;
        }
        if (this.peso >= 50 && this.peso <= 79) {
            this.precioBase += 80;
        }
        if (this.peso >= 80) {
            this.precioBase += 100;
        }
        return this.precioBase;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        Electrodomestico e = (Electrodomestico) o;
        
        if (this.obtenerPrecioFinal() < e.obtenerPrecioFinal()) {
            return resultado;
        }
        if(this.obtenerPrecioFinal() < e.obtenerPrecioFinal()) {
            resultado = -1;
        } else {
            resultado = 1;
        }
        return resultado;
    }
}
