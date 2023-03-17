/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexsandro.lsipelli
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

import java.util.Collections;
import java.util.List;

class Jogo {
 
  public static void main(String[] args) {
    double escolhadeinicio ;
      String nome; 
      int tecla;
     Scanner ler = new Scanner(System.in);
     String menu = "\n vc perdeu ";
     menu += " tente de novo ";

 
    do
   {
     System.out.println("Olá, bem vindo ao Mineirinho simulaitor versao 13 \n");
   
    
     System.out.println("Vocês estão em uma taverna, quando uma briga generalizada começa. Os guardas chegam e levam todos presos. Agora vocês precisam provar que são inocentes, ou passarão meses na cadeia " + "\n" );
  
     System.out.println(" Você deseja iniciar ? " + "\n");
     System.out.println("1- sim ");
     System.out.println("2- nao ");
     escolhadeinicio= ler.nextDouble();
     if (escolhadeinicio ==1 ){ System.out.println(" Iniciando sua jornanda da sabedoria " + "\n " );}
       
     else { System.out.println(" estamos aguardando sua sede por sabedoria " + "\n" ) 
       ;}
    }while (escolhadeinicio !=1 );
      
    System.out.println(" Como é o seu nome ? " + "\n");
    nome= ler.next();
    System.out.println(" muito bem Grande Mochileiro " + nome );
    
     int escolha;
     
     do
    {
         
     System.out.println("escolha sua classe \n 1-Guerreiro \n 2-Mago \n 3-Bruxa \n 4-Fada ");
      escolha = ler.nextInt();
      
      switch (escolha){
          case 1 :
      System.out.println(" A aventura dos numeros nos espera, mochileiro(a) " +" Guerreiro " + nome +"\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Guerreiro " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n" );
              System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n"+ 
 nome + "\n" 
+"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
              System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
              String operacaoStr;
        char operacao;
        boolean tacerto = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta É..., você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
"\n" +
"\n" +
"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto);
              
              
      break;
       case 2:
      System.out.println(" A aventura dos numeros nos espera, mochileiro(a)"+ " Mago " + nome + "\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Mago " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática." );
       System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n" +
nome +
"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
             System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
              String operacaoStr2;
        char operacao2;
        boolean tacerto2 = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta É..., você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
"\n" +
"\n" +
"Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto2);
      break;    
      case 3:
      System.out.println (" A aventura dos numeros nos espera, mochileiro(a) bruxa " + nome + "\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
"Este aventureiro se denominava O Mochileiro(a) Bruxa " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.");
       System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
"Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
"O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
"Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
"Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
"Eu não…\n" +
"… Incrível essas pessoas né? / falou uma voz do além\n" +
"O que é isso? / perguntou o andarilho \n" +
"hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
"Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
"\n" +
nome +
"… Como você sabe meu nome?\n" +
"Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
"Sim, acho que vou conseguir sim.\n" +
"Ok vamos para a pergunta…");
              System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
"\n" +
"… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
"hmmm, a resposta seria…\n" +
"1… / respondeu a mochila antes dele\n" +
"Quem está aí? perguntou a Ninfa\n" +
"Novamente explicando, esta é minha mochila encantada.\n" +
"Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
"Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
              String operacaoStr3;
        char operacao3;
        boolean tacerto3 = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                 System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                    System.out.println("Respota correta É..., você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
                "\n" +
                "\n" +
                "Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  \" ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto3);
          break;
      case 4 :
      System.out.println(" A aventura dos numeros nos espera, mochileiro(a) Fada " + nome+ "\n\n");
      System.out.println(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
      System.out.println("Em uma época onde havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
                "Este aventureiro se denominava O Mochileiro(a) Fada " + nome
                         + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.");
       System.out.println("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
              "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
              System.out.println("-Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
              System.out.println("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" + 
             "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n olhou e viu uma fila e não entendeu então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e também tinha um codinome, ele se auto intitulava O Andarilho.");
              System.out.println("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
             "Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
             "Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
             "Eu não…\n" +
             "… Incrível essas pessoas né? / falou uma voz do além\n" +
             "O que é isso? / perguntou o andarilho \n" +
             "hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
              System.out.println("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
             "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
             "\n" +
             nome +
             "… Como você sabe meu nome?\n" +
             "Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
             "Sim, acho que vou conseguir sim.\n" +
             "Ok vamos para a pergunta…");
             System.out.println("Antes da pergunta é bom entender esta matéria: Soma e Subtração, vamos aprender? Para começar a Soma é uma junção de doi ou mas números em uma conta e a Subtração é um número que tem que tirar do outro, fazendo assim um menos o outro.\n" +
             "\n" +
             "… Quanto que é duas unidades mais duas unidades que somado é Subtraido por três unidades ?\n" +
             "hmmm, a resposta seria…\n" +
             "1… / respondeu a mochila antes dele\n" +
             "Quem está aí? perguntou a Ninfa\n" +
             "Novamente explicando, esta é minha mochila encantada.\n" +
             "Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual é o resultado da Soma de doze unidades de magos com  três dezenas e logo após subtrair duas dezenas ?\n" +
             "Essa eu sei, se 12 e 30 da 42 e se Subtrairmos os 20 a resposta é : ");
        
        boolean tacerto4 = false; 
        
            do {
                
                System.out.println("A) Tao facil a respota correta é  30");
                System.out.println("B) Tinha uma mais dificil não a respota correta é  22 ");
                System.out.println("C) Moleza a respota correta é 10 ");
                System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                System.out.println("E)  Essa jornada será facil a respota correta é 20");
                System.out.println("Informe sua resposta: ");
                 
                operacaoStr = ler.next();
                operacao = operacaoStr .charAt(0);
                switch(operacao) {
                case 'a': case 'A':
                    System.out.println(" Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'b':case 'B':
                 System.out.println("Respota correta... É, você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" +
                 "\n" +
                 "\n" +
                "Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
                    break;
                case 'c':case 'C':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                case 'd':case 'D':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                    
                case 'e':case 'E':
                    System.out.println("Resposta incorreta e sua jornada acaba aqui  ");
                    break;
                }
            }while(tacerto4);
          break;
        }
      } while(escolha >4);
      String questao2= "Neste momento está saindo para outro ponto de sua jornada ate chegar aonde deseja, mas nesse meio tempo acaba encontrando com seu conhecido e futuro amigo, O Andarilho.\n" +
"Neste momento crucial ambos se juntam e formam uma dupla infalível para conseguir chegar até onde ambos querem. Mas no caso do Mochileiro, ele deseja emprego mas seu companheiro... já deseja algo diferente, algo mais ardente, nosso querido Andarilho quer aguardente e para onde ambos vão... eles encontram os dois.\n" +
"\n" +
"Dias de caminhada se passaram e eles chegaram à uma savana, onde acharam uma civilização chamada Spykinos. Uma cidade composta por pessoas diferentes, uma mistura de cachorro com humano. Seu líder se chamava Spyke, um soberano de mais de 150 anos de idade em uma bela forma.\n" +
"Suas características eram baseadas em um Shih-tzu. \n" +
"\n" +
"Nesta cidade era meio que um mercado negro, tudo que queria você encontrava. Caso precisasse de algo fora das normas delimitadas de cada civilização, lá era o lugar.\n" +
"\n" +
"Ao se aproximar da cidade olharam uma bela muralha onde se encontrava dois guardas, e então disseram:\n" +
"AUTO LA!!! Quem são voces ?\n" +
"Ola, somos andarilhos, estamos so de passagem por esta cidade.\n" +
"bom, para entrar aqui deverao responder esta pergunta… \n" +
"Vindo para cá avistou 20 casas a sua direita. se voltar por onde veio, quantas casas voce veria olhando para sua esquerda?";
      System.out.println(questao2);  
        boolean acertou = false;
        int cantil=0;
          List alternativas = new ArrayList();
          alternativas.add("30 casas"); 
          alternativas.add("50 casas");
          alternativas.add("nenhuma casa");
          alternativas.add("25 casas ");
          alternativas.add("20 casas"); // resposta correta
          do
       {
              Collections.shuffle(alternativas);
           System.out.println("Vindo para cá avistou 20 casas a sua direita. se voltar por onde veio, quantas casas voce veria olhando para sua esquerda? por ter esse cantil magico voce terá uma chance de errar apenas...");
           System.out.println("a) " + alternativas.get(0));
           System.out.println("b) " + alternativas.get(1));
           System.out.println("c) " + alternativas.get(2));
           System.out.println("d) " + alternativas.get(3));
           System.out.println("e) " + alternativas.get(4));
           System.out.print("Escolha uma alternativa: ");
           String resposta = ler.next();
          switch (resposta)
          {
           case "a":
           case "A": 
           if (alternativas.get(0).equals("101010")) {
            System.out.println("Resposta correta!");
            acertou = true;
           } else {
                  System.out.println("Resposta incorreta!");}
                  break;
                  
              case "b":          
              case "B":
         if (alternativas.get(1).equals("20 casas")) {
         System.out.println("Resposta correta!");
         acertou = true;
         } else {
         System.out.println("Resposta incorreta!"); }
         break;
         
         case "c":
         case "C":
         if (alternativas.get(2).equals("20 casas")) {
         System.out.println("Resposta correta!");
         acertou = true;
         } else {
         System.out.println("Resposta incorreta!");
         }
                  break;
         case "d":
         case "D":
         if (alternativas.get(3).equals("20 casas")) {
         System.out.println("Resposta correta!");
         acertou = true;
         } else {
         System.out.println("Resposta incorreta!");}
         break;
         
         case "e":
         case "E":
         if (alternativas.get(4).equals("20 casas")) {
         System.out.println("Resposta correta!");
         acertou = true;
         } else {         
         System.out.println("Resposta incorreta!");}

         break;
         default:
         System.out.println("Escolha inválida!");}
          cantil++;
     } while (!acertou && cantil<2);
          if (cantil==1){System.out.println(" voce perdeu vonte de onde voce veio e conte as casas com atençao agora, e muito obrigado pelo cantil maneiro ");}
          else{System.out.println(" Esta correto, parabens pode passar. Sorte sua possuir um cantil tão maneiro ");}
          String questao3="apos este enigma quando cge ao meio da cidade o Andarilho avistou uma taverna e quis entrar, mas o Mochileiro não quis e não entendeu o porquê do seu companheiro estar tão afobado para entrar, então ele perguntou mas algo inesperado aconteceu.\n" +
"- Ei Andarilho porque você está tão afobado assim para entrar nesta taverna?\n" +
"- Olha... te falo se responder uma pergunta, o que acha ?\n" +
"- Acho excelente, pode mandar.\n" +
"\n" +
"* Para esta pergunta, entenda: A multiplicação: este tipo de conta é feita quando um numero é feito repetidamente referente ao numero pedido, um exemplo é: o número é 3 mas o número pedido para ser repetido será o 5 então: 5 x 3= 15.\n" +
"\n" +
"- me fale a multiplicação de 9x9.";
                System.out.println(questao3);  
        boolean acertou3 = false;
        int cantil2=0;
          List alternativas2 = new ArrayList();
          alternativas2.add("50"); 
          alternativas2.add("9");
          alternativas2.add("27");
          alternativas2.add("81 "); //resposta correta
          alternativas2.add("121"); 
          do
       {
              Collections.shuffle(alternativas2);
           System.out.println("- me fale a multiplicação de 9x9.");
           System.out.println("a) " + alternativas2.get(0));
           System.out.println("b) " + alternativas2.get(1));
           System.out.println("c) " + alternativas2.get(2));
           System.out.println("d) " + alternativas2.get(3));
           System.out.println("e) " + alternativas2.get(4));
           System.out.print(" escola a alternativa ");
           String resposta = ler.next();
          switch (resposta)
          {
           case "a":
           case "A": 
           if (alternativas2.get(0).equals("81")) {
            System.out.println("Resposta correta!");
            acertou3 = true;
           } else {
                  System.out.println("Resposta incorreta!");}
                  break;
                  
              case "b":          
              case "B":
         if (alternativas2.get(1).equals("81")) {
         System.out.println("Resposta correta!");
         acertou3 = true;
         } else {
         System.out.println("Resposta incorreta!"); }
         break;
         
         case "c":
         case "C":
         if (alternativas2.get(2).equals("81")) {
         System.out.println("Resposta correta!");
         acertou3 = true;
         } else {
         System.out.println("Resposta incorreta!");
         }
                  break;
         case "d":
         case "D":
         if (alternativas2.get(3).equals("81")) {
         System.out.println("Resposta correta!");
         acertou3 = true;
         } else {
         System.out.println("Resposta incorreta!");}
         break;
         
         case "e":
         case "E":
         if (alternativas2.get(4).equals("81")) {
         System.out.println("Resposta correta!");
         acertou3 = true;
         } else {         
         System.out.println("Resposta incorreta!");}

         break;
         default:
         System.out.println("Escolha inválida!");}
          cantil++;
     } while (!acertou3 && cantil2<2);
          if (cantil==1){System.out.println(" infelismente nao vou poder falar,siga sua rota sem eu \n mas sem ele " +nome+ " nao conseguirar seguir, volte ao inicio");}
          else{System.out.println("Está correto, promessa é promessa. Estou tão afobado assim porque eu amo aguardente, acho que de um ano para cá acabei ficando dependente ou apenas sendo um degustador, por isso a vontade de tomar ou ir na taverna. ");}
          

   }
 
}
 




    

     
     
  
     
             
    
    
    
    
     
    
    
  

