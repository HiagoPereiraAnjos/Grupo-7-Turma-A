/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edney.psilva
 */
// CORRIGINDO ALGUNS ERROS DE LOGICA, TEXTO E CONDIÇÕES...

public class menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("\n1 - Jogar\n2 - Créditos\n3 - Instruções\n4 - Sair");
        int entrada = scanner.nextInt();

        switch (entrada) {
            case 1:
                jogar();
                break;
            case 2:
                créditos();
                break;
            case 3:
                intruções();
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println(" Opção invalida escolha entre 1 e 4!!! ");

        }
    }

    public static void jogar() {
        double escolhadeinicio;
        String nome;
        int tecla;
        Scanner scanner = new Scanner(System.in);
        String perdeu = "\n VOCÊ PERDEU ";
        perdeu += " TENTE DE NOVO!!! ";

        do {
            System.out.println("Olá, bem vindo ao Mochileiro \n");

            System.out.println(
                    "Vocês estão em uma taverna, quando uma briga generalizada começa. Os guardas chegam e levam todos presos. Agora vocês precisam provar que são inocentes, ou passarão meses na cadeia "
                            + "\n");

            System.out.println(" Você deseja iniciar ? " + "\n");
            System.out.println("1- sim ");
            System.out.println("2- nao ");
            escolhadeinicio = scanner.nextDouble();
            if (escolhadeinicio == 1) {
                System.out.println(" Iniciando a jornanda da sabedoria " + "\n ");
            }

            else {
                System.out.println(" Que pena estamos aguardando sua sede por sabedoria " + "\n");
            }
        } while (escolhadeinicio != 1);

        JOptionPane.showMessageDialog(null,
                "Antes de iniciar a sua jornada, existe algo que precisa saber. Este é um mundo cheio de números e contas matematicas, "
                        + "portanto, é necessario que entenda as 4 operações utilizadas nesta matéria (Matemática).");
        JOptionPane.showMessageDialog(null, "Adição e Subtração.\n"
                + "\nA adição combina dois números em um único número, denominado soma, total ou resultado. Adicionar mais números corresponde a repetir a operação.\n "
                + "\nA Subtração ocorre quando uma quantidade é retirada de outra, e o valor restante é o resultado dessa operação, fazendo assim um menos o outro.");
        JOptionPane.showMessageDialog(null, "Divisão e Multiplicação.\n"
                + "\n Multiplicação é uma forma simples de se adicionar uma quantidade finita de números. O resultado da multiplicação de dois números é chamado produto.\n"
                + "\n Um exemplo é: o número é 3 mas o número pedido para ser repetido será o 5 então: 5 x 3 = 5 + 5 + 5 = 15.\n "
                + "\n A subtração é o inverso da multiplicação. Exemplo: se 5 x 3 = 15, então 15 / 3 = 5.");
        JOptionPane.showMessageDialog(null,
                "Importante dizer que iremos trabalhar com modelagem. A modelagem matemática é a área do conhecimento que estuda a simulação de sistemas reais"
                        + " a fim de prever o comportamento destes, sendo empregada em diversos campos de estudo.Dito isto, seguimos e boa sorte em sua jornada.");

        System.out.println(" Qual é o seu nome ? \n");
        nome = scanner.next();
        System.out.println(" Muito bem Grande Mochileiro " + nome);

        int escolha;

        do {

            System.out.println("escolha sua classe \n 1-Guerreiro(a) \n 2-Mago(a) \n 3-Bruxo(a) \n 4-Fada ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(
                            " A aventura dos numeros nos espera, Gurreiro(a) " + " Mochileiro(a) " + nome + "\n\n");
                    System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
                    System.out.println(
                            "Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n"
                                    +
                                    "Este aventureiro se denominava O(a) Guerreiro(a) Mochileiro(a)  " + nome
                                    + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n");
                    System.out.println(
                            "Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n"
                                    +
                                    "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                    System.out.println(
                            "Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                    + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                    + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                    System.out.println(
                            "Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n"
                                    +
                                    "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                    + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                    + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                    System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                            "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n"
                            +
                            nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                            "Andarilho - Eu não…\n" +
                            "- … Incrível essas pessoas né? / falou uma voz do além\n" +
                            "Andariho - O que é isso? / perguntou o andarilho \n" +
                            nome
                            + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                    System.out.println(
                            "Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n"
                                    +
                                    "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n"
                                    +
                                    "\n" +
                                    nome + "\n"
                                    + nome + " - … Como você sabe meu nome?\n" +
                                    "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n"
                                    +
                                    nome + " - Sim, acho que vou conseguir sim.\n" +
                                    "Ninfa - Ok vamos à pergunta…");

                    System.out.println(
                            "\n Ninfa - … Qual a soma de um número com ele mesmo que subtraído por 3 é igual a 1?…\n "
                                    + " - 2… respondeu a mochila antes dele." +
                                    "- Quem está aí? perguntou a Ninfa\n" +
                                    nome + " Novamente explicando, esta é minha mochila encantada.\n" +
                                    "Ninfa - Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual número que somado com 30 e subtraído por 20 é igual a 22?\n"
                                    +
                                    nome + "Essa eu sei, a resposta é... ");
                    String operacaoStr;
                    char operacao;
                    boolean tacerto = false;

                    do {

                        System.out.println("A) Tão fácil a respota correta é  30");
                        System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
                        System.out.println("C) Moleza a respota correta é 10 ");
                        System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                        System.out.println("E) Essa jornada será facil a respota correta é 20");
                        System.out.println("Informe sua resposta: ");

                        operacaoStr = scanner.next();
                        operacao = operacaoStr.charAt(0);
                        switch (operacao) {
                            case 'a':
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
                                System.out
                                        .println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);
                                System.exit(0);
                        }
                    } while (tacerto);

                    if (tacerto) {
                        System.out.println(
                                "Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    }

                    break;
                case 2:
                    System.out.println(
                            " A aventura dos numeros nos espera, Mago(a) " + " Mochileiro(a) " + nome + "\n\n");
                    System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
                    System.out.println(
                            "Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n"
                                    +
                                    "Este aventureiro se denominava O(a) Mago(a) Mochileiro(a)  " + nome
                                    + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n");
                    System.out.println(
                            "Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n"
                                    +
                                    "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                    System.out.println(
                            "Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                    + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                    + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                    System.out.println(
                            "Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n"
                                    +
                                    "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                    + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                    + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                    System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                            "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n"
                            +
                            nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                            "Andarilho - Eu não…\n" +
                            "- … Incrível essas pessoas né? / falou uma voz do além\n" +
                            "Andariho - O que é isso? / perguntou o andarilho \n" +
                            nome
                            + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                    System.out.println(
                            "Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n"
                                    +
                                    "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n"
                                    +
                                    "\n" +
                                    nome + "\n"
                                    + nome + " - … Como você sabe meu nome?\n" +
                                    "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n"
                                    +
                                    nome + " - Sim, acho que vou conseguir sim.\n" +
                                    "Ninfa - Ok vamos à pergunta…");

                    System.out.println(
                            "\n Ninfa - … Qual a soma de um número com ele mesmo que subtraído por 3 é igual a 1?…\n "
                                    + " - 2… respondeu a mochila antes dele." +
                                    "- Quem está aí? perguntou a Ninfa\n" +
                                    nome + " Novamente explicando, esta é minha mochila encantada.\n" +
                                    "Ninfa - Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual número que somado com 30 e subtraído por 20 é igual a 22?\n"
                                    +
                                    nome + "Essa eu sei, a resposta é... ");
                    String operacaoStr2;
                    char operacao2;
                    boolean tacerto2 = false;

                    do {

                        System.out.println("A) Tão fácil a respota correta é  30");
                        System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
                        System.out.println("C) Moleza a respota correta é 10 ");
                        System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                        System.out.println("E)  Essa jornada será facil a respota correta é 20");
                        System.out.println("Informe sua resposta: ");

                        operacaoStr = scanner.next();
                        operacao = operacaoStr.charAt(0);
                        switch (operacao) {
                            case 'a':
                            case 'A':
                                System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
                                System.exit(0);
                                break;
                            case 'b':
                            case 'B':
                                System.out.println(
                                        "... 12.\n Ninfa -  Você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
                                break;
                            case 'c':
                            case 'C':
                                System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
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
                                System.out
                                        .println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);
                                System.exit(0);
                        }
                    } while (tacerto2);
                    if (tacerto2) {
                        System.out.println(
                                "Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    }
                    break;
                case 3:
                    System.out.println(
                            " A aventura dos numeros nos espera, Bruxo(a) " + " Mochileiro(a) " + nome + "\n\n");
                    System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
                    System.out.println(
                            "Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n"
                                    +
                                    "Este aventureiro se denominava O(a) Bruxo(a) Mochileiro(a)  " + nome
                                    + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n");
                    System.out.println(
                            "Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n"
                                    +
                                    "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                    System.out.println(
                            "Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                    + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                    + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                    System.out.println(
                            "Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n"
                                    +
                                    "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                    + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                    + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                    System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                            "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n"
                            +
                            nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                            "Andarilho - Eu não…\n" +
                            "- … Incrível essas pessoas né? / falou uma voz do além.\n" +
                            " - O que é isso? /n Perguntou o andarilho. \n" +
                            nome
                            + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                    System.out.println(
                            "Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n"
                                    +
                                    "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n"
                                    +
                                    "\n" +
                                    nome + "\n"
                                    + nome + " - … Como você sabe meu nome?\n" +
                                    "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n"
                                    +
                                    nome + " - Sim, acho que vou conseguir sim.\n" +
                                    "Ninfa - Ok vamos à pergunta…");

                    System.out.println(
                            "\n Ninfa - … Qual a soma de um número com ele mesmo que subtraído por 3 é igual a 1?…\n "
                                    + " - 2… respondeu a mochila antes dele." +
                                    "- Quem está aí? perguntou a Ninfa\n" +
                                    nome + " Novamente explicando, esta é minha mochila encantada.\n" +
                                    "Ninfa - Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual número que somado com 30 e subtraído por 20 é igual a 22?\n"
                                    +
                                    nome + "Essa eu sei, a resposta é... ");
                    String operacaoStr3;
                    char operacao3;
                    boolean tacerto3 = false;

                    do {

                        System.out.println("A) Tão fácil a respota correta é  30");
                        System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
                        System.out.println("C) Moleza a respota correta é 10 ");
                        System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                        System.out.println("E)  Essa jornada será facil a respota correta é 20");
                        System.out.println("Informe sua resposta: ");

                        operacaoStr = scanner.next();
                        operacao = operacaoStr.charAt(0);
                        switch (operacao) {
                            case 'a':
                            case 'A':
                                System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
                                System.exit(0);
                                break;
                            case 'b':
                            case 'B':
                                System.out.println(
                                        "... 12.\n Ninfa -  você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
                                break;
                            case 'c':
                            case 'C':
                                System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
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
                                System.out
                                        .println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);
                                System.exit(0);
                        }
                    } while (tacerto3);
                    if (tacerto3) {
                        System.out.println(
                                "Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    }
                    break;
                case 4:
                    System.out.println(
                            " A aventura dos numeros nos espera, Bruxo(a) " + " Mochileiro(a) " + nome + "\n\n");
                    System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
                    System.out.println(
                            "Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n"
                                    +
                                    "Este aventureiro se denominava O(a) Bruxo(a) Mochileiro(a)  " + nome
                                    + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n");
                    System.out.println(
                            "Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n"
                                    +
                                    "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                    System.out.println(
                            "Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                    + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                    + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                    System.out.println(
                            "Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n"
                                    +
                                    "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                    + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                    + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                    System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                            "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n"
                            +
                            nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                            "Andarilho - Eu não…\n" +
                            "- … Incrível essas pessoas né? / falou uma voz do além.\n" +
                            " - O que é isso? /n Perguntou o andarilho. \n" +
                            nome
                            + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                    System.out.println(
                            "Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n"
                                    +
                                    "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n"
                                    +
                                    "\n" +
                                    nome + "\n"
                                    + nome + " - … Como você sabe meu nome?\n" +
                                    "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n"
                                    +
                                    nome + " - Sim, acho que vou conseguir sim.\n" +
                                    "Ninfa - Ok vamos à pergunta…");

                    System.out.println(
                            "\n Ninfa - … Qual a soma de um número com ele mesmo que subtraído por 3 é igual a 1?…\n "
                                    + " - 2… respondeu a mochila antes dele." +
                                    "- Quem está aí? perguntou a Ninfa\n" +
                                    nome + " Novamente explicando, esta é minha mochila encantada.\n" +
                                    "Ninfa - Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual número que somado com 30 e subtraído por 20 é igual a 22?\n"
                                    +
                                    nome + "Essa eu sei, a resposta é... ");

                    boolean tacerto4 = false;

                    do {

                        System.out.println("A) Tão fácil a respota correta é  30");
                        System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
                        System.out.println("C) Moleza a respota correta é 10 ");
                        System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                        System.out.println("E)  Essa jornada será facil a respota correta é 20");
                        System.out.println("Informe sua resposta: ");

                        operacaoStr = scanner.next();
                        operacao = operacaoStr.charAt(0);
                        switch (operacao) {
                            case 'a':
                            case 'A':
                                System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
                                System.exit(0);
                                break;
                            case 'b':
                            case 'B':
                                System.out.println(
                                        "... 12.\n Ninfa -  você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
                                break;
                            case 'c':
                            case 'C':
                                System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);
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
                                System.out
                                        .println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);
                                System.exit(0);
                        }
                    } while (tacerto4);
                    if (tacerto4) {
                        System.out.println(
                                "Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    }

                    break;

            }
        } while (escolha > 4);

        String questao2 = "Neste momento está saindo para outro ponto de sua jornada ate chegar aonde deseja, mas nesse meio tempo acaba encontrando com seu conhecido e futuro amigo, O Andarilho.\n"
                +
                "Neste momento crucial ambos se juntam e formam uma dupla infalível para conseguir chegar até onde ambos querem. Mas no caso do Mochileiro, ele deseja emprego mas seu companheiro... já deseja algo diferente, algo mais ardente, nosso querido Andarilho quer aguardente e para onde ambos vão... eles encontram os dois.\n"
                +
                "\n" +
                "Dias de caminhada se passaram e eles chegaram à uma savana, onde acharam uma civilização chamada Spykinos. Uma cidade composta por pessoas diferentes, uma mistura de cachorro com humano. Seu líder se chamava Spyke, um soberano de mais de 150 anos de idade em uma bela forma.\n"
                +
                "Suas características eram baseadas em um Shih-tzu. \n" +
                "\n" +
                "Nesta cidade era meio que um mercado negro, tudo que queria você encontrava. Caso precisasse de algo fora das normas delimitadas de cada civilização, lá era o lugar.\n"
                +
                "\n" +
                "Ao se aproximar da cidade olharam uma bela muralha onde se encontrava dois guardas, e então disseram:\n"
                +
                "Guarda - AUTO LA!!! Quem são voces ?\n" +
                nome + " - Ola, somos andarilhos, estamos so de passagem por esta cidade.\n" +
                "Guarda - bom, para entrar aqui deverao responder a uma pergunta… \n\n" +
                "O triplo de um número adicionado com 45 corresponde a seu dobro adicionado a 155. Determine esse numero;\n\n";
        System.out.println("Por ter este cantil mágico, voce terá uma chance de errar apenas.../");

        System.out.println(questao2);
        boolean acertou = false;
        int cantil = 0;
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
            String resposta = scanner.next();
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
                    " Guarda - Voce perdeu volte de onde voce veio, muito obrigado pelo cantil maneiro " + perdeu);
            System.exit(0);
        }
        String questao3 = "Apos este enigma, os mesmo vão ao meio da cidade, o Andarilho avistou uma taverna e quis entrar, mas o Mochileiro não quis e não entendeu o porquê do seu companheiro estar tão afobado para entrar, então ele perguntou mas algo inesperado aconteceu.\n"
                +
                nome + "- Ei Andarilho porque você está tão afobado assim para entrar nesta taverna?\n" +
                "Andarilho - Olha... te falo se responder uma pergunta, o que acha ?\n" +
                nome + "- Acho excelente, pode mandar.\n" +
                "\n" +

                "\n" +
                "Andarilho - O quintuplo de um número adicionado com 65 corresponde a seu triplo adicionado 195. Module a questão.";

        System.out.println(questao3);
        boolean acertou7 = false;
        int cantil7 = 0;
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
            String resposta = scanner.next();
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

        String resolvaquestao3 = "Andarilho - Resolva o resultado da questão anterior: 5X+65=3X+195.";

        System.out.println(resolvaquestao3);
        boolean acertou2 = false;
        int cantil2 = 0;
        List alternativas2 = new ArrayList();
        alternativas2.add("O número é 50");
        alternativas2.add("O número é 9");
        alternativas2.add("O número é 27");
        alternativas2.add("O número é 65"); // resposta correta
        alternativas2.add("Nenhumas das alternativas");
        do {
            Collections.shuffle(alternativas2);
            if (cantil2 >= 1) {
                System.out.println("Andarilho - Resolva o resultado da questão anterior: 5X+65=3X195.");
            }
            System.out.println("a) " + alternativas2.get(0));
            System.out.println("b) " + alternativas2.get(1));
            System.out.println("c) " + alternativas2.get(2));
            System.out.println("d) " + alternativas2.get(3));
            System.out.println("e) " + alternativas2.get(4));
            System.out.print(" escolha a alternativa ");
            String resposta = scanner.next();
            switch (resposta) {
                case "a":
                case "A":
                    if (alternativas2.get(0).equals("O número é 65")) {
                        System.out.println("Resposta correta!\n");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "b":
                case "B":
                    if (alternativas2.get(1).equals("O número é 65")) {
                        System.out.println("Resposta correta!\n");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "c":
                case "C":
                    if (alternativas2.get(2).equals("O número é 65")) {
                        System.out.println("Resposta correta!\n");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;
                case "d":
                case "D":
                    if (alternativas2.get(3).equals("O número é 65")) {
                        System.out.println("Resposta correta!\n");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "e":
                case "E":
                    if (alternativas2.get(4).equals("O número é 65")) {
                        System.out.println("Resposta correta!\n");
                        acertou2 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }

                    break;
                default:
                    System.out.println("Escolha inválida!\n");
            }
            cantil2++;
        } while (!acertou2 && cantil2 < 2);
        if (acertou2) {
            System.out.println(
                    "Andarilho - Está correto, promessa é promessa. Estou tão afobado assim porque eu amo agua-ardente, "
                            + "acho que de um ano para cá acabei ficando dependente ou apenas sendo um degustador, por isso a vontade de tomar ou ir à taverna. ");
        } else {
            System.out.println(" Andarilho - Infelismente nao vou poder falar,siga sua rota sem eu \n Mas sem ele "
                    + nome + " não conseguirá seguir," + perdeu);
            System.exit(0);
        }

        System.out.println(
                "Sabendo disso foi decidido que iriam acabar essa jornada em uma taverna com uma agua-ardente e um trabalho.\n"
                        + "O Mochileiro e O Andarilho iam adentrando a cidade de pouco em pouco, mas quando menos esperava algo inusitado aconteceu."
                        + "Uma execução de um ladrão seria feita naquele mesmo dia. \n"
                        + "Ambos não sabiam o que estava acontecendo, mas decidiram aproximar-se do local e entender o que havia ali naquele espaço.\n"
                        + "Este ladrão era a THE key, uma chaveira que costumava trabalhar para o rei, ela sempre abria seu cofre. Ele era esquecido e nunca lembrava onde colocava a chave do cofre, então pedia para ela abrir todas as vezes.\n"
                        +
                        "Um certo dia algo de seu cofre sumiu, então o rei suspeitou que era ela, a pessoa que mais tinha acesso além de si."
                        + "Quando viram e entenderam o que aconteceu, os viajantes foram até o rei para investigar e descobriram algo inusitado, algo que nem o próprio rei havia visto. \n"
                        +
                        "Em seu cofre existia um esquilo ladrão, que pegava suas coisas e as escondia em um buraco na parede onde era a sua casa. O rei entendeu, mas o esquilo odiando a raça dos Spykinos percebeu algo diferente:");

        String questao4 = "Esquilo - Ei, rei…\n" +
                "Rei - Fala ratinho!\n" +
                "Esquilo - Olha só, eu lhe devolvo seu pertence e você libera a menina por algo que ela não fez ok?\n" +
                "Rei - Tá, mas o que eu tenho que fazer?\n" +
                "Esquilo - Simples seu pulguento, responda essa perguntinha… "
                + "6 unidades somadas ao dobro de um número é igual a 82. Module a questão.";
        System.out.println(questao4);
        boolean acertou3 = false;
        int cantil3 = 0;

        List alternativas3 = new ArrayList();
        alternativas3.add("6+82=2N");
        alternativas3.add("82+6N=2");
        alternativas3.add("6-2N=82");
        alternativas3.add("6+2N=82");// Resposta correta
        alternativas3.add("Nenhuma das alternativas");

        do {
            Collections.shuffle(alternativas3);
            if (cantil3 >= 1) {
                System.out.println("- 6 unidades somadas ao dobro de um número é igual a 82. Module a questão.");
            }
            Collections.shuffle(alternativas3);
            System.out.println("a) " + alternativas3.get(0));
            System.out.println("b) " + alternativas3.get(1));
            System.out.println("c) " + alternativas3.get(2));
            System.out.println("d) " + alternativas3.get(3));
            System.out.println("e) " + alternativas3.get(4));
            System.out.print("Escolha uma alternativa: ");
            String resposta2 = scanner.next();
            switch (resposta2) {
                case "a":
                case "A":
                    if (alternativas3.get(0).equals("6+2N=82")) {
                        System.out.println("Resposta correta!\n");
                        acertou3 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "b":
                case "B":
                    if (alternativas3.get(1).equals("6+2N=82")) {
                        System.out.println("Resposta correta!\n");
                        acertou3 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "c":
                case "C":
                    if (alternativas3.get(2).equals("6+2N=82")) {
                        System.out.println("Resposta correta!\n");
                        acertou3 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "d":
                case "D":
                    if (alternativas3.get(3).equals("6+2N=82")) {
                        System.out.println("Resposta correta!\n");
                        acertou3 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "e":
                case "E":
                    if (alternativas3.get(4).equals("6+2N=82")) {
                        System.out.println("Resposta correta!\n");
                        acertou3 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!\n");
                    cantil3++;
            }

        } while (!acertou3);

        String questao5 = ("Esquilo - Não acabou aqui, agora resolva a questão. Qual o valor de N na expressão: 6+2N=82.");

        System.out.println(questao5);
        boolean acertou4 = false;
        int cantil4 = 0;

        List alternativas4 = new ArrayList();
        alternativas4.add("-38");
        alternativas4.add("44");
        alternativas4.add("38");// Resposta correta
        alternativas4.add("-44");
        alternativas4.add("Nenhuma das alternativas");

        do {
            Collections.shuffle(alternativas4);
            if (cantil4 >= 1) {
                System.out.println(
                        "Esquilo - Não acabou aqui, agora resolva a questão. Qual o valor de N na expressão: 6+2N=82.");
            }
            Collections.shuffle(alternativas4);
            System.out.println("a) " + alternativas4.get(0));
            System.out.println("b) " + alternativas4.get(1));
            System.out.println("c) " + alternativas4.get(2));
            System.out.println("d) " + alternativas4.get(3));
            System.out.println("e) " + alternativas4.get(4));
            System.out.print("Escolha uma alternativa: ");
            String resposta3 = scanner.next();
            switch (resposta3) {
                case "a":
                case "A":
                    if (alternativas4.get(0).equals("38")) {
                        System.out.println("Resposta correta!\n");
                        acertou4 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "b":
                case "B":
                    if (alternativas4.get(1).equals("38")) {
                        System.out.println("Resposta correta!\n");
                        acertou4 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "c":
                case "C":
                    if (alternativas4.get(2).equals("38")) {
                        System.out.println("Resposta correta!\n");
                        acertou4 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "d":
                case "D":
                    if (alternativas4.get(3).equals("38")) {
                        System.out.println("Resposta correta!\n");
                        acertou4 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "e":
                case "E":
                    if (alternativas4.get(4).equals("38")) {
                        System.out.println("Resposta correta!\n");
                        acertou4 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!\n");
                    cantil4++;
            }

        } while (!acertou4);

        String questao6 = ("Esquilo - Vou dificultar um pouco mais. O quadrado de um número menos o seu triplo é igual a 40. Qual é este número ? ");

        System.out.println(questao6);
        boolean acertou5 = false;
        int cantil5 = 0;

        List alternativas5 = new ArrayList();
        alternativas5.add("4X-3=40");
        alternativas5.add("X²-3x=40");// Resposta correta
        alternativas5.add("4X-3X=40");
        alternativas5.add("X²-3=40");
        alternativas5.add("Nenhuma das alternativas");

        do {
            Collections.shuffle(alternativas5);
            if (cantil5 >= 1) {
                System.out.println(
                        "Esquilo - Vou dificultar um pouco mais. O quadrado de um número menos o seu triplo é igual a 40. Qual é este número ? ");
            }
            Collections.shuffle(alternativas5);
            System.out.println("a) " + alternativas5.get(0));
            System.out.println("b) " + alternativas5.get(1));
            System.out.println("c) " + alternativas5.get(2));
            System.out.println("d) " + alternativas5.get(3));
            System.out.println("e) " + alternativas5.get(4));
            System.out.print("Escolha uma alternativa: ");
            String resposta4 = scanner.next();
            switch (resposta4) {
                case "a":
                case "A":
                    if (alternativas5.get(0).equals("X²-3x=40")) {
                        System.out.println("Resposta correta!\n");
                        acertou5 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "b":
                case "B":
                    if (alternativas5.get(1).equals("X²-3x=40")) {
                        System.out.println("Resposta correta!\n");
                        acertou5 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "c":
                case "C":
                    if (alternativas5.get(2).equals("X²-3x=40")) {
                        System.out.println("Resposta correta!\n");
                        acertou5 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "d":
                case "D":
                    if (alternativas5.get(3).equals("X²-3x=40")) {
                        System.out.println("Resposta correta!\n");
                        acertou5 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "e":
                case "E":
                    if (alternativas5.get(4).equals("X²-3x=40")) {
                        System.out.println("Resposta correta!\n");
                        acertou5 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!\n");
                    cantil5++;
            }

        } while (!acertou5);

        String questao7 = ("Esquilo - E para encerrar resolva o resultado da questão anterior: X²-3X=40 ");

        System.out.println(questao7);
        boolean acertou6 = false;
        int cantil6 = 0;

        List alternativas6 = new ArrayList();
        alternativas6.add("5 e 8");
        alternativas6.add("-8 e 5");
        alternativas6.add("-8 e -5");
        alternativas6.add("Nenhuma das alternativas");
        alternativas6.add("-5 e 8");// Resposta correta

        do {
            Collections.shuffle(alternativas6);
            if (cantil6 >= 1) {
                System.out.println("Esquilo - E para encerrar resolva o resultado da questão anterior: X²-3X=40 ");
            }
            Collections.shuffle(alternativas6);
            System.out.println("a) " + alternativas6.get(0));
            System.out.println("b) " + alternativas6.get(1));
            System.out.println("c) " + alternativas6.get(2));
            System.out.println("d) " + alternativas6.get(3));
            System.out.println("e) " + alternativas6.get(4));
            System.out.print("Escolha uma alternativa: ");
            String resposta5 = scanner.next();
            switch (resposta5) {
                case "a":
                case "A":
                    if (alternativas6.get(0).equals("-5 e 8")) {
                        System.out.println("Resposta correta!\n");
                        acertou6 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "b":
                case "B":
                    if (alternativas6.get(1).equals("-5 e 8")) {
                        System.out.println("Resposta correta!\n");
                        acertou6 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "c":
                case "C":
                    if (alternativas6.get(2).equals("-5 e 8")) {
                        System.out.println("Resposta correta!\n");
                        acertou6 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "d":
                case "D":
                    if (alternativas6.get(3).equals("-5 e 8")) {
                        System.out.println("Resposta correta!\n");
                        acertou6 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;

                case "e":
                case "E":
                    if (alternativas6.get(4).equals("-5 e 8")) {
                        System.out.println("Resposta correta!\n");
                        acertou6 = true;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!\n");
                    cantil6++;
            }

        } while (!acertou6);

        if (acertou6) {
            System.out.println("Esquilo - Certo, pegue o seu pertence e libere a agarota!");
        } else {
            System.out.println("Esquilo - Você errou, nao irei devolve-lo" + perdeu);
            System.exit(0);
        }

        System.out.println(
                "Neste momento os heróis desta história se assustaram com tudo e vibraram quando à soltaram. Explicaram para ela o ocorrido e comemoraram juntos e seguiram o rumo de sua aventura. \n"
                        +
                        "Mas quando menos esperavam a menina veio correndo até eles e pediu para que pudesse ir com eles já que o rei não confiava mais nela, então assim foi feita mais uma aliança.\n"
                        +
                        "Tempos se passaram e os heróis estavam chegando ao seu destino onde havia trabalho e muitas tavernas.\n"
                        +
                        "\n" +
                        "Chegando lá a The Key ficou estranha, falou que estava suando frio e outras coisas suspeitas, os dois não entenderam e então continuaram.\n"
                        +
                        "Antes de achar um emprego foram à taverna e encontraram um rapaz, o dono da taverna, conhecido como Francisco. Por mais estranho que estava, Francisco disse que algo aconteceu no reino e por isso tinham muitos soldados disfarçados. Dito isso ele entendeu e percebeu que a The Key estava mentindo e o ratinho trabalhava com ela. \n"
                        +
                        "\n" +
                        "Assim depois de dois copos de água-ardente que nossos aventureiros estavam tomando para terminar sua jornada, o rei dos Spykinos apareceu e lhes prenderam…\n"
                        +
                        "\n" +
                        "A partir daí veio essa história sobre os fatos ocorridos, mas e você? Você os acha culpados ou inocentes?");

    }

    public static void intruções() {
        System.out.println("instruções");
    }

    public static void créditos() {
        System.out.println(
                "===== DESENVOLVEDORES =====\nAlexsandro Lopes Sipelli\nDanilo Ribeiro Cueto\nEdney Pereira Silva\nHiago Ferreira\nMatheus Medeiros Escudeiro");
    }

    public static void main(String[] args) {
        menu();
    }
}
