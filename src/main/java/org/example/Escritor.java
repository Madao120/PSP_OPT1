package org.example;

public class Escritor extends Thread{
    String mensaje;
    int contador = 3;
    public Escritor (String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public void run(){
        while(contador > 0){
            if(Buzon.mensaje.isEmpty()){
                Buzon.escribir(mensaje);
                contador--;
            }
        }
    }
}
