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
public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected String consumoEnerg;
    protected double peso;

    protected final static String COLOR_DEF = "BLANCO";
    protected final static String CONSUMOENERG_DEF = "F";
    protected final static double PRECIOBASE_DEF = 100;
    protected final static double PESO_DEF = 5;

    public Electrodomestico() {
        this(PRECIOBASE_DEF, COLOR_DEF, CONSUMOENERG_DEF, PESO_DEF);

    }

    public Electrodomestico(double precioBase, String color, String consumoEnerg, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprovarColor(color);
        comprovarConsumo(consumoEnerg);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, COLOR_DEF, CONSUMOENERG_DEF, peso);
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

    public String getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(String consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprovarColor(String color) {
        String colores[] = {"Blanco", "Azul", "Negro", "Gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_DEF;
        }
    }
    
    private void comprovarConsumo(String consumoEnerg){
        String tiposConsumo []={"A","B","C","D","E","F"};
        boolean find=false;
        for(int i = 0;i<tiposConsumo.length && !find;i++){
            if(tiposConsumo[i].equalsIgnoreCase(consumoEnerg)){
               
                find=true;
            }
        }
        if(find){
             this.consumoEnerg=consumoEnerg;
        } else {
            this.consumoEnerg=CONSUMOENERG_DEF;
        }
    }
    public double precioFinal(){
        double resultado=0,precio;
        switch(consumoEnerg){
            case "A":precio=100;
            case "B":precio=80;
            case "C":precio=60;
            case "D":precio=40;
            case "E":precio=20;
            case "F":precio=10;        
        }
        return resultado;
    }
}
