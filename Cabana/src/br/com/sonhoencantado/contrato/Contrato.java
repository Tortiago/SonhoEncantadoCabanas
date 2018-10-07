package br.com.sonhoencantado.contrato;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Contrato{	

	public static void main (String [] args) throws IOException{
		
		
		Cliente cliente = new Cliente();
		Festa festa = new Festa();
		Itens item = new Itens();
		
		// ender�o e nome do arquivo a ser gerado
		FileWriter arq = new FileWriter("C:\\Users\\Tiago\\Desktop\\contratos\\"+cliente+".txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		// Solicitando informa��es para criar contrato
		cliente.dadosCliente();
		festa.dadosFesta();
		item.itens();
		
		// *** Inicio do contrato ***

		// cabe�alho
		gravarArq.println("                        * Sonho Encantado Festa do Pijama *");
		gravarArq.println("                      Contrato de loca��o de Cabanas de Pijama");
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Das Partes");

		// dados do contratante
		gravarArq.println("");
		gravarArq.println("     " + cliente.cliente + ", " + cliente.nacionalidade + ", " + cliente.estadoCivil + ", " + cliente.profissao + ", RG: " + cliente.RG + ",");  
		gravarArq.println("   CPF: " + cliente.CPF + ", domiciliado e residente � " + cliente.logradouro + ", " + cliente.numero + ", " + cliente.complemento + "," ); 
		gravarArq.println("   "+ cliente.bairro + " - " + cliente.cidade + " - SP, CEP: " + cliente.CEP + ", neste ato denominado CONTRATANTE.");

		// dados do contratado
		gravarArq.println("");
		gravarArq.println("     Sonho Encantado Festa do Pijama, representada neste ato por seu s�cio administrador");
		gravarArq.println("   Cristiane Aparecida de Oliveira, brasileira, casada, administradora de empresa,");
		gravarArq.println("   portadora do RG 59.276.124-1 e do CPF 006.648.249-60, domiciliado e residente � Rua Ernesto Barreto, 40,");
		gravarArq.println("   Interlagos - CEP 04827-183, aqui denominada CONTRATADA.");

		// justificativa do contrato
		gravarArq.println("");
		gravarArq.println("     T�m entre os mesmos, de maneira justa e acordada, o presente CONTRATO PARA");
		gravarArq.println("   PRESTA��O DE SERVI�OS LOCA��O DE DECORA��O FESTA DO PIJAMA,");
		gravarArq.println("   ficando desde j� aceito, pelas partes as cl�usulas abaixo descritas.");

		// 1� clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cl�usula 1� � Do objeto do contrato e do or�amento");
		gravarArq.println("");
		gravarArq.println("     O presente contrato tem como OBJETO a loca��o da decora��o para Festa do Pijama de ");
		gravarArq.println("   tema " + festa.tema + ", e or�amento contido no anexo �nico deste contrato que fica fazendo parte ");
		gravarArq.println("   integrante deste, nos moldes e forma especificados neste contrato.");

		// paragrafo �nico
		if(festa.frete > 0){
			gravarArq.println("");
			gravarArq.println("     Par�grafo �nico: Os materiais da decora��o para festa do pijama de tema " + festa.tema + " ser�o ");
			gravarArq.println("   entregue pela contratada no local mencionado da contratante, no dia " + festa.dataMontagem + "/2017,");
			gravarArq.println("   hor�rio previsto para entrega a partir das " + festa.horaMontagem +":00 horas,");
			gravarArq.println("   e com retirada prevista para as " + festa.horaRetirada + ":00 horas do dia " + festa.dataRetirada + "/2017.");
		}else{
			
		}
		// 2� clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cl�usula 2� - Das obriga��es da Contratada ");
		gravarArq.println("");
		gravarArq.println("     A CONTRATADA se compromete a disponibilizar seus materiais de decora��o para Festa");
		gravarArq.println("   do Pijama na data e hor�rio mencionados na Cl�usula 1�, que ser� entregue pelo contratado");
		gravarArq.println("   no hor�rio e local indicado no Par�grafo �nico, da Cl�usula Primeira. ");

		// 3� clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cl�usula 3� - Dos materiais e servi�os");
		gravarArq.println("");
		gravarArq.println("     A respeito da decora��o da Festa do Pijama de tema " + festa.tema + ", a CONTRATADA se");
		gravarArq.println("   compromete a fornecer todo material necess�rio na forma especificada no anexo �nico");
		gravarArq.println("   deste contrato.");

		// 4� clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cl�usula 4� - Do pre�o e das condi��es de pagamento");
		gravarArq.println("");
		gravarArq.println("     Pelos materiais relacionados na cl�usula 3� e anexo �nico deste contrato, o CONTRATANTE");
		gravarArq.println("   pagar� � CONTRATADA o valor de R$ "+ festa.valorTotal +",00 (reais) que dever� ser pago " + festa.formaDePagamento);

		// 5� clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cl�usula 5� - Cl�usula penal ");
		gravarArq.println("");
		gravarArq.println("     Caso o CONTRATANTE desista de promover a festa contratada, ou seja, o evento seja");
		gravarArq.println("   cancelado por sua culpa, ficam estipuladas as seguintes cl�usulas penais:");
		gravarArq.println("");
		gravarArq.println("   a) At� 06 (seis) meses antes do evento ser� devolvido 90% da import�ncia paga;");
		gravarArq.println("   b) At� 05 (cinco) meses antes do evento ser� devolvido 85% da import�ncia paga;");
		gravarArq.println("   c) At� 04 (quatro) meses antes do evento ser� devolvido 80% da import�ncia paga;");
		gravarArq.println("   d) At� 03 (tr�s) meses antes do evento ser� devolvido 75% da import�ncia paga;");
		gravarArq.println("   e) At� 02 (dois) meses antes do evento ser� devolvido 70% da import�ncia paga.");
		gravarArq.println("   f) At� 01 (um) m�s antes do evento ser� devolvido 50% da import�ncia paga.");
		gravarArq.println("");
		gravarArq.println("     Par�grafo Primeiro. Em outros casos, n�o ser� devolvida nenhuma import�ncia paga, salvo");
		gravarArq.println("   se o evento n�o se realizar por caso fortuito ou for�a maior, ocasi�o em que ser� devolvido");
		gravarArq.println("   o percentual de 50% do valor contratado.");
		gravarArq.println("");
		gravarArq.println("     Par�grafo Segundo. Caso a desist�ncia se d� por culpa da CONTRATADA esta dever� al�m ");
		gravarArq.println("   de devolver integralmente a import�ncia j� paga pela CONTRATANTE sujeitar-se a t�tulo de ");
		gravarArq.println("   cl�usula penal ao pagamento de 90% (noventa por cento) do valor contratado. ");

		// 6� clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cl�usula 6� - Das disposi��es finais");
		gravarArq.println("");
		gravarArq.println("     As partes elegem o foro da comarca de S�o Paulo - SP com exclus�o de qualquer outro,");
		gravarArq.println("   por mais privilegiado que seja, para resolver qualquer lit�gio que porventura venha a surgir");
		gravarArq.println("   em raz�o do presente contrato.");


		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" ANEXO - MATERIAIS E SERVI�OS");
		gravarArq.println("");
		gravarArq.println(" ESTRUTURA E DECORA��O");
		gravarArq.println("");
		gravarArq.println("     Material para " + festa.qtdCabanas +" cabanas ");
		gravarArq.println("   " + festa.qtdCabanas + " - Estruturas de cabanas de pijama infantil de madeira");
		gravarArq.println("        Altura 1,40 m");
		gravarArq.println("        Largura 1,30 m");
		gravarArq.println("        Comprimento 1,20 m");
		if(festa.manta > 0)
			gravarArq.println("   " + (festa.qtdCabanas * 2) + " - Mantas");
		gravarArq.println("   " + festa.qtdCabanas + " - Forros de cabana do tema " + festa.tema);
		gravarArq.println("   " + item.qtdPisca + " - Cord�es de Pisca-pisca ");
		gravarArq.println("   " + item.qtdExtensao + " - Extens�o el�trica");
		gravarArq.println("   1 - Caixote decorativo");
		gravarArq.println("   1 - Lousa para nome do aniversariante ");
		gravarArq.println("   1 - Giz ");
		gravarArq.println("   1 - Tapete na cor verde (2,00 X " + item.tapete + " m) ");

		if(item.abajour == 1)gravarArq.println("   1 - Abajur de Led ");
		if(item.qtdCachepo > 0)gravarArq.println("   " + item.qtdCachepo + " - Vasos de Cachepot com arranjo de hera");

		switch (festa.tema) {

		case "Princesa": // Tema = 1
			gravarArq.println("   1 � Palavra princesa");
			gravarArq.println("   2 � Almofadas decorativas");
			gravarArq.println("   " + festa.qtdCabanas + " � Coroinhas decorativas");
			break;

		case "Corujinha": // Tema = 2
			gravarArq.println("   3 � Corujinhas de pel�cia");
			break;

		case "Nuvens": // Tema = 3
			gravarArq.println("   2 � Almofadas");
			gravarArq.println("   3 � Nuvens");
			gravarArq.println("   1 � Estrela");
			gravarArq.println("   1 � Lua");
			break;

		case "Pokemon": // Tema = 4
			gravarArq.println("   2 - Pokemons de pel�cia");
			gravarArq.println("   2 - Pokebolas de pel�cia");
			break;
		
		// Nenhum item a adicionar na decora��o Ex�cito
		//case "Ex�rcito": // Tema = 5
			
		case "Safari": // Tema = 6
			gravarArq.println("   1 - Macaco de pel�cia");
			gravarArq.println("   1 - Girafa de pel�cia");
			gravarArq.println("   1 - Tigre de pel�cia");
			gravarArq.println("   1 - Tartaruga de pel�cia");
			break;

		case "Vingadores": // Tema = 7
			gravarArq.println("   4 - Mascaras decorativas");
			gravarArq.println("   4 - Vingadores de pel�cia");			
			break;

		case "Bailarina": // Tema = 8
			gravarArq.println("   1 - Abajour de bailarina");
			gravarArq.println("   1 - Bailarina de MDF");
			gravarArq.println("   2 - Almofadas de bailarina");
			gravarArq.println("   2 - Caixinhas decorativas de bailarina com vela de led");
			break;
			
		case "Unic�rnio": // Tema = 9
			gravarArq.println("   3 - Unic�rnios de pel�cia");
			gravarArq.println("   1 - Lumin�ria de arco-�ris");
			gravarArq.println("   2 - Almofadas decorativas");
			break;

		case "Minecraft": // Tema = 10
			gravarArq.println("   3 - Personagens de pel�cia");
			gravarArq.println("   1 - Poster com nome do anivers�riante");
			gravarArq.println("   2 - Almofadas decorativas");
			gravarArq.println("   2 - Cord�es de bandeirolas");
			break;
		case "The Flash": // Tema = 11
			gravarArq.println("   1 - Poster com nome do anivers�riante");
			gravarArq.println("   2 - Almofadas decorativas");
			break;
		case "Futebol": // Tema = 12
			gravarArq.println("   1 - Gol decorativo");
			gravarArq.println("   2 - Almofadas decorativas");
			gravarArq.println("   2 - Bolas de pel�cia");
			gravarArq.println("   8 - Cones coloridos");
			break;
		}
		
		gravarArq.println("      Cada cabana acompanha Kit sono que acomoda duas crian�as");
		gravarArq.println("   O Kit sono � composto por:");
		gravarArq.println("   2 - Colch�es");
		gravarArq.println("   2 - Len��is");
		gravarArq.println("   2 - Travesseiros");

		if(festa.bau > 0){
			gravarArq.println("");
			gravarArq.println("     Ba� de Jogos");
			gravarArq.println("   Jogo Cara a Cara");
			gravarArq.println("   Jogo Vira Letras");
			gravarArq.println("   Jogo Bananas de Pijamas");
			gravarArq.println("   Jogo da Mem�ria Moana");
			gravarArq.println("   Jogo da mem�ria Vingadores"); 
			gravarArq.println("   Quebra Cabe�a 'A casa do Mickey Mouse'");
			gravarArq.println("     Livros de Historinhas");
			gravarArq.println("   Barbie o segredo das fadas");
			gravarArq.println("   Cinderela");
			gravarArq.println("   O gato de botas");
			gravarArq.println("   Jo�o e o p� de feij�o");
		}

		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println("     ANEXO - PRE�OS E CONDI��ES DE PAGAMENTO");
		gravarArq.println("");
		gravarArq.println("   |   Produto   |  Quantidade  |   Valor Unit�rio   |   Valor total item   |");
		gravarArq.println("   |   Cabana    |  " + festa.qtdCabanas + "           |   R$  90,00        |   R$ " + (festa.qtdCabanas * 90) + ",00          |");
		if(festa.bau > 0 )gravarArq.println("   |   Ba�       |  1           |   R$ 100,00        |   R$ 100,00          |");
		if(festa.manta > 0 )gravarArq.println("   |   Manta     |  " + festa.qtdCabanas * 2 + "           |   R$  10,00        |   R$  " + (festa.qtdCabanas * 2) * 10 + ",00          |");
		if(festa.frete > 0)gravarArq.println("   |   Frete     |  1           |   R$ " + festa.frete + ",00        |   R$ " + festa.frete + ",00          |");
		gravarArq.println("   |   Valor total da loca��o                        |   R$ " + festa.valorTotal + ",00          |");		

		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println("   S�o Paulo , " + festa.dia + " de " + festa.mes + " de 2017.");
		gravarArq.println("");
		gravarArq.println("   E, por estarem justas e contratadas, as partes assinam este instrumento, esta via");
		gravarArq.println("   do contrato digital.");
		gravarArq.println("");
		gravarArq.println("   Contratada");
		gravarArq.println("   Sonho Encantado Festa do Pijama");
		gravarArq.println("   Cristiane Aparecida de Oliveira");
		gravarArq.println("");
		gravarArq.println("   ESTA � SUA ASSINATURA DIGITAL, AO RESPONDER ESTE DOCUMENTO");
		gravarArq.println("   ASSINADO ESTAR� CONCORDANDO COM OS TERMOS E CONDI��ES");		
		gravarArq.println("   DESCRITOS NESTE DOCUMENTO.");
		gravarArq.println("");
		gravarArq.println("   Contratante");
		gravarArq.println("   Assine aqui:");
		gravarArq.println("");
		gravarArq.println("");
		arq.close();

	}

}
