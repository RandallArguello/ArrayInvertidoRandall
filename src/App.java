import java.util.Scanner;
// Randall Steven Arguello Zeledon 2024-1377U
// 1M1   Clase17Array Tarea
public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar Arreglo Original");

        Mostrar(array);
       
         // Invertir el arreglo
         invertirArreglo(array);

         // Mostrar el arreglo invertido
         System.out.println("Mostrar Arreglo invertido:");
         mostrarArreglo(array);
        
        leer.close();
    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }
        //Hay que hacer que mire bonito
    }
    //Aqui va el metodo de inverso
    public static void invertirArreglo(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            // Intercambiar los elementos en la posición inicio y fin
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            // Mover los índices inicio y fin hacia el centro del arreglo
            inicio++;
            fin--;
        }
    }
    // Método para mostrar el arreglo
    public static void mostrarArreglo(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
         }
}
