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
public class ElectroDomestico 
{
    //ElectroDomestico es una clase de la cual heredaremos atributos para las clases Lavadora y Televisor
    //Podria ser una clase abstracta
    protected double precio;
    protected String color;
    protected char consEnergetic;
    protected double peso;

    public ElectroDomestico(double precio, String color, char consEnergetic, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consEnergetic = comprobarConsumoEnergetico(consEnergetic);
        this.peso = peso;
    }
    public char comprobarConsumoEnergetico(char letra)
    {
        if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F')
            //Si la letra no corresponde A,B,C,D,E o F consumo energetico es F
        {
            //Todo ok
            return letra;
        }
        else
        {
            return 'F';
        }
    }
    public String comprobarColor(String color)
    {
        if (color.equals("blanco")||color.equals("negro")||color.equals("azul")||color.equals("gris"))
            //Si el color introducido por el usuario no es blanco,negro,azul o gris se retorna blanco
        {
            //Todo ok
            return color;
        }
        else
        {
            return "blanco";
        }
    }

    public ElectroDomestico() {
    }
    public ElectroDomestico crearElectroDomestico() 
        //Dentro de la misma clase tenemos un metodo que retorna una instancia de la clase
    {
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce el color");
        String color = new String(leer.next().toLowerCase());
        System.out.println("Introduce el consumo energetico: A, B, C, D, E, F");
        char letra= leer.next().toUpperCase().charAt(0);
        System.out.println("Introducir el peso");
        double peso= leer.nextDouble();
        double precio = 1000;
        return new ElectroDomestico(precio,color,letra,peso);
        
    }
    
    public double precioFinal()
    {
        switch (consEnergetic)
            //Segun el valor de consumo energetico se le suma cierto valor a precio final
        {
            case 'A':
                precio= precio+1000;
                break;
            case 'B':
                precio= precio+800;
                break;
            case 'C':
                precio= precio+600;
                break;
            case 'D':
                precio= precio+500;
                break;
            case 'E':
                precio= precio+300;
                break;
            case 'F':
                precio= precio+100;
                break;
        }
        if(peso>=1d && peso<=19d)
            //Segun el peso se le suma a precio final otro valor
        {
            precio= precio+100d;
        }
        else if (peso>=20d && peso<=49d)
        {
            precio+=500;
        }
        else if (peso>=50d && peso<=79d)
        {
            precio+=800;
        }
        else if (peso>=80d)
        {
            precio+=1000;
        }
        return precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsEnergetic() {
        return consEnergetic;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsEnergetic(char consEnergetic) {
        this.consEnergetic = consEnergetic;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ElectroDomestico { " + " precio = " + precio + ", color = " + color + ", consEnergetic = " + consEnergetic + ", peso = " + peso + '}';
    }
    
    
}
