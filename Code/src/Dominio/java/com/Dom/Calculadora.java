package com.Dom;

public class Calculadora {

    public void Calculadora() { /* constructor */
    }


    public int sumar(int num1, int num2) {
        return num1 + num2;
    }


    public boolean compararNumero(int sumaDeLanzamientos) { /* comparo la suma de los lanzamientos */
        boolean estado = false;
        if (sumaDeLanzamientos == 7){
            estado = true;
        }
        return estado;
    }

}
