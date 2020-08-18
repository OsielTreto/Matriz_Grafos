/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizgrafos;
import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class MATRIZgrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n, i, j,propiedad,  valor, fila, columna, reflexiva, ireflexiva, simetrica, asimetrica, antisimetrica, transitiva, salir;
        System.out.println("Ingresa valor de n");
        n=teclado.nextInt();

        int matriz[][]=new int[n][n];
                        
        System.out.println("Ingrese 0 o 1 en la matriz");
        
        for (i = 0; i < n; i++) 
            for (j = 0; j < n; j++) {
                
                valor=teclado.nextInt();
                if (valor==0||valor==1) {
                    matriz[i][j]=valor;
                    
                } else {
                    j--;
                    System.out.println("Valor no valido, intente de nuevo");
                }
                
            }
        System.out.println("¿Que propiedad desea realizar? ");
        System.out.println("1 - Reflexiva");
        System.out.println("2 - Irreflexiva");
        System.out.println("3 - Simetrica");
        System.out.println("4 - Asimetrica");
        System.out.println("5 - Antisimetrica");
        System.out.println("6 - Transitiva");
        System.out.println("0 - Salir");

                                                
       

        propiedad=teclado.nextInt();
        
        switch (propiedad)
        {
            case 1:{
            
            }
            case 2:{
                
            }
            case 3:{
                
            }
            case 4:{
                
            }
            case 5:{
                
            }
            case 6:{
                
            }
            case 0:{
                break;
            }
        }
            
            
        
        
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++)
                System.out.printf("%2d",matriz[i][j]);
                System.out.println("");
                
            
        }
        
        // TODO code application logic here
    }
    
}
