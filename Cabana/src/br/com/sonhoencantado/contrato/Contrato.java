package br.com.sonhoencantado.contrato;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Contrato{	

	public static void main (String [] args) throws IOException{
		
		
		Cliente cliente = new Cliente();
		Festa festa = new Festa();
		Itens item = new Itens();
		
		// enderço e nome do arquivo a ser gerado
		FileWriter arq = new FileWriter("C:\\Users\\Tiago\\Desktop\\contratos\\"+cliente+".txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		// Solicitando informações para criar contrato
		cliente.dadosCliente();
		festa.dadosFesta();
		item.itens();
		
		// *** Inicio do contrato ***

		// cabeçalho
		gravarArq.println("                        * Sonho Encantado Festa do Pijama *");
		gravarArq.println("                      Contrato de locação de Cabanas de Pijama");
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Das Partes");

		// dados do contratante
		gravarArq.println("");
		gravarArq.println("     " + cliente.cliente + ", " + cliente.nacionalidade + ", " + cliente.estadoCivil + ", " + cliente.profissao + ", RG: " + cliente.RG + ",");  
		gravarArq.println("   CPF: " + cliente.CPF + ", domiciliado e residente à " + cliente.logradouro + ", " + cliente.numero + ", " + cliente.complemento + "," ); 
		gravarArq.println("   "+ cliente.bairro + " - " + cliente.cidade + " - SP, CEP: " + cliente.CEP + ", neste ato denominado CONTRATANTE.");

		// dados do contratado
		gravarArq.println("");
		gravarArq.println("     Sonho Encantado Festa do Pijama, representada neste ato por seu sócio administrador");
		gravarArq.println("   Cristiane Aparecida de Oliveira, brasileira, casada, administradora de empresa,");
		gravarArq.println("   portadora do RG 59.276.124-1 e do CPF 006.648.249-60, domiciliado e residente à Rua Ernesto Barreto, 40,");
		gravarArq.println("   Interlagos - CEP 04827-183, aqui denominada CONTRATADA.");

		// justificativa do contrato
		gravarArq.println("");
		gravarArq.println("     Têm entre os mesmos, de maneira justa e acordada, o presente CONTRATO PARA");
		gravarArq.println("   PRESTAÇÃO DE SERVIÇOS LOCAÇÃO DE DECORAÇÃO FESTA DO PIJAMA,");
		gravarArq.println("   ficando desde já aceito, pelas partes as cláusulas abaixo descritas.");

		// 1ª clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cláusula 1ª – Do objeto do contrato e do orçamento");
		gravarArq.println("");
		gravarArq.println("     O presente contrato tem como OBJETO a locação da decoração para Festa do Pijama de ");
		gravarArq.println("   tema " + festa.tema + ", e orçamento contido no anexo único deste contrato que fica fazendo parte ");
		gravarArq.println("   integrante deste, nos moldes e forma especificados neste contrato.");

		// paragrafo único
		if(festa.frete > 0){
			gravarArq.println("");
			gravarArq.println("     Parágrafo Único: Os materiais da decoração para festa do pijama de tema " + festa.tema + " serão ");
			gravarArq.println("   entregue pela contratada no local mencionado da contratante, no dia " + festa.dataMontagem + "/2017,");
			gravarArq.println("   horário previsto para entrega a partir das " + festa.horaMontagem +":00 horas,");
			gravarArq.println("   e com retirada prevista para as " + festa.horaRetirada + ":00 horas do dia " + festa.dataRetirada + "/2017.");
		}else{
			
		}
		// 2ª clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cláusula 2ª - Das obrigações da Contratada ");
		gravarArq.println("");
		gravarArq.println("     A CONTRATADA se compromete a disponibilizar seus materiais de decoração para Festa");
		gravarArq.println("   do Pijama na data e horário mencionados na Cláusula 1ª, que será entregue pelo contratado");
		gravarArq.println("   no horário e local indicado no Parágrafo Único, da Cláusula Primeira. ");

		// 3ª clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cláusula 3ª - Dos materiais e serviços");
		gravarArq.println("");
		gravarArq.println("     A respeito da decoração da Festa do Pijama de tema " + festa.tema + ", a CONTRATADA se");
		gravarArq.println("   compromete a fornecer todo material necessário na forma especificada no anexo único");
		gravarArq.println("   deste contrato.");

		// 4ª clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cláusula 4ª - Do preço e das condições de pagamento");
		gravarArq.println("");
		gravarArq.println("     Pelos materiais relacionados na cláusula 3ª e anexo único deste contrato, o CONTRATANTE");
		gravarArq.println("   pagará à CONTRATADA o valor de R$ "+ festa.valorTotal +",00 (reais) que deverá ser pago " + festa.formaDePagamento);

		// 5ª clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cláusula 5ª - Cláusula penal ");
		gravarArq.println("");
		gravarArq.println("     Caso o CONTRATANTE desista de promover a festa contratada, ou seja, o evento seja");
		gravarArq.println("   cancelado por sua culpa, ficam estipuladas as seguintes cláusulas penais:");
		gravarArq.println("");
		gravarArq.println("   a) Até 06 (seis) meses antes do evento será devolvido 90% da importância paga;");
		gravarArq.println("   b) Até 05 (cinco) meses antes do evento será devolvido 85% da importância paga;");
		gravarArq.println("   c) Até 04 (quatro) meses antes do evento será devolvido 80% da importância paga;");
		gravarArq.println("   d) Até 03 (três) meses antes do evento será devolvido 75% da importância paga;");
		gravarArq.println("   e) Até 02 (dois) meses antes do evento será devolvido 70% da importância paga.");
		gravarArq.println("   f) Até 01 (um) mês antes do evento será devolvido 50% da importância paga.");
		gravarArq.println("");
		gravarArq.println("     Parágrafo Primeiro. Em outros casos, não será devolvida nenhuma importância paga, salvo");
		gravarArq.println("   se o evento não se realizar por caso fortuito ou força maior, ocasião em que será devolvido");
		gravarArq.println("   o percentual de 50% do valor contratado.");
		gravarArq.println("");
		gravarArq.println("     Parágrafo Segundo. Caso a desistência se dê por culpa da CONTRATADA esta deverá além ");
		gravarArq.println("   de devolver integralmente a importância já paga pela CONTRATANTE sujeitar-se a título de ");
		gravarArq.println("   cláusula penal ao pagamento de 90% (noventa por cento) do valor contratado. ");

		// 6ª clausula
		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" Cláusula 6ª - Das disposições finais");
		gravarArq.println("");
		gravarArq.println("     As partes elegem o foro da comarca de São Paulo - SP com exclusão de qualquer outro,");
		gravarArq.println("   por mais privilegiado que seja, para resolver qualquer litígio que porventura venha a surgir");
		gravarArq.println("   em razão do presente contrato.");


		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println(" ANEXO - MATERIAIS E SERVIÇOS");
		gravarArq.println("");
		gravarArq.println(" ESTRUTURA E DECORAÇÃO");
		gravarArq.println("");
		gravarArq.println("     Material para " + festa.qtdCabanas +" cabanas ");
		gravarArq.println("   " + festa.qtdCabanas + " - Estruturas de cabanas de pijama infantil de madeira");
		gravarArq.println("        Altura 1,40 m");
		gravarArq.println("        Largura 1,30 m");
		gravarArq.println("        Comprimento 1,20 m");
		if(festa.manta > 0)
			gravarArq.println("   " + (festa.qtdCabanas * 2) + " - Mantas");
		gravarArq.println("   " + festa.qtdCabanas + " - Forros de cabana do tema " + festa.tema);
		gravarArq.println("   " + item.qtdPisca + " - Cordões de Pisca-pisca ");
		gravarArq.println("   " + item.qtdExtensao + " - Extensão elétrica");
		gravarArq.println("   1 - Caixote decorativo");
		gravarArq.println("   1 - Lousa para nome do aniversariante ");
		gravarArq.println("   1 - Giz ");
		gravarArq.println("   1 - Tapete na cor verde (2,00 X " + item.tapete + " m) ");

		if(item.abajour == 1)gravarArq.println("   1 - Abajur de Led ");
		if(item.qtdCachepo > 0)gravarArq.println("   " + item.qtdCachepo + " - Vasos de Cachepot com arranjo de hera");

		switch (festa.tema) {

		case "Princesa": // Tema = 1
			gravarArq.println("   1 – Palavra princesa");
			gravarArq.println("   2 – Almofadas decorativas");
			gravarArq.println("   " + festa.qtdCabanas + " – Coroinhas decorativas");
			break;

		case "Corujinha": // Tema = 2
			gravarArq.println("   3 – Corujinhas de pelúcia");
			break;

		case "Nuvens": // Tema = 3
			gravarArq.println("   2 – Almofadas");
			gravarArq.println("   3 – Nuvens");
			gravarArq.println("   1 – Estrela");
			gravarArq.println("   1 – Lua");
			break;

		case "Pokemon": // Tema = 4
			gravarArq.println("   2 - Pokemons de pelúcia");
			gravarArq.println("   2 - Pokebolas de pelúcia");
			break;
		
		// Nenhum item a adicionar na decoração Exécito
		//case "Exército": // Tema = 5
			
		case "Safari": // Tema = 6
			gravarArq.println("   1 - Macaco de pelúcia");
			gravarArq.println("   1 - Girafa de pelúcia");
			gravarArq.println("   1 - Tigre de pelúcia");
			gravarArq.println("   1 - Tartaruga de pelúcia");
			break;

		case "Vingadores": // Tema = 7
			gravarArq.println("   4 - Mascaras decorativas");
			gravarArq.println("   4 - Vingadores de pelúcia");			
			break;

		case "Bailarina": // Tema = 8
			gravarArq.println("   1 - Abajour de bailarina");
			gravarArq.println("   1 - Bailarina de MDF");
			gravarArq.println("   2 - Almofadas de bailarina");
			gravarArq.println("   2 - Caixinhas decorativas de bailarina com vela de led");
			break;
			
		case "Unicórnio": // Tema = 9
			gravarArq.println("   3 - Unicórnios de pelúcia");
			gravarArq.println("   1 - Luminária de arco-íris");
			gravarArq.println("   2 - Almofadas decorativas");
			break;

		case "Minecraft": // Tema = 10
			gravarArq.println("   3 - Personagens de pelúcia");
			gravarArq.println("   1 - Poster com nome do aniversáriante");
			gravarArq.println("   2 - Almofadas decorativas");
			gravarArq.println("   2 - Cordões de bandeirolas");
			break;
		case "The Flash": // Tema = 11
			gravarArq.println("   1 - Poster com nome do aniversáriante");
			gravarArq.println("   2 - Almofadas decorativas");
			break;
		case "Futebol": // Tema = 12
			gravarArq.println("   1 - Gol decorativo");
			gravarArq.println("   2 - Almofadas decorativas");
			gravarArq.println("   2 - Bolas de pelúcia");
			gravarArq.println("   8 - Cones coloridos");
			break;
		}
		
		gravarArq.println("      Cada cabana acompanha Kit sono que acomoda duas crianças");
		gravarArq.println("   O Kit sono é composto por:");
		gravarArq.println("   2 - Colchões");
		gravarArq.println("   2 - Lençóis");
		gravarArq.println("   2 - Travesseiros");

		if(festa.bau > 0){
			gravarArq.println("");
			gravarArq.println("     Baú de Jogos");
			gravarArq.println("   Jogo Cara a Cara");
			gravarArq.println("   Jogo Vira Letras");
			gravarArq.println("   Jogo Bananas de Pijamas");
			gravarArq.println("   Jogo da Memória Moana");
			gravarArq.println("   Jogo da memória Vingadores"); 
			gravarArq.println("   Quebra Cabeça 'A casa do Mickey Mouse'");
			gravarArq.println("     Livros de Historinhas");
			gravarArq.println("   Barbie o segredo das fadas");
			gravarArq.println("   Cinderela");
			gravarArq.println("   O gato de botas");
			gravarArq.println("   João e o pé de feijão");
		}

		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println("     ANEXO - PREÇOS E CONDIÇÕES DE PAGAMENTO");
		gravarArq.println("");
		gravarArq.println("   |   Produto   |  Quantidade  |   Valor Unitário   |   Valor total item   |");
		gravarArq.println("   |   Cabana    |  " + festa.qtdCabanas + "           |   R$  90,00        |   R$ " + (festa.qtdCabanas * 90) + ",00          |");
		if(festa.bau > 0 )gravarArq.println("   |   Baú       |  1           |   R$ 100,00        |   R$ 100,00          |");
		if(festa.manta > 0 )gravarArq.println("   |   Manta     |  " + festa.qtdCabanas * 2 + "           |   R$  10,00        |   R$  " + (festa.qtdCabanas * 2) * 10 + ",00          |");
		if(festa.frete > 0)gravarArq.println("   |   Frete     |  1           |   R$ " + festa.frete + ",00        |   R$ " + festa.frete + ",00          |");
		gravarArq.println("   |   Valor total da locação                        |   R$ " + festa.valorTotal + ",00          |");		

		gravarArq.println("");
		gravarArq.println("");
		gravarArq.println("   São Paulo , " + festa.dia + " de " + festa.mes + " de 2017.");
		gravarArq.println("");
		gravarArq.println("   E, por estarem justas e contratadas, as partes assinam este instrumento, esta via");
		gravarArq.println("   do contrato digital.");
		gravarArq.println("");
		gravarArq.println("   Contratada");
		gravarArq.println("   Sonho Encantado Festa do Pijama");
		gravarArq.println("   Cristiane Aparecida de Oliveira");
		gravarArq.println("");
		gravarArq.println("   ESTA É SUA ASSINATURA DIGITAL, AO RESPONDER ESTE DOCUMENTO");
		gravarArq.println("   ASSINADO ESTARÁ CONCORDANDO COM OS TERMOS E CONDIÇÕES");		
		gravarArq.println("   DESCRITOS NESTE DOCUMENTO.");
		gravarArq.println("");
		gravarArq.println("   Contratante");
		gravarArq.println("   Assine aqui:");
		gravarArq.println("");
		gravarArq.println("");
		arq.close();

	}

}
