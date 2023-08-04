package com.conversor.modelo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import com.conversor.exceptions.ValorNoVálidoException;

public class Conversor {
	
	private double Cantidad;
	private double CantidadConvertida;
	private double ProporcionDeConversion;
	
	public double getCantidad() {
		return Cantidad;
	}
	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}
	public double getCantidadConvertida() {
		return CantidadConvertida;
	}
	public void setCantidadConvertida(double cantidadConvertida) {
		double cantidad = cantidadConvertida;
		//Solo mostrar 5 decimales
		DecimalFormat df = new DecimalFormat("#.#####");
		String newNum = df.format(cantidad);
		CantidadConvertida = Double.parseDouble(newNum);
	}
	
	 public double getProporcionDeConversion() {
		return ProporcionDeConversion;
	}
	public void setProporcionDeConversion(double proporcionDeConversion) {
		ProporcionDeConversion = proporcionDeConversion;
	}
	
	//abstract
	double SetValue() {
		String txtValue = "Ingresa la cantidad de dinero que deseas convertir:";
		String Value = (String) JOptionPane.showInputDialog(null, txtValue, "Menu", JOptionPane.QUESTION_MESSAGE);
		double val = 0;
		try {
			val = Double.parseDouble(Value);
			setCantidad(val);
			
		} catch (Exception e) {
			String err = "Valor no válido";
			JOptionPane.showMessageDialog(null, err, "Error", JOptionPane.ERROR_MESSAGE);
			throw new ValorNoVálidoException(err);
		}
		return val;
	}
	
	
	public void Convertir(double cantidad,double proporcionDeConversion, String terminología) {
		double CantidadConvertida = cantidad * proporcionDeConversion;
		setCantidadConvertida(CantidadConvertida);
		String txtShow = "Tienes $" + getCantidadConvertida() + " " + terminología;
		JOptionPane.showMessageDialog(null, txtShow,"Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	

	
	
}
