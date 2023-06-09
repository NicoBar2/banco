/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author nicol
 */
public class Banco {

    private final Queue<String> colaClientes;
    private final Random random;

    public Banco() {
        colaClientes = new LinkedList<>();
        random = new Random();
    }

    public void llegadaCliente(String cliente) {
        colaClientes.add(cliente);
        System.out.println("Cliente " + cliente + " ha llegado al banco.");
    }

    public void atencionCliente() {
        if (!colaClientes.isEmpty()) {
            String cliente = colaClientes.poll();
            System.out.println("Atendiendo al cliente " + cliente + ".");
            int tiempoAtencion = random.nextInt(11) + 5; 
            try {
                Thread.sleep(tiempoAtencion * 1000); 
            } catch (InterruptedException e) {

            }
            System.out.println("El cliente " + cliente + " ha sido atendido.");
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }
}