
package boletin2_1;

import java.util.Scanner;

public class Boletin2_1 {

    
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Teclea el precio final");
float precio_final = sc.nextFloat();
System.out.println("Teclea el precio sin descuento");
float precio_inicial = sc.nextFloat();
float descuento = 100-(precio_final/precio_inicial*100);
System.out.println("El descuento es de "+descuento+"%");
        
        
        
    }
    
}
