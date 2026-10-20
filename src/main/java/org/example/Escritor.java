package org.example;

public class Escritor extends Thread{
    String mensaje = "";
    Buzon buzon;

    public Escritor (String mensaje, String nombre, Buzon buzon){
        super(nombre);
        this.mensaje = mensaje;
        this.buzon = buzon;
    }

    // Lanzaremos la ejecución en un bucle ya que queremos que opere 3 veces cada hilo
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                buzon.escribir(mensaje);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
