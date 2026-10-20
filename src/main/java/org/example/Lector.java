package org.example;

public class Lector extends Thread{
    int contador = 3;



    @Override
    public void run(){
        while(contador > 0){
            if(!Buzon.getMensaje().isEmpty()){
                System.out.println("Leyendo mensaje:");
                Buzon.leer();
                contador --;
            }
        }
    }
}
