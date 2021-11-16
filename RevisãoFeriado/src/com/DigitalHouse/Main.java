package com.DigitalHouse;


import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//       ======================================================= peso ideal
//        System.out.println("indique sua altura:");
//        double alturaUsuario = scanner.nextDouble();
//
//        pesoIdeal(alturaUsuario);
//
//        // =================================================== Calculando o peso dos peixes
//        System.out.println("Peso total dos seus peixes:");
//        double pesoTotal = scanner.nextDouble();
//        pesoDosPeixes(pesoTotal);

        // =================================================== Calculando o preço das tintas
//        System.out.println("Quantos metros quadrados é a area que vai ser pintada?");
//        int metrosQuadratos = scanner.nextInt();
//        areaASerPintada(metrosQuadratos);

        // =================================================== Questianário de crime
//        perguntasSobreCrime();

        // =================================================== vendendo combustivel
//        listrosVendidos();

        // =================================================== idade media da turma
//        mediaIdade();

        // =================================================== Aumento no salário
//        ajusteSalario();

        // =================================================== verificando login e senha
//        verificandoUsuario();

        // =================================================== verificando temperaturas
//        calculandoTemperatura();

        // =================================================== verificando Notas
//        verificandoNota();

        // =================================================== tabuada
//            tabuada();

        // =================================================== verificando frase
//        verificandoFrase();

        // =================================================== Nome ao contrario
//        nomeAoContrario();
        // =================================================== Horas trabalhadas
        horasTrabalhadas();
    }

//  Tendo como dados de entrada a altura do usuário, construa um algoritmo
//  que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 .

    public static void pesoIdeal( double altura ){
        double resultado = (72.7*altura) - 58;
        System.out.println("O ideal para sua altura é " +  resultado);
    }

//    João Papo-de-Pescador, homem de bem, comprou um microcomputador
//    para controlar o rendimento financeiro de seu trabalho. Toda vez que ele
//    traz um peso de peixes maior que o estabelecido pelo regulamento de
//    pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00
//    por quilo excedente. João precisa que você faça um programa que leia a
//    variável peso (peso de peixes) e calcule o excesso. Gravar na variável
//    excesso a quantidade de quilos além do limite e na variável multa o valor
//    da multa que João deverá pagar. Imprima os dados do programa com as
//    mensagens adequadas.

    public static void pesoDosPeixes(double pesoDoPeixe){
        int pesoMaximo = 50;
        double excesso =  pesoDoPeixe - pesoMaximo;
        double multa = excesso * 4;

         String resultado = pesoDoPeixe > pesoMaximo ? "Você excedeu " + excesso + "kg do limite estabelecido, e receberá uma multa de R$" + multa : "Você não execedeu o limite e não será cobrado";
        System.out.println(resultado);
    }

//    Faça um programa para uma loja de tintas. O programa deverá pedir o
//    tamanho em metros quadrados da área a ser pintada. Considere que a
//    cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta
//    é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
//    a quantidades de latas de tinta a serem compradas e o preço total.

    public static void areaASerPintada(int metrosQuadrados){
        double custoLata  = 80;

        double coberturaDaTinta =  metrosQuadrados / 3;
        double quantidadeLatas =  Math.round(coberturaDaTinta / 18) ;
        double precoTotal =  quantidadeLatas * custoLata;


        System.out.println("Você vai precisar comprar " + (int) quantidadeLatas + " latas de tintas, o valor total vai ser R$" + precoTotal);

    }

//    Faça um programa que faça 5 perguntas para uma pessoa sobre um
//    crime. As perguntas são:
//    a) "Telefonou para a vítima?"
//    b) "Esteve no local do crime?"
//    c) "Mora perto da vítima?"
//    d) "Devia para a vítima?"
//    e) "Já trabalhou com a vítima?"
//    O programa deve no final emitir uma classificação sobre a participação da
//    pessoa no crime. Se a pessoa responder positivamente a 2 questões ela
//    deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
//    como "Assassino". Caso contrário, ele será classificado como "Inocente".

    public static void perguntasSobreCrime(){
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?" };
        int contagemPositiva = 0;
        String resposta;

        System.out.println("Responda sim ou não");
        for(String pergunta : perguntas){
            System.out.println(pergunta);
            resposta = scanner.nextLine();

            if(resposta.equals("sim")){
                contagemPositiva++;
            }
        }

        if(contagemPositiva == 2){
            System.out.println("A pessoa é suspeita");
        }else if(contagemPositiva == 3 || contagemPositiva == 4 ){
            System.out.println("A pessoa é Cúmplice");
        }else if(contagemPositiva >= 5){
            System.out.println("A pessoa é o assassino");
        }else {
            System.out.println("A pessoa é inocente");
        }

    }

//    Um posto está vendendo combustíveis com a seguinte tabela de
//    descontos:
//    a) Álcool:
//       - até 20 litros, desconto de 3% por litro
//       - acima de 20 litros, desconto de 5% por litro
//    b) Gasolina:
//      - até 20 litros, desconto de 4% por litro
//      - acima de 20 litros, desconto de 6% por litro
//    Escreva um algoritmo que leia o número de litros vendidos, o tipo de
//    combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
//    imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
//    gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.

    public static  void listrosVendidos(){
        double litroGasolina = 2.50;
        double litroAlcool = 1.90;
        double valorTotal;
        double desconto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que tipo de combustivel você deseja: \n A - Alcool \n G - Gasolina");
        String tipoCombustevel = scanner.nextLine();
        System.out.println("Quantos litros deseja colocar?");
        int quantidadeLitro = scanner.nextInt();

        if (tipoCombustevel.equals("G") || tipoCombustevel.equals("g") ){
            valorTotal =  quantidadeLitro * litroGasolina;
        }else {
            valorTotal = quantidadeLitro * litroAlcool;
        }

        System.out.println("O valor total ficou R$" + valorTotal);

        if(quantidadeLitro <= 20 && (tipoCombustevel.equals("A") ||  tipoCombustevel.equals("a")) ){
            desconto = (valorTotal * 1.03) -  valorTotal ;
            valorTotal = valorTotal - desconto;
            System.out.println("Mas com desconto de 3%, fica R$" + valorTotal);
        }else if (quantidadeLitro > 20 && (tipoCombustevel.equals("A") ||  tipoCombustevel.equals("a"))){
            desconto = (valorTotal * 1.05) - valorTotal;
            valorTotal = valorTotal - desconto;
            System.out.println("Mas com desconto de 5%, fica R$" + valorTotal);
        }

        if(quantidadeLitro <= 20 && ( tipoCombustevel.equals("G") || tipoCombustevel.equals("g")) ){
            desconto =(valorTotal * 1.04) -  valorTotal ;
            valorTotal = valorTotal - desconto;
            System.out.println("Mas com desconto de 4%, fica R$" + valorTotal);
        }else if(quantidadeLitro > 20 && ( tipoCombustevel.equals("G") || tipoCombustevel.equals("g")) ) {
            desconto = (valorTotal * 1.06) - valorTotal;
            valorTotal = valorTotal - desconto;
            System.out.println("Mas com desconto de 6%, fica R$" + valorTotal);
        }

    }

//    Faça um programa que peça para n pessoas a sua idade, ao final o
//    programa deverá verificar se a média de idade da turma varia entre 0 e
//    25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou
//    idosa, conforme a média calculada.

    public static void mediaIdade(){
        Scanner scanner = new Scanner(System.in);
        int somaTotalIdade = 0;
        float mediaGeral;
        ArrayList<Integer> idades =  new ArrayList<Integer>();

        System.out.println("Quantas pessoas há na turma?");
        int numeroPessoas = scanner.nextInt();
        System.out.println("indique a idade de cada um: ");


        for(int i = 1; i <= numeroPessoas; i++){
            System.out.println(i + " - ");
            idades.add(scanner.nextInt());
        }

        for(int idade : idades){
            somaTotalIdade += idade;
        }

        mediaGeral = somaTotalIdade / idades.size();

        if (mediaGeral <= 25){
            System.out.println("A turma é jovem");
        }else if(mediaGeral > 25 && mediaGeral <= 60){
            System.out.println("A turma é adulta");
        }else if(mediaGeral > 60){
            System.out.println("A turma é idosa");
        }
    }

//    As Organizações Tabajara resolveram dar um aumento de salário aos
//    seus colaboradores e lhe contrataram para desenvolver o programa que
//    calculará os reajustes. Faça um programa que recebe o salário de um
//    colaborador e o reajuste segundo o seguinte critério, baseado no salário
//    atual:
//            ● salários até R$ 280,00 (incluindo) : aumento de 20%
//            ● salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//            ● salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//            ● salários de R$ 1500,00 em diante : aumento de 5%

//            Após o aumento ser realizado, informe na tela:
//            ● o salário antes do reajuste;
//            ● o percentual de aumento aplicado;
//            ● o valor do aumento;
//            ● o novo salário, após o aumento.

    public static void ajusteSalario(){
        double salarioAtualizado = 0;
        double diferenca;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto é o salário do colaborador ?");
        double salarioColaborador = scanner.nextDouble();

        if (salarioColaborador <= 280.00){
            salarioAtualizado =  salarioColaborador * 1.20;
            diferenca = salarioAtualizado - salarioColaborador;
            System.out.println("O seu salário era de R$" + salarioColaborador +
                    "\nVocê recebeu um aumento de 20% \n" +
                    "foi acrescentado no seu salario R$" + (int) diferenca +
                    "\nseu novo salário foi para R$" + (int) salarioAtualizado );

        }else  if (salarioColaborador > 280.00 && salarioColaborador <= 700.00){
            salarioAtualizado = salarioColaborador * 1.15;
            diferenca = salarioAtualizado - salarioColaborador;
            System.out.println("O seu salário era de R$" + salarioColaborador +
                    "\nVocê recebeu um aumento de 15% \n" +
                    "foi acrescentado no seu salario R$" + (int) diferenca +
                    "\nseu novo salário foi para R$" + (int) salarioAtualizado );
        }else if (salarioColaborador > 700.00 && salarioColaborador < 1500.00){
            salarioAtualizado = salarioColaborador * 1.10;
            diferenca = salarioAtualizado - salarioColaborador;
            System.out.println("O seu salário era de R$" + salarioColaborador +
                    "\nVocê recebeu um aumento de 10% \n" +
                    "foi acrescentado no seu salario R$" + (int) diferenca +
                    "\nseu novo salário foi para R$" + (int) salarioAtualizado );
        }else {
            salarioAtualizado = salarioColaborador * 1.05;
            diferenca = salarioAtualizado - salarioColaborador;
            System.out.println("O seu salário era de R$" + salarioColaborador +
                    "\nVocê recebeu um aumento de 5% \n" +
                    "foi acrescentado no seu salario R$" + (int) diferenca +
                    "\nseu novo salário foi para R$" + (int) salarioAtualizado );
        }
    }

//        Faça um programa que leia um nome de usuário e a sua senha e não
//        aceite a senha igual ao nome do usuário, mostrando uma mensagem de
//        erro e voltando a pedir as informações.

    public static void verificandoUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu login:");
        String loginUsuario = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senhaUsuario = scanner.nextLine();

        while (loginUsuario.equals(senhaUsuario)){
            System.out.println("Erro! Sua senha não pode ser igual ao login, \ntente novamente!");

            System.out.println("Digite seu login:");
            loginUsuario = scanner.nextLine();
            System.out.println("Digite sua senha:");
            senhaUsuario = scanner.nextLine();
        }

        System.out.println("Conta criada com sucesso!");

    }

//    O Departamento Estadual de Meteorologia lhe contratou para
//    desenvolver um programa que leia um conjunto indeterminado de
//    temperaturas, e informe ao final a menor e a maior temperaturas
//    informadas, bem como a média das temperaturas.

    public static void calculandoTemperatura(){
        ArrayList<Integer> temperaturas = new ArrayList<Integer>();

        //pedindo entrada das temperaturas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas temperaturas deseja colocar ?");
        int numeroTemperaturas = scanner.nextInt();

        // colocando no array as temperaturas
        for (int i = 1; i <= numeroTemperaturas; i++){
            System.out.println( i + ":");
            temperaturas.add(scanner.nextInt());
        }

        // verificando a maior temperatura
        int acumuloTemperatura = 0;
        for(int temperatura: temperaturas){

            if (temperatura > acumuloTemperatura){
                acumuloTemperatura = temperatura;
            }
        }
        System.out.println("A maior temperatura informada foi " + acumuloTemperatura);

        // verificando a menor temperatura
        for(int temperatura: temperaturas){

            if (temperatura < acumuloTemperatura){
                acumuloTemperatura = temperatura;
            }
        }
        System.out.println("A menor temperatura informada foi " + acumuloTemperatura);

        //calculando a média das temperaturas
        int somaTotalTemperatura = 0;
        for( int temperatura : temperaturas){
            somaTotalTemperatura += temperatura;
        }

        int mediaTemperatura =  somaTotalTemperatura / temperaturas.size();

        System.out.println("A media das temperaturas foi de " + mediaTemperatura);
    }

//    Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//    mensagem caso o valor seja inválido e continue pedindo até que o
//    usuário informe um valor válido.

    public  static void verificandoNota(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10");
        float notaEscolhida = scanner.nextFloat();

        while (notaEscolhida < 0 || notaEscolhida > 10){
            System.out.println("Erro!, escolha uma nota entre 0 e 10");
            notaEscolhida = scanner.nextFloat();
        }

        System.out.println("Nota aceita!");
    }

//    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//    qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
//    número ele deseja ver a tabuada.

    public static void tabuada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a tabuada que você quer entre 1 e 10");
        int tabaudaEscolhida = scanner.nextInt();

        while (tabaudaEscolhida > 10){
            System.out.println("ERRO! escolha a tabuada de 1 a 10: ");
            tabaudaEscolhida = scanner.nextInt();
        }

        for (int i = 0 ; i <= 10; i++ ){
            System.out.println(tabaudaEscolhida + "x" + i + " = " + tabaudaEscolhida * i);
        }
    }

//    Uma academia deseja fazer um censo entre seus clientes para descobrir o
//    mais alto, o mais baixo, o maior e o menor peso. Para isto você deve fazer
//    um programa que pergunte a cada um dos clientes da academia seu
//    código, sua altura e seu peso. O final da digitação de dados deve ser dada
//    quando o usuário digitar 0 (zero) no campo código. Ao encerrar o
//    programa também deve ser informados os códigos e valores do cliente
//    mais alto, do mais baixo, do mais gordo e do mais magro, além da média
//    das alturas e dos pesos dos clientes


//   Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:
//   1. quantos espaços em branco existem na frase.
//   2. quantas vezes aparecem as vogais a, e, i, o, u.

    public static void verificandoFrase(){
        Scanner scanner = new Scanner(System.in);
        int espacosBrancos = 0;
        int a=0 , e=0, i=0, o=0 ,u=0 ;
        Character letra;

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

      for(int count = 0; count < frase.length(); count++){
          letra = frase.charAt(count);

          if(letra.equals('a') || letra.equals('A')){
              a++;
          }
          if(letra.equals('e') || letra.equals('E')){
              e++;
          }
          if(letra.equals('i') || letra.equals('I')){
              i++;
          }
          if(letra.equals('o') || letra.equals('O')){
              o++;
          }
          if(letra.equals('u') || letra.equals('U')){
              u++;
          }
          if(letra.equals(' ')){
              espacosBrancos++;
          }

      }

        System.out.println( "Na sua frase tem \n" + a + " - a\n" + e + " - e\n" + i + " - i\n" + o + " - o\n" + u + " - u\n"
                + espacosBrancos + " - espaços em branco");
    }

//    Faça um programa que permita ao usuário digitar o seu nome e em
//    seguida mostre o nome do usuário de trás para frente utilizando somente
//    letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário
//    pode digitar letras maiúsculas ou minúsculas.

    public static void nomeAoContrario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome:");
        String nomeUsuario = scanner.nextLine();

       String invertida = new StringBuilder(nomeUsuario).reverse().toString();
       System.out.println(invertida.toUpperCase(Locale.ROOT));

       // =====================================  também da pra fazer desse jeito :
//        String invertido = "";
//        for (int i = nomeUsuario.length()-1; i >= 0; i--){
//            invertido += nomeUsuario.charAt(i) ;
//        }
//
//        System.out.println(invertido.toUpperCase(Locale.ROOT));

    }

//    Faça um Programa que pergunte quanto você ganha por hora e o número
//    de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
//    referido mês.

    public  static void horasTrabalhadas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        double valorHora = scanner.nextDouble();
        System.out.println("Quantas horas você trabalha por mês ?");
        int horasPorMes = scanner.nextInt();

        System.out.println("Você ganha R$" + (horasPorMes * valorHora) + " por mês!" );
    }


}
