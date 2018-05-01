package br.com.sonhoencantado.contrato;

import javax.swing.JOptionPane;

public class Festa{

	// dados da festa
	String tema;
	String dataMontagem;
	String dataRetirada;
	String mes;
	int horaMontagem = 0;
	int horaRetirada = 0;
	int opcaoMes =0;
	int dia = 0;
	int manta = 2;
	int bau = 2;
	int qtdCabanas = 0;
	int frete = 0;
	int opcaoTema = 0;

	// dados de pagamento
	String formaDePagamento;
	int valorTotal;

	// tema
	public void definindoTema(){
		// solicitando tema
		while(opcaoTema <= 0 || opcaoTema > 12){
			try {
				opcaoTema = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nTema da Festa."
						+ "\n1  - Princesa"
						+ "\n2  - Corujinha"
						+ "\n3  - Nuvens"
						+ "\n4  - Pokemon"
						+ "\n5  - Exército"
						+ "\n6  - Safari"
						+ "\n7  - Vingadores"
						+ "\n8  - Bailarina"
						+ "\n9  - Unicórnio"
						+ "\n10 - Minecraft"
						+ "\n11 - The Flash"
						+ "\n12 - Futebol"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
			}
		}

		switch (opcaoTema){
		case 1: 
			tema = "Princesa";
			break;
		case 2: 
			tema = "Corujinha";
			break;
		case 3: 
			tema = "Nuvens";
			break;
		case 4: 
			tema = "Pokemon";
			break;
		case 5: 
			tema = "Exército";
			break;
		case 6: 
			tema = "Safari";
			break;
		case 7: 
			tema = "Vingadores";
			break;
		case 8:
			tema = "Bailarina";
			break;
		case 9:
			tema = "Unicórnio";
			break;
		case 10:
			tema = "Minecraft";
			break;
		case 11:
			tema = "The Flash";
			break;
		case 12:
			tema = "Futebol";
			break;
		}
	}

	// solicitando qtd de cabanas
	public void quantidadeDeCabanas(){
		while(qtdCabanas <= 0 || qtdCabanas > 16){
			try {
				qtdCabanas = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nQuantidade de Cabanas."));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Temos apenas 16 cabanas.");
			}
		}
	}

	// solicitando frete
	public void definindoFrete(){
		while(frete < 1 || frete > 1000){
			try {
				frete = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nValor do frete.\nou digite 1 caso o cliente venha retirar."));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Frete inválido");
			}
		}
		if (frete == 1)frete=0;
	}

	// solicitando Mantas
	public void confirmandoMantas(){
		while(manta < 0 || manta > 1){
			try {
				manta = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nO cliente optou por mantas?\n0 - Não\n1 - Sim","0"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Insira uma opção válida");
			}
		}
	}

	public void confirmandoBau(){
		while(bau < 0 || bau > 1){
			try {
				bau = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nO cliente optou por Baú de jogos?\n0 - Não\n1 - Sim","0"));				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Insira uma opção válida");
			}
		}
	}

	// solicitando dia de hoje
	public void confirmandoDia(){
		while(dia < 1 || dia > 31){
			try {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nO dia de hoje.\nExemplo: 20"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Dia inválido.");
			}
		}			
	}
	
	// solicitando mês
	public void definidoMes(){
		while(opcaoMes <= 0 || opcaoMes > 12){
			try {
				opcaoMes = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nInsira o mês que estamos."
						+ "\n1  - Janeiro"
						+ "\n2  - Fevereiro"
						+ "\n3  - Março"
						+ "\n4  - Abril"
						+ "\n5  - Maio"
						+ "\n6  - Junho"
						+ "\n7  - Julho"
						+ "\n8  - Agosto"
						+ "\n9  - Setembro"
						+ "\n10 - Outubro"
						+ "\n11 - Novembro"
						+ "\n12 - Dezembro"));	
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Mês inválido.");
			}
			
		}
		
		switch (opcaoMes){
		case 1:
			mes = "janeiro";
			break;
		case 2:
			mes = "fevereiro";
			break;
		case 3:
			mes = "março";
			break;
		case 4:
			mes = "abril";
			break;
		case 5:
			mes = "maio";
			break;
		case 6:
			mes = "junho";
			break;
		case 7:
			mes = "julho";
			break;
		case 8:
			mes = "agosto";
			break;
		case 9:
			mes = "setembro";
			break;
		case 10:
			mes = "outubro";
			break;
		case 11:
			mes = "novembro";
			break;
		case 12:
			mes = "dezembro";
			break;	
		}

	}
	
	//calculos
	public void definidoValorTotal(){
		if(manta > 0) manta = (qtdCabanas * 2) * 10;
		if(bau > 0 ) bau = 100;
		valorTotal = (qtdCabanas * 90) + frete + manta + bau;
	}
	
	// confirmando hora da montagem
	public void confirmandoHoraMontagem(){
		while(horaMontagem <= 8 || horaMontagem > 22){
			try {
				horaMontagem = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nHora da montagem da Festa.\nExemplo: 16"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "hora inválida.");
			}
		}
	}
	
	// confirmando hora da desmontagem
	public void confirmandoHoraDesmontagem(){
		while(horaRetirada <= 8 || horaRetirada > 22){
			try {
				horaRetirada = Integer.parseInt(JOptionPane.showInputDialog("Insira:\nHora da retirada da Festa.\nExemplo: 16"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "hora inválida.");
			}
		}
	}
	
	// solicitando dados da festa
	public void dadosFesta(){
		definindoTema();
		quantidadeDeCabanas();
		definindoFrete();
		dataMontagem = JOptionPane.showInputDialog("Insira:\nData da montagem da Festa.\nExemplo: 17/03");
		confirmandoHoraMontagem();
		dataRetirada = JOptionPane.showInputDialog("Insira:\nData da retirada da Festa.\nExemplo: 17/03");
		confirmandoHoraDesmontagem();
		formaDePagamento = JOptionPane.showInputDialog("Insira:\nForma de pagamento.", "via portal Elo7.");
		confirmandoMantas();
		confirmandoBau();
		confirmandoDia();
		definidoMes();
		definidoValorTotal();
	}

}
