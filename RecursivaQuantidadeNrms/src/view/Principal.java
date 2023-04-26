package view;

import java.util.Scanner;

import controller.ControllerQTD;

public class Principal {
	public static void main(String[] args) {
		int num;
		Scanner leia=new Scanner(System.in);
			System.out.println("Digite os números");
			num=leia.nextInt();
		int resultado = ControllerQTD.contarDigitos(num);
		System.out.println("quantidade de digitos é " + resultado);
	}
}

	
