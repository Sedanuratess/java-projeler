/*Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. 
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun.
Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.*/

package javaproje1;
import java.util.Arrays;
public class javaProje {
    public static void main(String[] args) {
        int[][] matris = { {11,25,78}, {45,75,28}, {369,8,120} };
        int[][] transpoz = new int[3][3];

        System.out.println("Matris : ");
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }
         System.out.println("*************************************************");
        System.out.println("Matrisin transpozu : ");
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                transpoz[i][j] = matris[j][i];
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
