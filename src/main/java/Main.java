/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author nicol
 */
public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        int tiempoSimulacion = 60; 
        
        System.out.println("Bienvenido al Banco");
        System.out.println("Iniciando simulación por " + tiempoSimulacion + " minutos.");
        
        for (int i = 0; i < tiempoSimulacion; i++) {
            int numeroAleatorio = (int) (Math.random() * 100);
            if (numeroAleatorio > 30) { 
                String nuevoCliente = "Cliente " + (i + 1);
                banco.llegadaCliente(nuevoCliente);
            }
            banco.atencionCliente();
        }
        
        System.out.println("\nGracias por el uso de nuestros servicios.");
    }
}

