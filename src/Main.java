import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double lado, perimetro, altura, area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el valor del lado del triangulo equilatero: ");
        lado = sc.nextDouble();

        perimetro = lado * 3;
        altura = (lado * Math.sqrt(3))/2;
        area = (lado * altura)/2;

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El altura es: " + altura);
        System.out.println("El area del triangulo es: " + area);
    }
}