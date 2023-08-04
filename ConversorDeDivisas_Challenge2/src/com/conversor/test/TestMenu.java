package com.conversor.test;


import javax.swing.JOptionPane;

import com.conversor.modelo.ConversorDeMonedas;
import com.conversor.modelo.ConversorDeTemperatura;
import com.conversor.modelo.MainMenu;

public class TestMenu {
	public static void main(String[] args) {
		boolean continuar = true;
		MainMenu menu = new MainMenu();
		do {
			String choose = menu.ShowMenu();
			switch(choose) {
				case "Conversor de Moneda":
					ConversorDeMonedas convMon = new ConversorDeMonedas();
					convMon.ShowOptions();
					break;
				case "Conversor de Temperatura":
					ConversorDeTemperatura convTemp = new ConversorDeTemperatura();
					convTemp.ShowOptions();
					break;
			} 
			int option = (int) JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if(option == 0) continuar = true;
			else continuar = false;
		}while(continuar);
		JOptionPane.showMessageDialog(null, "Programa Terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}
