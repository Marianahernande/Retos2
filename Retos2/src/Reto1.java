import java.util.Scanner;

public  class Reto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        float promedio=0,total=0;

        System.out.println("Ingrese la cantidad de notas a ingresar: ");
        n=leer.nextInt();
        
        double [] notas = new double[n];

        for(int i=0; i<notas.length;i++){
        System.out.println("Digite la nota: "+i);
                notas[i]=leer.nextDouble();

            total+=notas[i];
        }
        promedio=( total/n);
        if(promedio<3.0){
            System.out.println("Has reprobado con un promedio de: "+promedio);
        }
        else if (promedio>=3.0 && promedio<4.0) {
            System.out.println("Pasaste raspando con un promedio de: "+promedio);
        }
        else if (promedio>=4.0) {
            System.out.println("Aprobaste con buenos resultados, con un promedio de: "+promedio+" ¡Felicitaciones!");
        }
        
        leer.close();
    }
}