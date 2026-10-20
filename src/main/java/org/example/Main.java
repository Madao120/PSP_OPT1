package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Lector lector1 = new Lector();
        Lector lector2 = new Lector();

        Escritor escritor1 = new Escritor("[1] Mensaje desde Escritor 1");
        Escritor escritor2 = new Escritor("[2] Mensaje desde Escritor 2");

        lector1.start();
        lector2.start();
        escritor1.start();
        escritor2.start();
    }
}
