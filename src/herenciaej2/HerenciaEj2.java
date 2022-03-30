/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2;

import herenciaej2.entidades.ElectroDomestico;
import herenciaej2.entidades.Lavadora;
import herenciaej2.entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<ElectroDomestico> electroDom= new ArrayList();
        Lavadora lavaRopa= new Lavadora();
        Televisor tele= new Televisor();
        Scanner leer = new Scanner(System.in);
        int i;
        do{
        System.out.println("Introduce 1 para añadir una lavadora al carrito");
        System.out.println("Introduce 2 para añadir un televisor al carrito");
        System.out.println("Introduce 3 para salir y visualizar el precio de lo que llevas en el carrito");
        i= leer.nextInt();
        switch (i)
        {
            case 1:
                System.out.println("Agregaras una lavadora al carrito");
                electroDom.add(lavaRopa.crearLavadora());
                break;
            case 2:
                System.out.println("Agregaras un televisor al carrito");
                electroDom.add(tele.crearTelevisor());
            case 3:
                double precioTotal=0;
                for (ElectroDomestico aux: electroDom)
                {
                    aux.setPrecio(aux.precioFinal());
                    aux.getPrecio();
                    precioTotal+= aux.getPrecio();
                    System.out.println(aux);
                }
                System.out.println("El precio total es "+precioTotal);
                break;
            default:
                System.out.println("Las opciones soportadas son 1, 2 o 3 ");
                System.out.println("Por favor introduzca una opcion valida");
                break;
        }
        }while(i!=3);
    }  
}
