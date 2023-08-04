package com.conversor.modelo;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura extends Conversor {
	private String cel_far = "De Celsius a Farenheit";
	private String cel_kel = "De Celsius a Kelvin";
	private String far_cel = "De Farenheit a Celsius";
	private String far_kel = "De Farenheit a Kelvin";
	private String kel_cel = "De Kelvin a Celsius";
	private String kel_far = "De Kelvin a Farenheit";
	
	private String txtChoosen = "Elije el tipo de grados que deseas convertir";
	private Object[] options = {cel_far,cel_kel,far_cel,far_kel,kel_cel,kel_far};
	
	public void ShowOptions() {
		String choose = (String) JOptionPane.showInputDialog(null, txtChoosen, "Menu", JOptionPane.PLAIN_MESSAGE,null,options, cel_far);
		SetValue();
		switch(choose) {
			case "De Celsius a Farenheit":
				setProporcionDeConversion(33.8);
				Convertir(getCantidad(), getProporcionDeConversion(), "°F");
				break;
			case "De Celsius a Kelvin":
				setProporcionDeConversion(274.15);
				Convertir(getCantidad(), getProporcionDeConversion(), "K");

				break;
			case "De Farenheit a Celsius":
				setProporcionDeConversion(-17.22);
				Convertir(getCantidad(), getProporcionDeConversion(), "°C");

				break;
			case "De Farenheit a Kelvin":
				setProporcionDeConversion(255.9278);
				Convertir(getCantidad(), getProporcionDeConversion(), "K");

				break;
			case "De Kelvin a Celsius":
				setProporcionDeConversion(-272.15);
				Convertir(getCantidad(), getProporcionDeConversion(), "°C");

				break;
			case "De Kelvin a Farenheit":
				setProporcionDeConversion(-457.87);
				Convertir(getCantidad(), getProporcionDeConversion(), "°F");
				break;
			
		}
	}
	
	public void Convertir(double cantidad,double proporcionDeConversion, String terminología) {
		double CantidadConvertida = cantidad * proporcionDeConversion;
		setCantidadConvertida(CantidadConvertida);
		String txtShow = "Son " + getCantidadConvertida() + " " + terminología;
		JOptionPane.showMessageDialog(null, txtShow,"Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
