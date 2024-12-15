/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partidoss;
 import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Partidoss {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Favor ingresar los partidos ganados");
        int partidosganados = sc.nextInt();
        
        System.out.print("Favor ingresar los partidos perdidos");
        int partidosperdidos = sc.nextInt();

        System.out.print("Favor ingresar los partidos empatados");
        int partidosempatados = sc.nextInt();
        
        int puntajefinal = ((partidosganados * 3) + (partidosperdidos * 0) + (partidosempatados * 1));
                System.out.print("El Puntaje final es "+ puntajefinal);
 
    }
}
