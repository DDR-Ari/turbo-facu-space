/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int numV;
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        numV = GeneradorAleatorio.generarInt(12); // Inicializo la variable para tener la condicion de entrada al while
        while (numV !=11){
            System.out.println("El resultado de 2x" + numV + " es = " + tabla2[numV]);
            numV = GeneradorAleatorio.generarInt(12); //Para poder seguir evaluando tengo que volver a generar otro random 
        }
}
}
