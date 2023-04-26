package controller;

public class ControllerQTD {
	public static int contarDigitos(int num) {
	    // condi��o de parada: se o n�mero tiver apenas um d�gito, retorne 1
	    if (num / 10 == 0) {
	        return 1;
	    }
	    // caso contr�rio, chame a fun��o recursivamente para o n�mero sem o �ltimo d�gito
	    // e adicione 1 ao resultado para contar o �ltimo d�gito
	    return 1 + contarDigitos(num / 10);
	}
}
