/*
3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
 */
package tema1;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio3P1 {
    public static void main(String[]args){
	//Paso 2. iniciar el generador aleatorio     
	GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int [][] matriz = new int [5][5];
        int i, j;
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                matriz[i][j] = GeneradorAleatorio.generarInt(31);                
            }
                    }
        //Paso 4. mostrar el contenido de la matriz en consola
        for (i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.println("La Pos. " + i + " , " + j + " tiene " + matriz[i][j]);
            }
            System.out.println();
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int sumaF1 = 0;
    for (j=0;j<5;j++){
        System.out.println(" suma " + matriz[0][j]);
        sumaF1 = sumaF1 + matriz[0][j];
            }
    System.out.println("La suma de todos los elementos en la fila 1 es " + sumaF1);
        
    System.out.println("---------------------------------------------------------------------------");
  
        
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int sumaJ;
        int [] matriz2 = new int [5];
        for (j=0;j<5;j++){
            sumaJ = 0;
            for (i=0;i<5;i++){
                System.out.println(" suma " + matriz[i][j]);
                sumaJ = sumaJ + matriz[i][j];
            }
         matriz2[j]= sumaJ;
         System.out.println(" La suma de la columna " + j + " es " + matriz2[j] );
        }
    
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        System.out.println("Ingrese el numero entero a buscar");
        int num = Lector.leerInt(); 
        boolean encontro = false;
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
               if(matriz[i][j] == num){
                   System.out.println("El numero "+ num + " se encuentra en la fila y columna " + i+ " " + j );
                   encontro = true;
               }
            }
                    }
        if(encontro == false)
                   System.out.println ("El numero "+num+" no se encuentra en la matriz");
    }
}
