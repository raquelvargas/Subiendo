/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subiendo;

/**
 *
 * @author Raquel
 */
public class Subiendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] numeros=new int[10];
       numeros[0]=1;
       numeros[1]=2;
       numeros[2]=3;
       numeros[3]=4;
       numeros[4]=5;
       numeros[5]=6;
       numeros[6]=7;
       numeros[7]=8;
       numeros[8]=9;
       numeros[9]=10;
       
     //  int[] numeros1={1,2,3,4,5,6,7,8,9,10};
       
       String[] paises=new String[10];
       
       paises[0]="españa";
       paises[1]="japón";
       paises[2]="corea del sur";
       paises[3]="corea del norte";
       paises[4]="china";
       paises[5]="tailandia";
       paises[6]="hong kong";
       paises[7]="estados unidos";
       paises[8]="inglaterra";
       paises[9]="portugal";
       
//       String[] paises1={"españa","japon","corea del sur","corea del norte"
//               ,"china","tailandia","hong kong","estados unidos","inglaterra",
//               "portugal"};
       
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        for (int j = 0; j < paises.length; j++) {
            System.out.println(paises[j]);
        }
    }
   
}
