package Senati.ddw.ciclo3.tareaw01a;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter ASCII");
		char caracter = sc.next().charAt(0);
		//Pasamos el caracter a codigo
		int codigo = (int) caracter;
		System.out.println(codigo); 
	}

}
