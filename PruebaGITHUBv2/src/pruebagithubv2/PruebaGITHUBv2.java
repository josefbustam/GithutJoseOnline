/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithubv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author JsoE_
 */
public class PruebaGITHUBv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
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
        System.out.println("");
        System.out.println("USO DE SCANNER");	
        //Creo una variable tipo String con nombre: "nombre" 
        String nombre; 
        // Creo mi Scanner con nombre: "T" 
        Scanner T = new Scanner (System.in); 

        //Inicio mi for con una variable "i" comenzada en 0 ( cero), hasta que i sea mener que 4 e "i" valla aumnetado en 1 
        System.out.println("=============Bienvenido=============" ); 
        for (int i = 0 ; i<4 ; i++)
        { 
            //Comienza cintenido del for 
            
            System.out.print("Ingrese nombre N° "+(i+1)+": " ); 
            nombre = T.nextLine(); 

            
            System.out.println("Bienvenido "+ nombre); 
            
            //finaliza contenido del for 
        } 
        System.out.println("Todos los nombres fueron ingresados exitosamente." ); 
//********************FIN USO DE SCANNER*************************
        
        
//********************INICIO USO DE BUFFEREDREADER*************************      
        
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("USO DE BufferedReader");	
        System.out.println("=============Bienvenido=============" ); 
            System.out.print("Introduce el primer número:");			
            int numero1 = Integer.parseInt(br.readLine());			
            System.out.print("Introduce el segundo número:");
            int numero2 = Integer.parseInt(br.readLine()); 
            int resultado = numero1*numero2;
            System.out.println("");
            System.out.println("La multiplicación es " + numero1 + " x " + numero2 + " = " + resultado);
        
//********************FIN USO DE BUFFEREDREADER*************************        
    }
}

    
    

