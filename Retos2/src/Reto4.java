import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int filas=3,columnas=3,posición1,posición2,posición3,posición4,res=0, acomulador,l=0,total=0;
    int [][] Frutas = new int[filas][columnas];
    //Contenido
        Frutas[0][0]=1;
        Frutas[0][1]=2;
        Frutas[0][2]=3;
        Frutas[1][0]=1;
        Frutas[1][1]=2;
        Frutas[1][2]=3;
        Frutas[2][0]=4;
        Frutas[2][1]=5;
        Frutas[2][2]=4;
        acomulador=(filas*columnas);
        total=acomulador/2;
    //Mostrarlo
    System.out.println("");
     for (int i=0;i<Frutas.length;i++) {
         for (int c=0;c<Frutas.length;c++) {
             System.out.print(Frutas[i][c]+"\t");
      }
    System.out.println();
     }
    //fin de mostrarlo
    do{
    //pedir indicaciones:
        System.out.println("Digite la posicion: ");
        posición1=leer.nextInt();
        System.out.println("Digite la posicion: ");
        posición2=leer.nextInt();
        System.out.println("Digite la posicion: ");
        posición3=leer.nextInt();
        System.out.println("Digite la posicion: ");
        posición4=leer.nextInt();
    // fin de pedir indicaciones
        for(int i=0;i<1;i++){
            for(int c=0; c<1;c++){
             if( Frutas[i][c] == Frutas[posición1][posición2] && Frutas[i][c] == Frutas[posición3][posición4] ){
                System.out.println("Son iguales: "+Frutas[i][c]);
                total-=1;
                if (total>0) {
                    System.out.println("Desea continuar te faltan "+total+" pares \n1. Si \n2. No");
                    res=leer.nextInt();
                }
                else{
                    System.out.println("ya encontro todos los pares, felicidades");
                }
                
             }    
             else{
                System.out.println("Son diferentes: "+Frutas[i][c]);
                System.out.println("Desea continuar te faltan "+total+" pares \n1. Si \n2. No");
                res=leer.nextInt();
             }
            }
            
        }
        
    }
while(res==1);
l++;
leer.close();
}


}


