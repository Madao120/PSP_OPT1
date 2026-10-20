package org.example;

public class Buzon {
    static String mensaje;

    public Buzon (String mensaje){
        this.mensaje = mensaje;
    }

    public static String getMensaje() {
        return mensaje;
    }

    public static void setMensaje(String mensaje) {
        Buzon.mensaje = mensaje;
    }

    public static synchronized void escribir(String mensaje){
        setMensaje(mensaje);
    }
    public static synchronized void leer(){
        System.out.println(getMensaje());
        setMensaje("");
    }
}
