package br.com.sonhoencantado.contrato;

import javax.swing.JOptionPane;

public class Cliente{

	// dados do cliente
	String cliente;
	String nacionalidade;
	String estadoCivil;
	String profissao;
	String RG;
	String CPF;

	// endere�o do cliente
	String logradouro;
	int numero;
	String complemento;
	String bairro; 
	String cidade;
	String CEP;	

	// solicitando dados do cliente	
	public void dadosCliente(){

		// dados pessoais
		cliente = JOptionPane.showInputDialog("Insira:\nNome do cliente.");
		nacionalidade = JOptionPane.showInputDialog("Insira:\nNacionalidade do cliente.", "brasileira");
		estadoCivil = JOptionPane.showInputDialog("Insira:\nEstado Civil do cliente.","casada");
		profissao = JOptionPane.showInputDialog("Insira:\nProfiss�o do cliente.");
		RG = JOptionPane.showInputDialog("Insira:\nRG do cliente.");
		CPF = JOptionPane.showInputDialog("Insira:\nCPF do cliente.");

		// dados de endere�o
		logradouro = JOptionPane.showInputDialog("Insira:\nLogradouro da casa do cliente.");

		while(numero <= 0){ 
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nN�mero da casa do cliente."));	
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Insira apenas n�meros.");
			}
		}
		
		complemento = JOptionPane.showInputDialog("Insira:\nComplemento da casa do cliente.","casa");
		bairro = JOptionPane.showInputDialog("Insira:\nBairro da casa do cliente.");
		cidade = JOptionPane.showInputDialog("Insira:\nCidade da casa do cliente.","S�o Paulo");
		CEP = JOptionPane.showInputDialog("Insira:\nCEP da casa do cliente.");

	}

}
