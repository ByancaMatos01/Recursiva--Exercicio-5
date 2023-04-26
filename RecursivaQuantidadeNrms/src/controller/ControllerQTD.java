package controller;

public class ControllerQTD {
	public static int contarDigitos(int num) {
	    // condição de parada: se o número tiver apenas um dígito, retorne 1
	    if (num / 10 == 0) {
	        return 1;
	    }
	    // caso contrário, chame a função recursivamente para o número sem o último dígito
	    // e adicione 1 ao resultado para contar o último dígito
	    return 1 + contarDigitos(num / 10);
	}
}
