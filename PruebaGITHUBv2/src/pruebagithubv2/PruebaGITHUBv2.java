/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithubv2;

import java.util.Scanner;

/**
 *
 * @author JsoE_
 */
public class PruebaGITHUBv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//********************Inicio hola mundo*************************
       System.out.println("hola mundo para GITHUB version 2");
//*********************Fin hola mundo*************************
     
//********************Inicio area triangulo**********************
        int area_triangulo;
        int base = 6;
        int altura = 3;   
        area_triangulo = (base*altura)/2;
        System.out.println("area de un triangulo = "+area_triangulo);     
//********************fin area triangulo*************************
        
        
        
//********************INICIO USO DE SCANNER*****************
        //Creo una variable tipo String con nombre: "nombre" 
        String nombre; 
        // Creo mi Scanner con nombre: "T" 
        Scanner T = new Scanner (System.in); 

        //Inicio mi for con una variable "i" comenzada en 0 ( cero), hasta que i sea mener que 4 e "i" valla aumnetado en 1 
        for (int i = 0 ; i<4 ; i++)
        { 
            //Comienza cintenido del for 
            System.out.print("Ingrese nombre N° "+(i+1)+": " ); 
            nombre = T.nextLine(); 

            System.out.println("=============Bienvenido=============" ); 
            System.out.println("Bienvenido "+ nombre); 
            System.out.println("====================================" ); 
            //finaliza contenido del for 
        } 
        System.out.println("Todos los nombres fueron ingresados exitosamente." ); 
//********************FIN USO DE SCANNER*************************
} 
}
    
    

