package com.Dom;

import java.util.Random;

public class Dado {


    public Dado() { /* constructor */
    }

    public int lanzarDado() { /* regresa una entero del 1 al 6 */
        Random random = new Random();
        return random.nextInt(6) + 1 ; /* se suma 1 ya que parte del 0 */
    }

    public void jugarALosDados() {

        Calculadora calculadora = new Calculadora();

        int lanzamiento1 = lanzarDado();
        int lanzamiento2 = lanzarDado(); /* realizo 2 lanzamientos */
        int sumaDeLanzamientos = calculadora.sumar(lanzamiento1, lanzamiento2);

        if (calculadora.compararNumero(sumaDeLanzamientos)) {
            System.out.println("Ganaste");
        }
        else {
            System.out.println("Perdiste");
        }
    }
}