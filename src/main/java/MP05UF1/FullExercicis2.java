/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MP05UF1;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class FullExercicis2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.87d;
        System.out.println(valor_euros + " euros (€) actualmentt equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
    }
}
