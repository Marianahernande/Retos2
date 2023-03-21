import java.util.Scanner;

public class Reto3{
public static void main(String[] args) {
    Scanner leer=new Scanner (System.in);

    String matriz [][] = new String [4][4];
    int contador=1;
   for (int i=0;i<matriz.length; i++) {
        for (int c=0;c<matriz.length;c++) {
                System.out.println("Digite el precio y nombre del producto en la posición: "+i+c);
                matriz[i][c]=leer.next();
        }
}
        System.out.println("");
        for (int i=0;i<matriz.length;i++) {
            for (int c=0;c<matriz.length;c++) {
                System.out.print(contador+i+contador+c);
                System.out.print(matriz[i][c]+"\t");
         }
         System.out.println();
        }
            leer.close();}
            
         }
