package TipoB;

import java.util.Scanner;

public class Programa1 
{
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		//Pedimos los lados del triangulo
		System.out.println("Escribe la base del triangulo: ");
		double baseTriangulo = entrada.nextInt();
		
		System.out.println("Escribe la altura del triangulo: ");
		double alturaTriangulo = entrada.nextInt();
		
		System.out.println("El area del triangulo es de "+ calcularArea(baseTriangulo, alturaTriangulo));
	
		//Pedimos los datos del cilindro
		System.out.println("Escribe el radio del cilindro: ");
		double radioCilindro = entrada.nextInt();
		
		System.out.println("Escribe la altura del cilindro: ");
		double alturaCIlindro = entrada.nextInt();
		
		System.out.println("El area del cilindro es de "+ calcularArea(radioCilindro, alturaCIlindro));

	}
	
	//Calculamos el área del triangulo
	public static double calcularArea(double lado1, double lado2)
	{
		
		double area = lado1 * lado2/2;
		return area;
	}
	
	//Calculamos el área del cilindro
	public static double calcularAreaCilindro(double radio, double altura)
	{
		double area = 2*3.14*radio*(radio+altura);
		return area;
	}
	
}