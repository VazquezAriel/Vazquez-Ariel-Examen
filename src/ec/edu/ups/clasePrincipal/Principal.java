/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasePrincipal;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author ariel
 */
public class Principal {
    public static void main(String[] args) {
        ElectrodomesticoDAO electrodomesticoDAO = new ElectrodomesticoDAO();
        VistaElectrodomestico vistaElectrodomestico = new VistaElectrodomestico();
        ControladorElectrodomestico controladorElectrodomestico = new ControladorElectrodomestico(vistaElectrodomestico, electrodomesticoDAO);
         
        System.out.println("----------------------------------------------------------");
        System.out.println("                    ElectrodomesticoS UPS");
        System.out.println("----------------------------------------------------------\n");
        
        for (int i = 1; i < 4; i++) {
            System.out.println("ingrese el Televisor #" + i + ":  ");
            controladorElectrodomestico.registrarTelevision();
            System.out.println("----------------------------------------------------------");
        }
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese la Lavadora #" + i + ":  ");
            controladorElectrodomestico.RegistrarLavadora();
            System.out.println("----------------------------------------------------------");
            
        }
        controladorElectrodomestico.verTelevisiones();
        controladorElectrodomestico.verLavadoras();
    }
    
}
