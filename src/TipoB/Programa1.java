package TipoB;

import java.util.Scanner;

public class Programa1 
{
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		//Pedimos los lados del triangulo
		System.out.println("Escribe la base del triangulo: ");
		double base = entrada.nextInt();
		
		System.out.println("Escribe la altura del triangulo: ");
		double altura = entrada.nextInt();
		
		System.out.println("El area del triangulo es de "+ calcularArea(base, altura));
	
	}
	
	//Calculamos el área del triangulo
	public static double calcularArea(double lado1, double lado2)
	{
		
		double area = lado1 * lado2/2;
		return area;
	}
	
	//Calculamos el área de un rectangulo - Alumno2
	public static double calcularAreaRectangulo(double base, double altura) {
		double area = base * altura;
		return area;
	}
}