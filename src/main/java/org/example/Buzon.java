package org.example;

public class Buzon {
    private String mensajeBuzon = "";

    // Méthod sincronizado para leer el mensaje del buzón, quitando el mensaje al acabar para dar paso a un mensaje nuevo, en caso de no tener, haremos que espere, hasta que salga un notifyAll() en cuyo caso volverá a activarse.
    public synchronized void leer()throws InterruptedException{
        while (mensajeBuzon.isEmpty()){
            System.out.println(Thread.currentThread().getName() + " No se puede leer, el buzón está vacío");
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " leyó el mensaje: \n" + mensajeBuzon + "\n-----------------------------------------------------\n");
        mensajeBuzon = "";
        notifyAll();
    }

    // Méthod para escribir un mensaje sustituyendo el actual, si ya hay un mensaje esperaremos hasta que salga un notifyAll() cuando un hilo de lectura lea.
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
