/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class teste {
	static void pergunta1() {//pergunta1 sub rotina ASSIM SEGUINDO NAS OUTRAS PERGUNTAS...
		System.out.println("============ PERGUNTA 1 ============");
		String pergunta1;//string de resposta
		char operacao;//  variavel char para ler apenas um caractere 
		boolean tacerto = false;// variavel boolean para validar resposta certa
		String perdeu = "\n VOCÊ PERDEU ";// variavel string de perder
		perdeu += " TENTE DE NOVO!!! ";//acrescentando mais testo da variavel de perder
		
			System.out.println("A) Tão fácil a respota correta é  30");//print das altenativas 
			System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
			System.out.println("C) Moleza a respota correta é 10 ");
			System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
			System.out.println("E) Essa jornada será facil a respota correta é 20");
			System.out.println("Informe sua resposta: ");

			pergunta1 = "B";// colocando resposta na varivel para testar a resposta na pergunta 
			operacao = pergunta1.charAt(0);// char analisando a varivel de resposta e pegando apenas o primeiro caractere 
			switch (operacao) {//switch com cases de alternativas de acordo com a variavel do charAt
			case 'a'://cases com ('..') apenas um catactere.
			case 'A':
				System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
				System.exit(0);
				break;
			case 'b':
			case 'B':
				System.out.println(
						"... 12.\n Ninfa - Você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
				break;
			case 'c':
			case 'C':
				System.out.println("Resposta incorreta e sua jornada acaba aqui " + perdeu);
				System.exit(0);
				break;
			case 'd':
			case 'D':
				System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
				System.exit(0);
				break;
			case 'e':
			case 'E':
				System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
				System.exit(0);
				break;
			default:
				System.out.println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);
				System.exit(0);
			}
		

		if (tacerto) {// validando se a resposta esta correta 
			System.out.println(
					"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
		}

	}

	static void pergunta2() {
		System.out.println("============ PERGUNTA 2 ============");
		boolean acertou = false;
		int cantil = 1;
		List alternativas = new ArrayList();
		alternativas.add("O número é 110");
		alternativas.add("O número é 120");
		alternativas.add("O número é 210");
		alternativas.add("O número é 220");
		alternativas.add("Nenhuma das alternativas"); // resposta correta
		do {
			if (cantil >= 1) {
				System.out.println(
						"- O triplo de um número adicionado com 45 corresponde a seu dobro adicionado a 155. Determine esse numero;\n");
			}
			Collections.shuffle(alternativas);
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = "e";
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("O número é 110")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;

			case "b":
			case "B":
				if (alternativas.get(1).equals("O número é 110")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;

			case "c":
			case "C":
				if (alternativas.get(2).equals("O número é 110")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("O número é 110")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;

			case "e":
			case "E":
				if (alternativas.get(4).equals("O número é 110")) {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}

				break;
			default:
				System.out.println("Escolha inválida!\n");
			}
			cantil++;
		} while (!acertou && cantil < 2);

		if (acertou) {
			System.out
					.println("Guarda -  Esta correto, parabens pode passar. Sorte sua possuir um cantil tão maneiro ");
		} else {
			System.out.println(
					" Guarda - Voce perdeu volte de onde voce veio, muito obrigado pelo cantil maneiro ,perdeu");
					}
	}

	static void pergunta3() {
		System.out.println("============ PERGUNTA 3 ============");
		boolean acertou7 = false;
		int cantil7 = 1;
		List alternativas7 = new ArrayList();
		alternativas7.add("5X+65=3X+195"); // Resposta correta
		alternativas7.add("5X+3X-65=195");
		alternativas7.add("5X-3X=195+65");
		alternativas7.add("5X+3X+65+195=0");
		alternativas7.add("Nenhumas das alternativas");
		do {
			Collections.shuffle(alternativas7);
			if (cantil7 >= 1) {
				System.out.println(
						"Andarilho - O quintuplo de um número adicionado com 65 corresponde a seu triplo adicionado 195. Module a questão.\n");
			}
			System.out.println("a) " + alternativas7.get(0));
			System.out.println("b) " + alternativas7.get(1));
			System.out.println("c) " + alternativas7.get(2));
			System.out.println("d) " + alternativas7.get(3));
			System.out.println("e) " + alternativas7.get(4));
			System.out.print(" escolha a alternativa ");
			String resposta = "a";
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas7.get(0).equals("5X+65=3X+195")) {
					System.out.println("Resposta correta!\n");
					acertou7 = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;

			case "b":
			case "B":
				if (alternativas7.get(1).equals("5X+65=3X+195")) {
					System.out.println("Resposta correta!\n");
					acertou7 = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;

			case "c":
			case "C":
				if (alternativas7.get(2).equals("5X+65=3X+195")) {
					System.out.println("Resposta correta!\n");
					acertou7 = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;
			case "d":
			case "D":
				if (alternativas7.get(3).equals("5X+65=3X+195")) {
					System.out.println("Resposta correta!\n");
					acertou7 = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}
				break;

			case "e":
			case "E":
				if (alternativas7.get(4).equals("5X+65=3X+195")) {
					System.out.println("Resposta correta!\n");
					acertou7 = true;
				} else {
					System.out.println("Resposta incorreta!\n");
				}

				break;
			default:
				System.out.println("Escolha inválida!\n");
			}
			cantil7++;
		} while (!acertou7 && cantil7 < 2);
	}

	public static void main(String[] args) {
            for(int i=0;i<3;i++) // loop for tentando 3 vezes  o codigo
            {
		System.out.println("============( TESTADOR )============");
		pergunta1();
		pergunta2();
		pergunta3();
            }
	}
}