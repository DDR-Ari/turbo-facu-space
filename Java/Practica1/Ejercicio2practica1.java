/* 

2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio 
*/

package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio2practica1 {


    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        double altura;
        int DF=15; 
        double alturaT = 0;
        double alturaP;
        int mayorP = 0;
        double [] jugadores = new double [DF]; // indices de 0 a 14
        int i;
        for (i=0;i<DF;i++) {
            altura = GeneradorAleatorio.generarDouble(3);
            jugadores[i] = altura;
            System.out.println("La altura leida es " + altura);
            alturaT = alturaT+jugadores[i];       
            System.out.println("La altura total es " + alturaT);

        }
      
        alturaP = alturaT/DF;
        System.out.println("La altura promedio es " + alturaP);
        for (i = 0; i < DF; i++){
            if(jugadores[i] > alturaP) 
                mayorP++;
        }
        System.out.println("Hay un total de " + mayorP + " jugadores con altura sobre el promedio");
        }
}
