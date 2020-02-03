package com.company;
import java.io.IOException;

/*Hoja de trabajo 3
Archivo main
Daniela Batz
Jose Ramos
Algoritmos y estructuras de datos
Calculadora*/

public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora	(); //instanciamos la calculadora
        calc.calculateFile("datos.txt"); //usamos el metodo que realiza la operacion
    }
}	