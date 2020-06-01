/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class VistaElectrodomestico {
    
    private Scanner entrada;

    public VistaElectrodomestico() {
        entrada = new Scanner(System.in);
    }
    
    public Television ingresarTelevision(){
        Television tv = new Television();
        
        System.out.print("Codigo:  ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Descripcion:  ");
        String descripcion = entrada.nextLine();
        
        System.out.print("Precio:  ");
        double precio = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.print("Color:  ");
        String color = entrada.nextLine();
        
        System.out.print("Consumo Energetico:  ");
        String consumo1 = entrada.next();
        char consumo = consumo1.charAt(0);
        
        System.out.print("Peso:  ");
        int peso = entrada.nextInt();
        
        System.out.print("Resolucion:  ");
        int resolucion = entrada.nextInt();
        
        System.out.print("Cuenta con Puerto HDMI (true/false):  ");
        boolean hdmi = entrada.nextBoolean();
        
        tv.setCodigo(codigo);
        tv.setDescripcion(descripcion);
        tv.setPrecioBase(precio);
        tv.setColor(color);
        tv.setConsumoEnergetico(consumo);
        tv.setPeso(peso);
        tv.setResolucion(resolucion);
        tv.setPuertoHDMI(hdmi);
        
        return tv;
    }
    
    public Lavadora ingresarLavadora() {
        Lavadora lavadora = new Lavadora();
        
        System.out.print("Codigo:  ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Descripcion:  ");
        String descripcion = entrada.nextLine();
        
        System.out.print("Precio:  ");
        double precio = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.print("Color:  ");
        String color = entrada.nextLine();
        
        System.out.print("Consumo Energetico:  ");
        String consumo1 = entrada.next();
        char consumo = consumo1.charAt(0);
        
        System.out.print("Peso:  ");
        int peso = entrada.nextInt();
        
        System.out.print("Carga:  ");
        int carga = entrada.nextInt();
        
        lavadora.setCodigo(codigo);
        lavadora.setDescripcion(descripcion);
        lavadora.setPrecioBase(precio);
        lavadora.setColor(color);
        lavadora.setConsumoEnergetico(consumo);
        lavadora.setPeso(peso);
        lavadora.setCarga(carga);
        
        return lavadora;
    }
    
    public void mostrarLavadora(List<Lavadora> lavadoras) {
        System.out.println("\nLavadoras: \n");
        System.out.println(lavadoras);
    }
    
    public void mostrarTelevisiones(List<Television> televisiones) {
        System.out.println("Televisiones: \n");
        System.out.println(televisiones);
    }
}
