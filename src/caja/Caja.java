
package caja;


public class Caja {
    // Atributos
    int ancho;
    int alto;
    int profundo;
    
    //Constructores
    public Caja(){
        System.out.println("Ejecutando constructor.");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getProfundo() {
        return profundo;
    }
    
    public void setAncho(int ancho){
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    
    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    public int calcularVolumen() {
        int volumen = ancho  * alto * profundo;
        System.out.println("El volumen de la caja es: " + volumen);
        return volumen;
    }
}
