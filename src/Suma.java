import java.util.Scanner; //El programa usa la clase Scaner

public class Suma {

	public static void main(String args[])
	{
		//Crea el objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner(System.in);
			
		int numero1;
		int numero2;
		int suma;
		
		System.out.print("Escriba el primer entero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Escriba el segundo entero: ");
		numero2 = entrada.nextInt();
		
		suma = numero1 + numero2;
		
		System.out.printf("la suma es %d\n",suma);
	} // fin del metodo main
}//fin de la clase	Suma