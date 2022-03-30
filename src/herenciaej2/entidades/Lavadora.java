/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2.entidades;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Lavadora extends ElectroDomestico {
    // Lavadora hereda de ElectroDomestico
    protected int carga;

    public Lavadora(int carga, double precio, String color, char consEnergetic, double peso) {
        super(precio, color, consEnergetic, peso);
        this.carga = carga;
    }

    public Lavadora() {
        
    }
    
    public Lavadora crearLavadora()
    {
        //Crea una instancia de la clase Lavadora usando en primera instancia el metodo de la clase padre
        // crearElectrodomestico() y se le adhiere los atributos propios de la clase Lavadora
        Scanner leer= new Scanner(System.in);
        ElectroDomestico elec= super.crearElectroDomestico();
        System.out.println("Introduza la carga de la lavadora");
        int carga= leer.nextInt();
        return new Lavadora(carga,elec.precio,elec.color,elec.consEnergetic,elec.peso);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public double precioFinal()
    {
        double precio = super.precioFinal(); 
        //Se comienza con el metodo precioFinal del padre y a ese valor se le adhiere el valor carga
        if(carga>30)
        {
            precio+=500d;
            return precio;
        }
        else
        {
            return precio;
        }
    }
    
    @Override
    public String toString() {
        return "Lavadora " +" precio: "+precio+", color: "+color+", consumo energetico: "+consEnergetic+", peso: "+peso+ ", carga: " + carga + '}';
    }
    
    
    
    
    
}
