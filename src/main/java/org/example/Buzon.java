package org.example;

public class Buzon {
    private String mensajeBuzon = "";

    // S
    public synchronized void leer()throws InterruptedException{
        while (mensajeBuzon.isEmpty()){
            System.out.println(Thread.currentThread().getName() + " No se puede leer, el buzón está vacío");
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " leyó el mensaje: \n" + mensajeBuzon + "\n-----------------------------------------------------\n");
        mensajeBuzon = "";
        notifyAll();
    }
    public synchronized void escribir(String mensajeNuevo)throws InterruptedException{
        while (!mensajeBuzon.isEmpty()){
            System.out.println(Thread.currentThread().getName() + " No se puede escribir, el buzón está lleno");
            wait();
        }
        mensajeBuzon = mensajeNuevo;
        System.out.println(Thread.currentThread().getName() + " escribió el mensaje: \n" + mensajeBuzon);

        notifyAll();
    }
}
