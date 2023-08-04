package com.conversor.modelo;
import javax.swing.JOptionPane;

public class ConversorDeMonedas extends Conversor {
	
	private String peso_dolar = "De Pesos a Dólar";
	private String peso_euro = "De Pesos a Euro";
	private String peso_libras = "De Pesos a Libras";
	private String peso_yen = "De Pesos a Yen";
	private String peso_won = "De Pesos a Won Coreano";
	private String dolar_pesos = "De Dólar a Pesos";
	private String euro_pesos = "De Euro a Pesos";
	private String libras_pesos = "De Libras a Pesos";
	private String yen_pesos = "De Yen a Pesos";
	private String won_pesos = "De Won a Pesos";
	
	private String txtChoosen = "Elije la moneda a la que deseas convertir tu dinero";
	private Object[] options = {peso_dolar,peso_euro,peso_libras,peso_yen,peso_won,dolar_pesos,euro_pesos,libras_pesos, yen_pesos, won_pesos};
	
	public void ShowOptions() {
		String choose = (String) JOptionPane.showInputDialog(null, txtChoosen, "Menu", JOptionPane.PLAIN_MESSAGE,null,options, peso_dolar);
		SetValue();
		switch(choose) {
			case "De Pesos a Dólar":
				setProporcionDeConversion(0.059);
				Convertir(getCantidad(), getProporcionDeConversion(), "dólares");
				break;
			case "De Pesos a Euro":
				setProporcionDeConversion(0.054);
				Convertir(getCantidad(), getProporcionDeConversion(), "euros");

				break;
			case "De Pesos a Libras":
				setProporcionDeConversion(0.046);
				Convertir(getCantidad(), getProporcionDeConversion(), "libras");

				break;
			case "De Pesos a Yen":
				setProporcionDeConversion(8);
				Convertir(getCantidad(), getProporcionDeConversion(), "yenes");

				break;
			case "De Pesos a Won Coreano":
				setProporcionDeConversion(76);
				Convertir(getCantidad(), getProporcionDeConversion(), "wones");

				break;
			case "De Dólar a Peso":
				setProporcionDeConversion(17.03);
				Convertir(getCantidad(), getProporcionDeConversion(), "pesos");

				break;
			case "De Euro a Peso":
				setProporcionDeConversion(18.63);
				Convertir(getCantidad(), getProporcionDeConversion(), "pesos");

				break;
			case "De Libras a Pesos":
				setProporcionDeConversion(21.651);
				Convertir(getCantidad(), getProporcionDeConversion(), "pesos");
				break;
			case "De Yen a Pesos":
				setProporcionDeConversion(0.120);
				Convertir(getCantidad(), getProporcionDeConversion(), "pesos");
				break;
			case "De Won a Pesos":
				setProporcionDeConversion(0.0130);
				Convertir(getCantidad(), getProporcionDeConversion(), "pesos");
				break;
		}
	}
	
	
}
