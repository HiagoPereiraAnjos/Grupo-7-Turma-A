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
     * @author edney.psilva.HIAGO PEREIRA, MATHEUS MEDEIROS, DANILO CUETO, ALEXSANDRO SIPELLI
     */
    //CORRIGINDO ALGUNS ERROS DE LOGICA, TEXTO E CONDIÇÕES...
//testando em sala junto com o grupo
    public class JogoRPGturmaAgrupo7 { // subtorina menu, puxando outras subrotinas
      public static void menu()//subrotina menu apenas chamando as outras
      {
            Scanner scanner = new Scanner(System.in);// definindo o Scanner
             while (true )// while infinito apenas será fechado quando o jogador digitar 4
           {//inicio do while
                 System.out.println("Menu");// print de menu
                System.out.println("\n1 - Jogar\n2 - Créditos\n3 - Instruções\n4 - Sair");// print de menu
                String entrada = scanner.next();//  variavel de string para entrada assim retirando possiveis erros

              if ( entrada.equals("1") )        jogar();   // if e else if e else  sendo usado com o equals validando a resposta do usuario, com isso evitando possiveis quebra de codigo se a pessoa bater a cabeça no teclado        
              else if ( entrada.equals("2") )   créditos(); // ainda aqui, validando a resposta do usuario e chamando as outras subrotinas
              else if ( entrada.equals("3") )   instruções();
              else if ( entrada.equals("4") )       System.exit(0); // usando o System.exit se caso a pessoa digita a opçao de saida, assim saindo do loop do while
              else  { System.out.println(" Opção invalida escolha entre 1 e 4!!!"); //else funcionando como um default..
                      System.out.println();}
           } // fim do while 

      } // fim da sub

      // Subrotina jogar
        public static void jogar(){ // caso o usuario digite 1 seguirar para o sub jogar e o jogo inicia
             String escolhadeinicio ;//variavel de string para entrada assim retirando possiveis erros
          String nome; //variavel de string para entrada do nome 

         Scanner scanner = new Scanner(System.in);// definindo o Scanner
         String perdeu = "\n VOCÊ PERDEU ";//  variavel string para ser usada com facilidade no codigo
         perdeu += " TENTE DE NOVO!!! ";// somando textos em uma variavel string




         System.out.println("Olá, bem vindo ao Mochileiro \n"); // print com inicio de jogo e começando a historia 


         System.out.println("Vocês estão em uma taverna, quando uma briga generalizada começa. Os guardas chegam e levam todos presos. Agora vocês precisam provar que são inocentes, ou passarão meses na cadeia " + "\n" );

         System.out.println(" Você deseja iniciar ? " + "\n");
         System.out.println("1- sim ");
         System.out.println("2- nao ");
         escolhadeinicio= scanner.next();// lendo a escolha do usuario
         while(!(escolhadeinicio.equals("1")))// Enquanto a opção for diferente de 1 o jogo não inicia, sendo validado com string.
         {// Validando as questões.
         if ( escolhadeinicio.equals("1") )  { System.out.println(" Iniciando a jornanda da sabedoria. " + "\n " );} //caso  a entrada seja  1, iniciando o jogo...


         else if ( escolhadeinicio.equals("2")){ System.out.println(" Que pena estamos aguardando sua sede por sabedoria " + "\n" ); menu();} // caso seja 2 voltando para o menu 
         else  { System.out.println(" Opção invalida escolha entre 1 e 2!!!"); menu(); // caso opçao seja invalida voltando ao menu
                      System.out.println();}

         }// fim do while





        System.out.println("Qual é o seu nome forasteiro ? \n");
        nome= scanner.next(); // string de nome para ser usado no jogo todo.
        System.out.println("Muito bem Grande Mochileiro " + nome );// print adicionando o nome junto com a parte da historia 

         int escolha; //variavel inteira, para ser usado no switch
          String case1 ="A aventura dos numeros nos espera, Gurreiro(a) " +" Mochileiro(a) " + nome +"\n\n";// string do case 1 com partes da historia sendo iniciado 
                               case1 += "Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ";
                               case1 +=("Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
                                          "Este aventureiro se denominava O(a) Guerreiro(a) Mochileiro(a)  " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n" );
                               case1 +=("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
                                          "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                                case1 +=("Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                        + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                        + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                                case1 +=("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
                                          "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                        + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                        + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                                case1 +=("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                                          "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
                                          nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                                          "Andarilho - Eu não…\n" +
                                         "- … Incrível essas pessoas né? / falou uma voz do além\n" +
                                         "Andariho - O que é isso? / perguntou o andarilho \n" +
                                        nome + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                                 case1 +=("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
                                       "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
                                     "\n"+ 
                                     nome + "\n" 
                                     + nome + " - … Como você sabe meu nome?\n" +
                                     "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
                                    nome + " - Sim, acho que vou conseguir sim.\n" +
                                    "Ninfa - Ok vamos à pergunta…"); 
                                 
                                 String pergunta1=("\n Ninfa - … Qual a soma de um número com ele mesmo que subtraído por 3 é igual a 1?…\n "// pergunta case1
                          + " - 2… Respondeu a mochila antes dele." + 
                    "- Quem está aí? Perguntou a Ninfa\n" +
                    nome + " Novamente explicando, esta é minha mochila encantada.\n" +
                    "Ninfa - Bom, você acertou com ajuda, a próxima será sem ajuda então pense bem… qual número que somado com 30 e subtraído por 20 é igual a 22?\n" +//Primeira questão.
                    nome + "Essa eu sei, a resposta é... ");

                        String case2=(" A aventura dos numeros nos espera, Mago(a) " +" Mochileiro(a) " + nome +"\n\n"); //string do case 2 com partes da historia sendo iniciado
                         case2+=(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
                          case2+=("Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
                                    "Este aventureiro se denominava O(a) Mago(a) Mochileiro(a)  " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n" );
                                 case2+=("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
                                    "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                                  case2+=("Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                          + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                          + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                                 case2+=("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
                                    "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                          + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                          + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                                 case2+=("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                                    "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
                                     nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                                    "Andarilho - Eu não…\n" +
                                    "- … Incrível essas pessoas né? / falou uma voz do além\n" +
                                    "Andariho - O que é isso? / perguntou o andarilho \n" +
                                     nome + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                                 case2+=("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
                                    "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
                                    "\n"+ 
                                     nome + "\n" 
                                    + nome + " - … Como você sabe meu nome?\n" +
                                    "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
                                    nome + " - Sim, acho que vou conseguir sim.\n" +
                                    "Ninfa - Ok vamos à pergunta…");
                                 
                                 String case3=(" A aventura dos numeros nos espera, Bruxo(a) " +" Mochileiro(a) " + nome +"\n\n");
                            case3+=(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
                            case3+=("Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
                                      "Este aventureiro se denominava O(a) Bruxo(a) Mochileiro(a)  " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n" );
                                   case3+=("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
                                      "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                                   case3+=("Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                                            + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                                            + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                                    case3+=("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
                                      "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                                            + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                                            + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                                    case3+=("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                                      "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
                       nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                                      "Andarilho - Eu não…\n" +
                                      "- … Incrível essas pessoas né? / falou uma voz do além.\n" +
                                      " - O que é isso? /n Perguntou o andarilho. \n" +
                       nome + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                                    case3+=("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
                                      "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
                                      "\n"+ 
                                      nome + "\n" 
                                      + nome + " - … Como você sabe meu nome?\n" +
                                      "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
                                      nome + " - Sim, acho que vou conseguir sim.\n" +
                                      "Ninfa - Ok vamos à pergunta…"); 
                                    
                                    String case4=(" A aventura dos numeros nos espera, fada " +" Mochileiro(a) " + nome +"\n\n");
          case4+=(" Enumerando sua a aventura \n \n Ops... Iniciando sua aventura... \n ");
         case4+=("Em uma época em que havia apenas pedra e madeira, existia um bravo aventureiro disposto a salvar sua vida e a de seus companheiros de algo que os acusaram injustamente.\n" +
    "Este aventureiro se denominava O(a) fada Mochileiro(a)  " + nome + " - O por que deste nome? Simples, ele andava com uma mochila encantada por uma feiticeira para lhe ajudar nos desafios da vida e da Matemática.\n\n" );
                 case4+=("Nesta aventura para livrá-los da punição, O Mochileiro irá passar por testes para se livrar desta pena imposta a ele.\n" +
    "Para inocentar-se, este irá contar sua trajetória com todos os desafios que passou para chegar naquela vila e ser acusado injustamente.\n\n");
                  case4+=("Em um dia simples e chuvoso, nosso protagonista sai em uma aventura para achar emprego, "
                          + "já que na vila dele algo terrível aconteceu fazendo assim ele se aventurar neste mundo cheio de magia e perigo. "
                          + "E assim começou essa jornada,\n com apenas sonhos e uma bela mochila para o acompanhar e lhe auxiliar. ");
                  case4+=("Neste segundo dia o sol mostrou-se brilhante e reluzente para nosso aventureiro e isso não seria a única coisa de bom ou ruim que aconteceria com ele neste segundo dia de viagem. \n" +
    "O Mochileiro estava na estrada já a um bom tempo, sem comer ou descansar. Olhando colina abaixo avistou uma pequena vila onde vivia uma ninfa do lago que fazia a natureza crescer saudável e forte e, "
                          + "consequentemente, as comidas também.\n Chegando lá ele nem acreditou,\n viu uma fila e não entendeu o porque,"
                          + " então resolveu perguntar para um rapaz de porte baixo que estava em uma aventura e tinha um codinome, ele se autointitulava O Andarilho.");
                  case4+=("- Ei meu companheiro, poderia me dar uma informação desta fila?\n" +
                    "Andarilho - Ola forasteiro, está fila é para passar por essa vila “magica” e para isso temos que responder  duas perguntas.\n" +
                     nome + " - Entendi, mas porque fez aspas em “magica”, você não acredita?\n" +
                    "Andarilho - Eu não…\n" +
                    "- … Incrível essas pessoas né? / falou uma voz do além.\n" +
                    " - O que é isso? /n Perguntou o andarilho. \n" +
                     nome + " - hahaha, esta é minha mochila. Ela é enfeitiçada para me ajudar com esse tipo de ocasião.");
                  case4+=("Neste momento, uma amizade entre O Mochileiro e O Andarilho foi se formando e não iria se desfazer tão fácil assim. \n" +
                    "Chegando seu momento de fazer as perguntas, a ninfa o chama pelo nome e não seu apelido de jornada…\n" +
                    "\n"+ 
                     nome + "\n" 
                    + nome + " - … Como você sabe meu nome?\n" +
                    "Ninfa - Sou uma Ninfa, uma pessoa poderosa e você ainda acha que consegue resolver minhas perguntas? isso é uma piada.\n" +
                    nome + " - Sim, acho que vou conseguir sim.\n" +
                    "Ninfa - Ok vamos à pergunta…"); 
              
         do{
                                  
        

         System.out.println("Escolha sua classe \n 1-Guerreiro(a) \n 2-Mago(a) \n 3-Bruxo(a) \n 4-Fada ");
          escolha = scanner.nextInt();// lendo a escolha do usuario

          switch (escolha){// switch sendo usado com 4 casos e um default 
              case 1 : //declarando os cases 
                       System.out.println(case1);  // puxando a varivel String 
                       
                       System.out.println(pergunta1);// puxando a varivel String 
                              
            
                  String respostapergunta1; // variavel de resposta  para validar  

            char operacao;// variavel char assim seguindo nos 4 cases
            boolean tacerto = false; //boolean para validar a resposta certa assim seguindo nos 4 cases


                    //Alternativas da primeira questão.
                    System.out.println("A) Tão fácil a respota correta é  30");
                    System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 "); //Resposta correta.
                    System.out.println("C) Moleza a respota correta é 10 ");
                    System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                    System.out.println("E) Essa jornada será facil a respota correta é 20");
                    System.out.println("Informe sua resposta: ");


                    respostapergunta1 = scanner.next();// lendo a variavel assim seguindo nos 4 cases

                    operacao = respostapergunta1 .charAt(0);// usando o char para reconhcer a primeira letra assim seguindo nos 4 cases
                    switch(operacao) {//switch sendo usado para os casos de respostas do usuario assim seguindo nos 4 cases
                    case 'a': case 'A': //validando apenas o char por isso do ('..') apenas na primera pergunta
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();    // caso respota errada de inicio perdeu voltando ao menu assim seguindo nos 4 cases
                        break;// break sendo utilizado para nao seguir lendo assim em todos casos usado com o break
                    case 'b':case 'B':
                        System.out.println("... 12.\n Ninfa - Você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
                        tacerto = true;
                        break;
                        
                    case 'c':case 'C':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui " + perdeu); menu() ;                
                        break;
                    case 'd':case 'D':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu); menu();    
                        break;
                    case 'e':case 'E':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu); menu();   
                        break;
                        default : System.out.println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu); menu(); 
                    }
               

                 if (tacerto)// validando se estiver certo seguindo a historia usando a boolean em todos cases
              {
                  System.out.println("Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
              }



          break; 
           case 2:
           
                         System.out.println(case2);  // puxando a varivel String 
                       
                       System.out.println(pergunta1);// puxando a varivel String 

                 
                  String respostapergunta2;
            char operacao2;
            boolean tacerto2 = false; 
                    System.out.println("A) Tão fácil a respota correta é  30");
                    System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");// Resposta correta.
                    System.out.println("C) Molezinha a respota correta é 10 ");
                    System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                    System.out.println("E)  Essa jornada será facil a respota correta é 20");
                     System.out.println("Informe sua resposta: ");

                   respostapergunta2 =scanner.next();
                    operacao2 = respostapergunta2 .charAt(0);
                    switch(operacao2)
                    {
                    case 'a': case 'A':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu); menu() ;   
                        break;
                    case 'b':case 'B':
                        System.out.println("... 12.\n Ninfa -  Você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n" );
                       tacerto2 = true;
                        break;
                    case 'c':case 'C':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu); menu() ;
                        break;
                    case 'd':case 'D':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu); menu() ;
                        break;
                    case 'e':case 'E':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu); menu() ;
                        break;
                        default : System.out.println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu); menu() ;
                    }
                
               if (tacerto2)
              {
                  System.out.println("Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
              }
          break;    
          case 3:
              System.out.println(case3);  // puxando a varivel String 
                       
                       System.out.println(pergunta1);// puxando a varivel String 
          
                  String respostapergunta3;
            char operacao3;
            boolean tacerto3 = false; 
                    System.out.println("A) Tão fácil a respota correta é  30");
                    System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
                    System.out.println("C) Moleza a respota correta é 10 ");
                    System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                    System.out.println("E)  Essa jornada será facil a respota correta é 20");
                     System.out.println("Informe sua resposta: ");

                    respostapergunta3 = scanner.next();
                    operacao = respostapergunta3 .charAt(0);
                    switch(operacao) {
                    case 'a': case 'A':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();    
                        break;
                    case 'b':case 'B':
                        System.out.println("... 12.\n Ninfa -  você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
                       tacerto3 = true;
                        break;
                    case 'c':case 'C':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();   
                        break;
                    case 'd':case 'D':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();   
                        break;
                    case 'e':case 'E':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();   
                        break;

                        default : System.out.println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);menu();
                    }
                
                 if (tacerto3)
              {
                  System.out.println("Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
              }
              break;
          case 4 :
                         System.out.println(case4);  // puxando a varivel String 
                       
                       System.out.println(pergunta1);// puxando a varivel String 
                        System.out.println("A) Tão fácil a respota correta é  30");
                    System.out.println("B) Tinha uma mais dificil não ? A respota correta é 12 ");
                    System.out.println("C) Moleza a respota correta é 10 ");
                    System.out.println("D) Nao preciso da mochila mesmo não a resposta correta é 84 ");
                    System.out.println("E)  Essa jornada será facil a respota correta é 20");
                     System.out.println("Informe sua resposta: ");

            boolean tacerto4 = false; 
                      
                   respostapergunta3 = scanner.next();
                    operacao = respostapergunta3 .charAt(0);
                    
                    switch(operacao)
                   {
                    case 'a': case 'A':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();
                        break;
                    case 'b':case 'B':
                        System.out.println("... 12.\n Ninfa -  você é bem esperto e por isso lhe darei um cantil com um pouco da água mágica que tenho em meu lar. Ela lhe ajudará a passar por calores extremos e até venenos.\n Boa sorte em sua jornada, você irá precisar.\n");
                        tacerto4=true;
                        break;
                    case 'c':case 'C':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();   
                        break;
                    case 'd':case 'D':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu(); 
                        break;

                    case 'e':case 'E':
                        System.out.println("Resposta incorreta e sua jornada acaba aqui  " + perdeu);menu();    
                        break;

                    default : System.out.println("Opçao invalida escolha entre as alternativas A,B,C,D ou E " + perdeu);menu();
                   }
                
                 if (tacerto4)
              {
                  System.out.println("Avançando na sua jornada, nosso mochileiro conseguiu um item mágico que poderá ajudá-lo mais pra frente nesta história. ");
              }
                 
              break;
              
          default: System.out.println("Opçao invalida  escolha entre 1 e 4 !!!");

            }
        } while(escolha>4);
         
         

          String questao2= "Neste momento está saindo para outro ponto de sua jornada ate chegar aonde deseja, mas nesse meio tempo acaba encontrando com seu conhecido e futuro amigo, O Andarilho.\n" +
            "Neste momento crucial ambos se juntam e formam uma dupla infalível para conseguir chegar até onde ambos querem. Mas no caso do Mochileiro, ele deseja emprego mas seu companheiro... já deseja algo diferente, algo mais ardente, nosso querido Andarilho quer aguardente e para onde ambos vão... eles encontram os dois.\n" +
            "\n" +
            "Dias de caminhada se passaram e eles chegaram à uma savana, onde acharam uma civilização chamada Spykinos. Uma cidade composta por pessoas diferentes, uma mistura de cachorro com humano. Seu líder se chamava Spyke, um soberano de mais de 150 anos de idade em uma bela forma.\n" +
            "Suas características eram baseadas em um Shih-tzu. \n" +
            "\n" +
            "Nesta cidade era meio que um mercado negro, tudo que queria você encontrava. Caso precisasse de algo fora das normas delimitadas de cada civilização, lá era o lugar.\n" +
            "\n" +
            "Ao se aproximar da cidade olharam uma bela muralha onde se encontrava dois guardas, e então disseram:\n" +
            "Guarda - AUTO LA!!! Quem são voces ?\n" +
            nome + " - Ola, somos andarilhos, estamos so de passagem por esta cidade.\n" +
            "Guarda - bom, para entrar aqui deverao responder a uma pergunta… \n\n" +
            " Determine esse numero;\n\n"+"Por ter este cantil mágico, voce terá uma chance de errar apenas.../";



          System.out.println(questao2);  //questao 2 
            boolean acertou = false; //boolean para validar resposta certa SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
            int cantil1=1;// variavel para limitar o numero de erros SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
              List alternativas1 = new ArrayList();// Listando as questões.SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
              alternativas1.add("O número é 110"); // Resposta correta da questão 2.SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
              alternativas1.add("O número é 120");
              alternativas1.add("O número é 210");
              alternativas1.add("O número é 220");
              alternativas1.add("Nenhuma das alternativas"); 
              do
           {
               if (cantil1>=0){ System.out.println("- O triplo de um número adicionado com 45 corresponde a seu dobro adicionado a 155. Determine esse numero;\n"); } //if sendo usado para repetir o inunciado apenas na segunda tentativa
                  Collections.shuffle(alternativas1);// Embaralhando as alternativas.SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
               System.out.println("a) " + alternativas1.get(0));//"Get(0)" adiciona a primeira linha da lista do Arraylist ao embaralhamento.SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
               System.out.println("b) " + alternativas1.get(1));//"Get(1)" adiciona a segunda linha da lista Arraylist e assim por diant. SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
               System.out.println("c) " + alternativas1.get(2));
               System.out.println("d) " + alternativas1.get(3));
               System.out.println("e) " + alternativas1.get(4)); 
               System.out.print("Escolha uma alternativa: ");
               
               String resposta2 = scanner.next(); //lendo respota do usuario SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
              switch (resposta2) //switch com cases de altenativas SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
              {
               case "a":// usando o ("..") no case ao inves o chart ('..') SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
               case "A": 
               if (alternativas1.get(0).equals("O número é 110")) { // validando a reposta, como esta no random o if esta validando se a resposta escolhida e de acordo com a resposta certa e mudando a boolean para true SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
                System.out.println("Resposta correta!\n");
                acertou = true;
               } else {//else se caso a reposta estiver incorreta apos o if SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
                      System.out.println("Resposta incorreta!\n Restam "+cantil1+" tentativas \n    ");}// se errado o usuario perder uma chance e assim é apresentado  a quantidade de tentativas restantes SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
                      break;

                  case "b":          
                  case "B":
             if (alternativas1.get(1).equals("O número é 110")) {
             System.out.println("Resposta correta!\n");
             acertou = true;
             } else {
            System.out.println("Resposta incorreta!\n Restam "+cantil1+" tentativas\n"); }
             break;

             case "c":
             case "C":
             if (alternativas1.get(2).equals("O número é 110")) {
             System.out.println("Resposta incorreta!\n Restam "+cantil1+" tentativas\n");
             acertou = true;
             } else {
             System.out.println("Resposta incorreta!\n Restam "+cantil1+" tentativas\n");
             }
                      break;
             case "d":
             case "D":
             if (alternativas1.get(3).equals("O número é 110")) {
             System.out.println("Resposta correta!\n");
             acertou = true;
             } else {
             System.out.println("Resposta incorreta!\n Restam "+cantil1+" tentativas\n");}
             break;

             case "e":
             case "E":
             if (alternativas1.get(4).equals("O número é 110")) {
             System.out.println("Resposta correta!\n");
             acertou = true;
             } else {         
             System.out.println("Resposta incorreta!\n Restam "+cantil1+" tentativas\n");}

             break;
             default:
             System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil1+ "\n tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n "); //default, se caso a pessoa bater a cabeça no teclado, mas apenas poderá fazer isso uma vez porque vai perder chance SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI 
              }
             cantil1--;  //deixando o numero de tentativas após o switch se nao so vai contar acrescentar 1 quando estiver no case que a pessoa colocou. SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI
         } while (!acertou && cantil1==0);//while apenas se encerrando com essa condiçoes ou acertou ou perdeu todas tentativas SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI

              if (acertou)//  if validando se acertou com a boolean SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI
              {
                  System.out.println("Guarda -  Esta correto, parabens pode passar. Sorte sua possuir um cantil tão maneiro ");
              }
              else //else validando se errou SENDO UTILIZADO EM TODAS PERGUNTAS APARTIR DAQUI
              {
                  System.out.println(" Guarda - Voce perdeu volte de onde voce veio, muito obrigado pelo cantil maneiro " + perdeu); menu();
              }
              String questao3="Apos este enigma, os mesmo vão ao meio da cidade, o Andarilho avistou uma taverna e quis entrar, mas o Mochileiro não quis e não entendeu o porquê do seu companheiro estar tão afobado para entrar, então ele perguntou mas algo inesperado aconteceu.\n" +
                nome + "- Ei Andarilho porque você está tão afobado assim para entrar nesta taverna?\n" +
                "Andarilho - Olha... te falo se responder uma pergunta, o que acha ?\n" +
                nome + "- Acho excelente, pode mandar.\n" +
                "\n" +

                "\n" +
                "Andarilho - O quintuplo de um número adicionado com 65 corresponde a seu triplo adicionado 195. Module a questão."; // Questão 3.

              System.out.println(questao3);  
            boolean acertou7= false;
            int cantil7=1;
              List alternativas2 = new ArrayList(); // Listando as alternativas.
              alternativas2.add("5X+65=3X+195"); //Resposta correta
              alternativas2.add("5X+3X-65=195");
              alternativas2.add("5X-3X=195+65");
              alternativas2.add("5X+3X+65+195=0"); 
              alternativas2.add("Nenhumas das alternativas"); 
              do
           {
                  Collections.shuffle(alternativas2);// Embaralhando as alternativas.
              if (cantil7==0){ System.out.println("Andarilho - O quintuplo de um número adicionado com 65 corresponde a seu triplo adicionado 195. Module a questão.\n"); }
               System.out.println("a) " + alternativas2.get(0));
               System.out.println("b) " + alternativas2.get(1));
               System.out.println("c) " + alternativas2.get(2));
               System.out.println("d) " + alternativas2.get(3));
               System.out.println("e) " + alternativas2.get(4));
               System.out.print(" escolha a alternativa ");
               String resposta = scanner.next();
              switch (resposta)
              {
               case "a":
               case "A": 
               if (alternativas2.get(0).equals("5X+65=3X+195")) {
                System.out.println("Resposta correta!\n");
                acertou7 = true;
               } else {
                       System.out.println("Resposta incorreta!\n Restam "+cantil7+" tentativas\n");}
                      break;

                  case "b":          
                  case "B":
             if (alternativas2.get(1).equals("5X+65=3X+195")) {
             System.out.println("Resposta correta!\n");
             acertou7 = true;
             } else {
              System.out.println("Resposta incorreta!\n Restam "+cantil7+" tentativas\n");}
             break;

             case "c":
             case "C":
             if (alternativas2.get(2).equals("5X+65=3X+195")) {
             System.out.println("Resposta correta!\n");
             acertou7 = true;
             } else {
              System.out.println("Resposta incorreta!\n Restam "+cantil7+" tentativas\n");}             
                 break;
             case "d":
             case "D":
             if (alternativas2.get(3).equals("5X+65=3X+195")) {
             System.out.println("Resposta correta!\n");
             acertou7 = true;
             } else {
              System.out.println("Resposta incorreta!\n Restam "+cantil7+" tentativas\n");}
             break;

             case "e":
             case "E":
             if (alternativas2.get(4).equals("5X+65=3X+195")) {
             System.out.println("Resposta correta!\n");
             acertou7 = true;
             } else {         
             System.out.println("Resposta incorreta!\n Restam "+cantil7+" tentativas\n");}

             break;
             default:
              System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil7+ " tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n "); 
              
            }
              cantil7--;
         } while (!acertou7 && cantil7==0);
               if (acertou7) // acertou7 validando se a resposta foi correta se nao foi vai mandar para o inicio. Sem esse if ele erra a questao e continua...
              {
                  System.out.println("Andarilho - Está correto \n");
              }
              else
              {
                  System.out.println(" Andarilho - Infelismente nao vou poder falar,siga sua rota sem eu \n Mas sem ele " +nome+ " não conseguirá seguir," + perdeu);menu();
              }


              String resolvaquestao3 = "Andarilho - Agora resolva o resultado da questão anterior: 5X+65=3X+195."; //Continuação da questão 3.

                 System.out.println (resolvaquestao3);         
            boolean acertou2= false;
            int cantil2=1;
              List alternativas3 = new ArrayList();// Listando as alternatias.
              alternativas3.add("O número é 50"); 
              alternativas3.add("O número é 9");
              alternativas3.add("O número é 27");
              alternativas3.add("O número é 65"); //resposta correta
              alternativas3.add("Nenhumas das alternativas"); 
              do
           {
                  Collections.shuffle(alternativas3);// EMbaralhando as alternativas
              if (cantil2==0){ System.out.println("Andarilho - Resolva o resultado da questão anterior: 5X+65=3X195."); }
               System.out.println("a) " + alternativas3.get(0));
               System.out.println("b) " + alternativas3.get(1));
               System.out.println("c) " + alternativas3.get(2));
               System.out.println("d) " + alternativas3.get(3));
               System.out.println("e) " + alternativas3.get(4));
               System.out.print(" escolha a alternativa ");
               String resposta = scanner.next();
              switch (resposta)
              {
               case "a":
               case "A": 
               if (alternativas3.get(0).equals("O número é 65")) {
                System.out.println("Resposta correta!\n");
                acertou2 = true;
               } else {
                      System.out.println("Resposta incorreta!\n Restam "+cantil2+" tentativas\n");}
                      break;

                  case "b":          
                  case "B":
             if (alternativas3.get(1).equals("O número é 65")) {
             System.out.println("Resposta correta!\n");
             acertou2 = true;
             } else {
             System.out.println("Resposta incorreta!\n Restam "+cantil2+" tentativas\n");}
             break;

             case "c":
             case "C":
             if (alternativas3.get(2).equals("O número é 65")) {
             System.out.println("Resposta correta!\n");
             acertou2 = true;
             } else {
             System.out.println("Resposta incorreta!\n Restam "+cantil2+" tentativas\n");}
              break;
             case "d":
             case "D":
             if (alternativas3.get(3).equals("O número é 65")) {
             System.out.println("Resposta correta!\n");
             acertou2 = true;
             } else {
            System.out.println("Resposta incorreta!\n Restam "+cantil2+" tentativas\n");}
             break;

             case "e":
             case "E":
             if (alternativas3.get(4).equals("O número é 65")) {
             System.out.println("Resposta correta!\n");
             acertou2 = true;
             } else {         
             System.out.println("Resposta incorreta!\n Restam "+cantil2+" tentativas\n");}

             break;
             default:
             System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil2+ "\n tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n ");
            }
              cantil2--;//deixando o numero de tentativas após o switch se nao so vai contar acrescentar 1 quando estiver no case que a pessoa colocou.
         } while (!acertou2 && cantil2==0);
              if (acertou2)
              {
                  System.out.println("Andarilho - Está correto, promessa é promessa. Estou tão afobado assim porque eu amo agua-ardente, "
                          + "acho que de um ano para cá acabei ficando dependente ou apenas sendo um degustador, por isso a vontade de tomar ou ir à taverna. \n\n ");
              }
              else
              {
                  System.out.println(" Andarilho - Infelismente nao vou poder falar,siga sua rota sem eu \n Mas sem ele " +nome+ " não conseguirá seguir," + perdeu);menu();
              }

            System.out.println(" Sabendo disso foi decidido que iriam acabar essa jornada em uma taverna com uma agua-ardente e um trabalho.\n"
                                  + "O Mochileiro e O Andarilho iam adentrando a cidade de pouco em pouco, mas quando menos esperava algo inusitado aconteceu."
                                  + "Uma execução de um ladrão seria feita naquele mesmo dia. \n"
                                  + "Ambos não sabiam o que estava acontecendo, mas decidiram aproximar-se do local e entender o que havia ali naquele espaço.\n"
                                  + "Este ladrão era a THE key, uma chaveira que costumava trabalhar para o rei, ela sempre abria seu cofre. "
                                  + "Ele era esquecido e nunca lembrava onde colocava a chave do cofre, então pedia para ela abrir todas as vezes.\n" +
                "Um certo dia algo de seu cofre sumiu, então o rei suspeitou que era ela, a pessoa que mais tinha acesso além de si."
                                  + "Quando viram e entenderam o que aconteceu, os viajantes foram até o rei para investigar e descobriram algo inusitado, algo que nem o próprio rei havia visto. \n" +
                "Em seu cofre existia um esquilo ladrão, que pegava suas coisas e as escondia em um buraco na parede onde era a sua casa. "
                                  + "O rei entendeu, mas o esquilo odiando a raça dos Spykinos percebeu algo diferente:\n\n");

                      String questao4 = "Esquilo - Ei, rei…\n" +
                        "Rei - Fala ratinho!\n" +
                        "Esquilo - Olha só, eu lhe devolvo seu pertence e você libera a menina por algo que ela não fez ok?\n" +
                        "Rei - Tá, mas o que eu tenho que fazer?\n" +
                        "Esquilo - Simples seu pulguento, responda essa perguntinha… "
                              + "6 unidades somadas ao dobro de um número é igual a 82. Module a questão.";// Questão 4.
            System.out.println(questao4);
            boolean acertou3 = false;  
            int cantil3 = 1;

            List alternativas4 = new ArrayList(); // Listando as alternativas.
            alternativas4.add("6+82=2N");
            alternativas4.add("82+6N=2");
            alternativas4.add("6-2N=82");
            alternativas4.add("6+2N=82");// Resposta correta
            alternativas4.add("Nenhuma das alternativas");

            do {
                Collections.shuffle(alternativas4);// Embaralhando as alternativas.
                 if (cantil3==0){ System.out.println("- 6 unidades somadas ao dobro de um número é igual a 82. Module a questão."); }
                  Collections.shuffle(alternativas4);
               System.out.println("a) " + alternativas4.get(0));
               System.out.println("b) " + alternativas4.get(1));
               System.out.println("c) " + alternativas4.get(2));
               System.out.println("d) " + alternativas4.get(3));
               System.out.println("e) " + alternativas4.get(4));
               System.out.print("Escolha uma alternativa: ");
               String resposta2 = scanner.next();
            switch(resposta2){
                case "a":
                case "A":
                if (alternativas4.get(0).equals("6+2N=82")) {
                    System.out.println("Resposta correta!\n");
                    acertou3 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil3+" tentativas\n");}
                    break;

                case "b":
                case "B":
                if (alternativas4.get(1).equals("6+2N=82")) {
                    System.out.println("Resposta correta!\n");
                    acertou3 = true;
                } else {
                     System.out.println("Resposta incorreta!\n Restam "+cantil3+" tentativas\n");}
                    break;

                case "c":
                case "C":
                if (alternativas4.get(2).equals("6+2N=82")) {
                    System.out.println("Resposta correta!\n");
                    acertou3 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil3+" tentativas\n");}
                    break;

                case "d":
                case "D":
                if (alternativas4.get(3).equals("6+2N=82")) {
                    System.out.println("Resposta correta!\n");
                    acertou3 = true;
                } else {
                     System.out.println("Resposta incorreta!\n Restam "+cantil3+" tentativas\n");}
                    break;

                case "e":
                case "E":
                if (alternativas4.get(4).equals("6+2N=82")) {
                    System.out.println("Resposta correta!\n");
                    acertou3 = true;
                } else {
                     System.out.println("Resposta incorreta!\n Restam "+cantil3+" tentativas\n");}
                    break;
               default:
             System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil3+ "\n tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n ");

            }
                cantil3--; //deixando o numero de tentativas após o switch se nao so vai contar acrescentar 1 quando estiver no case que a pessoa colocou.
            }while(!acertou3&&cantil3==0);
            if (acertou3)
              {
                  System.out.println(" Esquilo - Não acabou aqui... \n");
              }
              else
              {
                  System.out.println("Não vou devolver suas coisas...  Sem os  pertences do rei "+nome+ "não poderá seguir \n "+ perdeu);menu();
              }

                String questao5 = ("Esquilo -  agora resolva a questão. Qual o valor de N na expressão: 6+2N=82.");// Dando ontinuidade a questão.

                 System.out.println(questao5);
            boolean acertou4 = false;  
            int cantil4 = 1;

            List alternativas5 = new ArrayList();// Listando as alternativas.
            alternativas5.add("-38");
            alternativas5.add("44");
            alternativas5.add("38");// Resposta correta
            alternativas5.add("-44");
            alternativas5.add("Nenhuma das alternativas");

            do {
                Collections.shuffle(alternativas5); //embaralhando as alternativas.
                 if (cantil4==0){ System.out.println("Esquilo - Não acabou aqui, agora resolva a questão. Qual o valor de N na expressão: 6+2N=82."); }
                  Collections.shuffle(alternativas5);// Embaralhando as alternativas.
               System.out.println("a) " + alternativas5.get(0));
               System.out.println("b) " + alternativas5.get(1));
               System.out.println("c) " + alternativas5.get(2));
               System.out.println("d) " + alternativas5.get(3));
               System.out.println("e) " + alternativas5.get(4));
               System.out.print("Escolha uma alternativa: ");
               String resposta3 = scanner.next();
            switch(resposta3){
                case "a":
                case "A":
                if (alternativas5.get(0).equals("38")) {
                    System.out.println("Resposta correta!\n");
                    acertou4 = true;
                } else {
                System.out.println("Resposta incorreta!\n Restam "+cantil4+" tentativas\n");}
                    break;

                case "b":
                case "B":
                if (alternativas5.get(1).equals("38")) {
                    System.out.println("Resposta correta!\n");
                    acertou4 = true;
                } else {
                   System.out.println("Resposta incorreta!\n Restam "+cantil4+" tentativas\n");}
                    break;

                case "c":
                case "C":
                if (alternativas5.get(2).equals("38")) {
                    System.out.println("Resposta correta!\n");
                    acertou4 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil4+" tentativas\n");}
                    break;

                case "d":
                case "D":
                if (alternativas5.get(3).equals("38")) {
                    System.out.println("Resposta correta!\n");
                    acertou4 = true;
                } else {
                   System.out.println("Resposta incorreta!\n Restam "+cantil4+" tentativas\n");}
                    break;

                case "e":
                case "E":
                if (alternativas5.get(4).equals("38")) {
                    System.out.println("Resposta correta!\n");
                    acertou4 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil4+" tentativas\n");}
                    break;
               default:
             System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil4+ "\n tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n ");

            }
                cantil4--; //deixando o numero de tentativas após o switch se nao so vai contar acrescentar 1 quando estiver no case que a pessoa colocou.
            }while(!acertou4&&cantil4==0);
            if (acertou4)
              {
                  System.out.println(" Esquilo - Excelente, mas nao acaba aqui \n");
              }
              else
              {
                  System.out.println("Não vou devolver suas coisas...  Sem os  pertences do rei "+nome+ "não poderá seguir \n "+ perdeu);menu();
              }


            String questao6 = ("Esquilo - Vou dificultar um pouco mais. O quadrado de um número menos o seu triplo é igual a 40. Qual das alternativas abaixo representa aquestão ? ");

            System.out.println(questao6);
            boolean acertou5 = false;  
            int cantil5 = 1;

            List alternativas6 = new ArrayList(); // Listando as alternativas.
            alternativas6.add("4X-3=40");
            alternativas6.add("X²-3x=40");// Resposta correta
            alternativas6.add("4X-3X=40");
            alternativas6.add("X²-3=40");
            alternativas6.add("Nenhuma das alternativas");

            do {
                Collections.shuffle(alternativas6); // Embaralhando as alternativas.
                 if (cantil5==0){ System.out.println("Esquilo - Vou dificultar um pouco mais. O quadrado de um número menos o seu triplo é igual a 40. Qual das alternativas abaixo representa aquestão ? "); }
                  Collections.shuffle(alternativas6);
               System.out.println("a) " + alternativas6.get(0));
               System.out.println("b) " + alternativas6.get(1));
               System.out.println("c) " + alternativas6.get(2));
               System.out.println("d) " + alternativas6.get(3));
               System.out.println("e) " + alternativas6.get(4));
               System.out.print("Escolha uma alternativa: ");
               String resposta4 = scanner.next();
            switch(resposta4){
                case "a":
                case "A":
                if (alternativas6.get(0).equals("X²-3x=40")) {
                    System.out.println("Resposta correta!\n");
                    acertou5 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil5+" tentativas\n");}
                    break;

                case "b":
                case "B":
                if (alternativas6.get(1).equals("X²-3x=40")) {
                    System.out.println("Resposta correta!\n");
                    acertou5 = true;
                } else {
                   System.out.println("Resposta incorreta!\n Restam "+cantil5+" tentativas\n");}
                    break;

                case "c":
                case "C":
                if (alternativas6.get(2).equals("X²-3x=40")) {
                    System.out.println("Resposta correta!\n");
                    acertou5 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil5+" tentativas\n");}
                    break;

                case "d":
                case "D":
                if (alternativas6.get(3).equals("X²-3x=40")) {
                    System.out.println("Resposta correta!\n");
                    acertou5 = true;
                } else {
                   System.out.println("Resposta incorreta!\n Restam "+cantil5+" tentativas\n");}
                    break;

                case "e":
                case "E":
                if (alternativas6.get(4).equals("X²-3x=40")) {
                    System.out.println("Resposta correta!\n");
                    acertou5 = true;
                } else {
                   System.out.println("Resposta incorreta!\n Restam "+cantil5+" tentativas\n");}
                    break;
               default:
             System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil5+ " \n tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n ");

            }
                cantil5--;  //deixando o numero de tentativas após o switch se nao so vai contar acrescentar 1 quando estiver no case que a pessoa colocou.
            }while(!acertou5&&cantil5==0);
            if (acertou5)
              {
                  System.out.println(" Esquilo - Otimo agora vai mais uma... \n");
              }
              else
              {
                  System.out.println("Não vou devolver suas coisas...  Sem os  pertences do rei "+nome+ "não poderá seguir \n "+ perdeu);menu();
              }

            String questao7 = ("Esquilo - E para encerrar resolva o resultado da questão anterior: X²-3X=40 ");

            System.out.println(questao7);
            boolean acertou6 = false;  
            int cantil6 = 1;

            List alternativas7 = new ArrayList(); // Listando as alternativas.
            alternativas7.add("5 e 8");
            alternativas7.add("-8 e 5");
            alternativas7.add("-8 e -5");
            alternativas7.add("Nenhuma das alternativas");
            alternativas7.add("-5 e 8");// Resposta correta

            do {
                Collections.shuffle(alternativas7);
                 if (cantil6==0){ System.out.println("Esquilo - E para encerrar resolva o resultado da questão anterior: X²-3X=40 "); }
                  Collections.shuffle(alternativas7);// Embaralhando as alternativas,
               System.out.println("a) " + alternativas7.get(0));
               System.out.println("b) " + alternativas7.get(1));
               System.out.println("c) " + alternativas7.get(2));
               System.out.println("d) " + alternativas7.get(3));
               System.out.println("e) " + alternativas7.get(4));
               System.out.print("Escolha uma alternativa: ");
               String resposta5 = scanner.next();
            switch(resposta5){
                case "a":
                case "A":
                if (alternativas7.get(0).equals("-5 e 8")) {
                    System.out.println("Resposta correta!\n");
                    acertou6 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil6+" tentativas\n");}
                    break;

                case "b":
                case "B":
                if (alternativas7.get(1).equals("-5 e 8")) {
                    System.out.println("Resposta correta!\n");
                    acertou6 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil6+" tentativas\n");}
                    break;

                case "c":
                case "C":
                if (alternativas7.get(2).equals("-5 e 8")) {
                    System.out.println("Resposta correta!\n");
                    acertou6 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil6+" tentativas\n");}
                    break;

                case "d":
                case "D":
                if (alternativas7.get(3).equals("-5 e 8")) {
                    System.out.println("Resposta correta!\n");
                    acertou6 = true;
                } else {
                   System.out.println("Resposta incorreta!\n Restam "+cantil6+" tentativas\n");}
                    break;

                case "e":
                case "E":
                if (alternativas7.get(4).equals("-5 e 8")) {
                    System.out.println("Resposta correta!\n");
                    acertou6 = true;
                } else {
                    System.out.println("Resposta incorreta!\n Restam "+cantil6+" tentativas\n");}
                    break;
                default:
             System.out.println("RESPOSTA INVALIDA, NÃO ACEITAMOS GRACINHAS POR ISSO JA PERDEU UMA TENTATIVA"+cantil6+ "\n tentativa escolha apenas entre as alternativas A,B,C,D ou E !!!! \n ");

            }
                 cantil6--;//deixando o numero de tentativas após o switch se nao so vai contar acrescentar 1 quando estiver no case que a pessoa colocou.
            }while(!acertou6&&cantil6==0);


             if (acertou6)
              {
                  System.out.println("Esquilo - Certo, pegue o seu pertence e libere a agarota!");
              }
              else
              {
                  System.out.println("Não vou devolver suas coisas...  Sem os  pertences do rei "+nome+ "não poderá seguir \n "+ perdeu);menu();
              }

            System.out.println( " Neste momento os heróis desta história se assustaram com tudo e vibraram quando à soltaram. Explicaram para ela o ocorrido e comemoraram juntos e seguiram o rumo de sua aventura. \n" +
                "Mas quando menos esperavam a menina veio correndo até eles e pediu para que pudesse ir com eles já que o rei não confiava mais nela, então assim foi feita mais uma aliança.\n" +
                "Tempos se passaram e os heróis estavam chegando ao seu destino onde havia trabalho e muitas tavernas.\n" +
                "\n" +
                "Chegando lá a The Key ficou estranha, falou que estava suando frio e outras coisas suspeitas, os dois não entenderam e então continuaram.\n" +
                "Antes de achar um emprego foram à taverna e encontraram um rapaz, o dono da taverna, conhecido como Francisco. Por mais estranho que estava, \n "+
                "Francisco disse que algo aconteceu no reino e por isso tinham muitos soldados disfarçados. Dito isso ele entendeu e percebeu que a The Key estava mentindo e o ratinho trabalhava com ela. \n" +
                "\n" +
                "Assim depois de dois copos de água-ardente que nossos aventureiros estavam tomando para terminar sua jornada, o rei dos Spykinos apareceu e lhes prenderam…\n" +
                "\n" +
                "A partir daí veio essa história sobre os fatos ocorridos, mas e você? Você os acha culpados ou inocentes?.... ") ; créditos();


       }


        public static void instruções()
        { //Explicação simplificada das quatro operações da matemática e explicação simplificada da modelagem que iremos utilizar para responder os desafios do jogo.
            
            String menuinstrucoes= "\n 1- Sim, quero voltar ao menu !! \n" // String de menu das intruçoes para ser usado no JOptionPane
            +" 2- Não entendi, quero ver novamente. "; // String de menu das intruçoes para ser usado no JOptionPane
          String escolhainstrucoes;// String escolha de intruçoes para ser usado no JOptionPane
            System.out.println(" Instruções aparecerá em uma janela...");
                JOptionPane.showMessageDialog(null,"Antes de iniciar a sua jornada, existe algo que precisa saber. Este é um mundo cheio de números e contas matematicas, "// JOptionPane aprensentando uma mensagem de dialogo apenas necessario o usuario teclar ok, assim indo para a proxima mensagem de dialogo 
                        + "portanto, é necessario que entenda as 4 operações utilizadas nesta matéria (Matemática).");
                JOptionPane.showMessageDialog(null, "Adição e Subtração.\n"   // JOptionPane aprensentando uma mensagem de dialogo apenas necessario o usuario teclar ok, assim indo para a proxima mensagem de dialogo 
                        + "\nA adição combina dois números em um único número, denominado soma, total ou resultado. Adicionar mais números corresponde a repetir a operação.\n "
                        + "Exemplo: 1+1=2. Neste exemplo ele adiciona o número 1 com outro número 1 que iguala a 2."
                        + "\nA Subtração ocorre quando uma quantidade é retirada de outra, e o valor restante é o resultado dessa operação, fazendo assim um menos o outro."
                        + "Exemplo: 2-1=1. Neste exemplo ele subtrai o número 1 do número 2 que iguala a 1.");// JOptionPane aprensentando uma mensagem de dialogo apenas necessario o usuario teclar ok, assim indo para a proxima mensagem de dialogo 
                JOptionPane.showMessageDialog(null, "Divisão e Multiplicação.\n"  // JOptionPane aprensentando uma mensagem de dialogo apenas necessario o usuario teclar ok, assim indo para a proxima mensagem de dialogo 
                        + "\n Multiplicação é uma forma simples de se adicionar uma quantidade finita de números. O resultado da multiplicação de dois números é chamado produto.\n"
                        + "\n Um exemplo é: o número é 3 mas o número pedido para ser repetido será o 5 então: 5 x 3 = 5 + 5 + 5 = 15.\n "
                        + "\n A divisão é o inverso da multiplicação. Exemplo: se 5 x 3 = 15, então 15 / 3 = 5.");
                JOptionPane.showMessageDialog(null,"Importante dizer que iremos trabalhar com modelagem. A modelagem matemática é a área do conhecimento que estuda a simulação de sistemas reais\n"// JOptionPane aprensentando uma mensagem de dialogo apenas necessario o usuario teclar ok, assim indo para a proxima mensagem de dialogo 
                        + "a fim de prever o comportamento destes, sendo empregada em diversos campos de estudo.\n"
                        + "Exemplo: Maria comprou duas maçãs e deu uma a seu irmão. Quantas maçãs restaram para Maria ?\n "
                        + "Neste exemplo pegamos a quantidade de maçãs que maria comprou e subtraimos a quantidade que foi dada a seu irmão, ou seja: 2M - 1M = 1M (M = Maçãs).\n"
                        + "Dito isto, seguimos e boa sorte em sua jornada.");
                
               escolhainstrucoes = JOptionPane.showInputDialog(null,menuinstrucoes, "---Retornar ao menu ?---", JOptionPane.QUESTION_MESSAGE);//Janela de perguntará usando a string menuintruçoes usando o showInputdialog
              if ( escolhainstrucoes.equals("1") )        menu();           // caso de resposta do usuario 1 voltando ao menu usando if
              else if ( escolhainstrucoes.equals("2") )   instruções();// caso de resposta do usuario 2 repetindo as intruçoes
              else  { JOptionPane.showMessageDialog(null,"Opção invalida escolha entre 1 e 2 "); instruções(); // caso de resposta do usuario invalida repetindo as intruçoes
                      System.out.println();}
          
        }//fim das intruçoes

        public static void créditos(){ // aprensentando creditos
            System.out.println("===== DESENVOLVEDORES =====\nAlexsandro Lopes Sipelli\nDanilo Ribeiro Cueto\nEdney Pereira Silva\nHiago Pereira\nMatheus Medeiros Escudeiro \n");
            System.out.println("JOGO CONSTRUÍDO COM O INTUITO DE AJUDAR ALUNOS COM DIFICULDADES EM MODULAÇÃO NA MATÉRIA DE MATEMÁTICA, FOI UTILIZANDO AS AULAS DO PROFESSOR EDUARDO TAKEO NO CURSO DE ANALISE E DESENVOLVIMENTO DE SISTEMAS,  DURANTE O SEGUNDO SEMESTRE DE 2022 COM FIM DE SEMESTRE EM DEZEMBRO.");
            System.out.println("CURSO SENDO REALIZADO NO CENTRO UNIVERSITÁRIO SENAC DE  SÃO PAULO.");
            System.out.println("AGRADECIMENTOS AO PESSOAL QUE PARTICIPOU TANTO RESPONDENDO OS FORMULÁRIOS EM AULA QUANTO NO DESENVOLVIMENTO DO JOGO POR MEIO DO BETA... ");
            
            
            menu();// retornando ao menu, assim que aprensenta 
        }

        public static void main(String[] args) 
        {// void main chamando o menu para assim iniciar ou nao o jogo
            menu();
        }//fim da void main
    }// fim da classe 