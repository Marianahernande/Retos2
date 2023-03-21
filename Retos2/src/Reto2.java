import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int n, numeromayor=0; 
        System.out.println("Ingrese cuántos competidores participarán ");
        n=leer.nextInt();
        String [] competidores = new String[n];
        int [] tiempo = new int[n];

        for(int i=0;i<competidores.length;i++){
            System.out.println("Digite el nombre del competidor: "+i);
            competidores[i]=leer.next();
            System.out.println("Digite el nombre el tiempo: "+i);
            tiempo[i]=leer.nextInt();
            }
        for(int i=0;i<tiempo.length; i++){
            if(tiempo[i]>numeromayor){ 
            numeromayor = tiempo[i];
                    }
                }
        for(int i=0;i<competidores.length;i++){
            System.out.println(competidores[i]+"\t"+tiempo[i]+"\t");
            
                        }
        System.out.println("El tiempo ganador es: "+numeromayor);    
leer.close();
    }
}
