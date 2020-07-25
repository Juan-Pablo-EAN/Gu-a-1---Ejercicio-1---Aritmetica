package aritmetica;
import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int valor_a = 0;
        int valor_b = 0;
        
        System.out.println("Hola! a continuación deberás escribir dos valores, los cuales, seran operados en suma,");
        System.out.println("resta, multiplicación, división, residuo, logaritmo y su valor exponencial.");
        System.out.println("Escribe tu nombre y oprime Enter para continuar:");
        nombre = entrada.nextLine();
        System.out.println(nombre + " " + "escribe el primer valor a operar");
        valor_a = entrada.nextInt();
        System.out.println(nombre + " " + "escribe el segundo valor a operar");
        valor_b = entrada.nextInt();
        
        int suma = valor_a + valor_b;
        int resta = valor_a - valor_b;
        int producto = valor_a * valor_b;
        double division = (double)valor_a / valor_b;
        double residuo = (double)valor_a % valor_b;
        double logaritmo_a = (double) (Math.log10(valor_a));
        double logaritmo_b = (double) (Math.log10(valor_b));
        int expo = (int) (Math.pow(valor_a, valor_b));
        
        System.out.println(" ");
        System.out.println(nombre + " " + "estos son los resultados de las operaciones:");
        System.out.println("Suma:" + " " + valor_a + " " + "+" + " " + valor_b + " " + "=" + " " + suma);
        System.out.println("Resta:" + " " + valor_a + " " + "-" + " " + valor_b + " " + "=" + " " + resta);
        System.out.println("Multiplicación:" + " " + valor_a + " " + "*" + " " + valor_b + " " + "=" + " " + producto);
        System.out.println("División:" + " " + valor_a + "/" + valor_b + " " + "=" + " " + division);
        System.out.println("El residuo de" + " " + valor_a + "/" + valor_b + " " + "es:" + " " + residuo);
        System.out.println("El logaritmo de" + " " + valor_a + " " + "es:" + " " + logaritmo_a);
        System.out.println("El logaritmo de" + " " + valor_b + " " + "es:" + " " + logaritmo_b);
        System.out.println("El exponencial de" + " " + valor_a + "^" + valor_b + " " + "es:" + " " + expo);
        System.out.println(" ");
        System.out.println("Gracias por tu participación");
        
    }
    

}
