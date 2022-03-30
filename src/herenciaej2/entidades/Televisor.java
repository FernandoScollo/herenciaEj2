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
public class Televisor extends ElectroDomestico{
    protected float resolucion;
    protected boolean tdt;

    public Televisor(float resolucion, boolean tdt, double precio, String color, char consEnergetic, double peso) {
        super(precio, color, consEnergetic, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor() {
    }
    
    public Televisor crearTelevisor()
    {
        //Crea una instancia de la clase Televisor usando en primera instancia el metodo de la clase padre
        // crearElectrodomestico() y se le adhiere los atributos propios de la clase Televisor
        Scanner leer= new Scanner(System.in);
        ElectroDomestico elec= super.crearElectroDomestico();
        System.out.println("Tiene sintonizador TDA?");
        String tdtS= leer.next();
        if(tdtS.equals("si"))
        {    
        boolean tdt= true;
        }
        else
        {
        boolean tdt= false;
        }
        System.out.println("De cuantas pulgadas es?");
        float resolucion=leer.nextFloat();
        return new Televisor(resolucion,tdt,elec.precio,elec.color,elec.consEnergetic,elec.peso);
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public double precioFinal()
    {
        //Se comienza con el metodo precioFinal del padre y a ese valor se le adhiere el valor
        //correspondiente a resolucion y tdt
        double precio = super.precioFinal();
        if(resolucion>40)
        {
            precio= precio +(precio*0.30);
        }
        if (tdt==true)
        {
            precio+=500;
        }
        System.out.println(precio);
        return precio;
    }

    @Override
    public String toString() {
        return "Televisor " +" precio: "+precio+", color: "+color+", consumo energetico: "+consEnergetic+", peso: "+peso+ ", resolucion: " + resolucion + ", tdt: " + tdt + '}';
    }
    
    
    
}
