package org.example;

public class Lector extends Thread{
    Buzon buzon ;

    public Lector (String nombre, Buzon buzon){
        super(nombre);
        this.buzon = buzon;
    }

    // Lanzaremos la ejecución en un bucle ya que queremos que opere 3 veces cada hilo
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                buzon.leer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
