
package br.com.sonhoencantado.contrato;

import javax.swing.JOptionPane;

public class Itens {
	
	// itens
	int qtdPisca = 6;
	int qtdExtensao = 5;
	int qtdCachepo = 5;
	int abajour = 2;
	int opcaoTapete = 0;
	String tapete;
	
	// qtd de pisca pisca
	public void definidoQtdPiscaPisca(){
		while(qtdPisca < 0 || qtdPisca > 5){
			try {
				qtdPisca = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nQuantidade de Pisca pisca.","2"));		
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Quantidade inválida.");
			}
		}
	}
	
	// qtd de extenção elétrica
	public void definidoQtdextencao(){
		while(qtdExtensao < 0 || qtdExtensao > 4){
			try {
				qtdExtensao = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nQuantidade de Extensão elétrica.","1"));		
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Quantidade inválida.");
			}
		}
	}
	
	// qtd de cachepot
	public void definidoQtdCachepot(){
		while(qtdCachepo < 0 || qtdCachepo > 4){
			try {
				qtdCachepo = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nQuantidade de Cachepot.","2"));		
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Quantidade inválida.");
			}
		}
	}
	
	// qtd de abajour
	public void definidoQtdAbajour(){
		while(abajour < 0 || abajour > 1){
			try {
				abajour = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nQuantidade de abajour","1"));		
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Quantidade inválida.");
			}
		}
	}
	
	// medida do tapete
	public void definidoTapete(){
		while(opcaoTapete < 1 || opcaoTapete > 2){
			try {
				opcaoTapete = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nO tamanho do tapete.\n1 - 2,70\n2 - 5,00"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		}
		
		switch (opcaoTapete){
		case 1:
			tapete = "2,70";
			break;
		case 2:
			tapete = "5,00";
			break;
		}
	}
	
	// solicitando itens
	public void itens(){
		definidoQtdPiscaPisca();
		definidoQtdextencao();
		definidoQtdCachepot();
		definidoQtdAbajour();
		definidoTapete();

	}


}
