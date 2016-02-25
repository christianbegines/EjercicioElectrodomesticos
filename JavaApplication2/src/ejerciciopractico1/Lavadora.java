/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico1;

/**
 *
 * @author daw1
 */
public class Lavadora extends Electrodomestico{
    public double carga;
    public static final double CARGA_DEF=5;

    public Lavadora(double carga, double precioBase, String color, String consumoEnerg, double peso) {
        super(precioBase, color, consumoEnerg, peso);
        this.carga = carga;
    }

    public Lavadora() {
        this(CARGA_DEF,PRECIOBASE_DEF,COLOR_DEF,CONSUMOENERG_DEF,PESO_DEF);
    }
    
    public Lavadora(double peso,double precioBase){
        this(CARGA_DEF,precioBase,COLOR_DEF,CONSUMOENERG_DEF,peso);
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precio=0;
        if(carga>30){
           precio= super.precioFinal()+50;
        }               
        return precio ;
    }
    
}
