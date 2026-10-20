package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {

        Buzon buzon = new Buzon();

        Lector lector1 = new Lector("L1", buzon);
        Lector lector2 = new Lector("L2", buzon);

        Escritor escritor1 = new Escritor("[1] Mensaje desde Escritor 1", "E1", buzon);
        Escritor escritor2 = new Escritor("[2] Mensaje desde Escritor 2", "E2", buzon);

        escritor1.start();
        escritor2.start();
        lector2.start();
        lector1.start();

        escritor1.join();
        escritor2.join();
        lector1.join();
        lector2.join();
    }
}
