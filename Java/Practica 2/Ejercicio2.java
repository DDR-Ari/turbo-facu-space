/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

/**
Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta 
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona[] p = new Persona[15];
        int i, j;
        for (i=0; i<15; i++){
            p[i] = new Persona();}
        i = 0;       
        p[i].setEdad(GeneradorAleatorio.generarInt(99));
        while(p[i].getEdad () != 0 && i < 14 ){
            System.out.println("Edad: " + p[i].getEdad()); 
            p[i].setNombre(GeneradorAleatorio.generarString(10));
            System.out.println("Nombre: " + p[i].getNombre()); 
            p[i].setDNI(GeneradorAleatorio.generarInt(9999));
            System.out.println("DNI : " + p[i].getDNI()); 
            i = i+1;
            p[i].setEdad(GeneradorAleatorio.generarInt(99));
            System.out.println("La dimension logica es " + i);
            System.out.println("-------------------------------");         
    
        }
        
        int may65;
        may65 = 0;
        Persona min = new Persona();
        min.setDNI(9999);
        
        for(j = 0; j < i; j++){
            if (p[j].getEdad() > 65){
                may65++;}
            if(p[j].getDNI() < min.getDNI()){
                min = p[j];}        
        }
        
        System.out.println(); 
        System.out.println("Hay un total de " + may65+ " personas mayores a 65 años"); 
        System.out.println("El menor deni pertenece a : "); 
        System.out.println(min.toString());  
        }
    
        
    }

