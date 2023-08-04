package com.conversor.modelo;

import javax.swing.JOptionPane;

public class MainMenu {
	
	private String conversorMon = "Conversor de Moneda";
	private String conversorTemp = "Conversor de Temperatura";
	private String txtChoosen = "Seleccione un tipo de conversor";
	private Object[] choosen = {conversorMon, conversorTemp};
	
	public String ShowMenu() {
		String Choose = (String) JOptionPane.showInputDialog(null, txtChoosen, "Menu", JOptionPane.PLAIN_MESSAGE, null,choosen, conversorMon);
		return Choose;
	}
	
	
	
}
