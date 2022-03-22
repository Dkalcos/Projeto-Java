package com.company;

import java.util.Scanner;

public class GerenciarProduto {

    Produto p = new Produto();
    Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {

        GerenciarProduto gp = new GerenciarProduto();


	int opt = 0;
    do {
        System.out.println("opc 1 = cadastrar");
        System.out.println("opc 2 = Dar Entrada");
        System.out.println("opc 3 = Dar Saida");
        System.out.println("opc 4 = consultar");
        System.out.println("opc 5 = mostrarnivel");
        System.out.println("opc 9 = sair");
        opt = Integer.parseInt(gp.sn.nextLine());
        switch (opt){
            case 1:
                gp.exeCadastrar();
                break;
            case 2:
               gp.exeDarEntrada();
                break;
            case 3:
                gp.exeDarSaida();
                break;
            case 4:
                gp.exeConsultar();
                break;
            case 5:
                gp.exeMostrarNivel();
                break;
            case 9:
                break;
            default:
                System.out.println("opção invalida");

        }

    }while (opt != 9);


    }//fim do main


    public  void exeCadastrar(){
        System.out.printf("cadastro ");
        System.out.println("informe o id do produto ");
        p.idProduto = Integer.parseInt(sn.nextLine());
        System.out.println("informe a descricao ");
        p.descricao = sn.nextLine();
        System.out.println("digite a quantidade no estoque");
        p.quantidade = Long.parseLong(sn.nextLine());
        System.out.println("informe o nivel");
        p.nivel = Long.parseLong(sn.nextLine());
        System.out.println("informe o valor do produto");
        p.valor = Double.parseDouble(sn.nextLine());
    }
    public  void exeDarEntrada(){
        System.out.println("digite a quantidade para dar entrada");
        if(p.entrada(Long.parseLong(sn.nextLine()))){
            System.out.println("Entrada relalizada");
        }else {
            System.out.println("entrada nao realizada");
        }


    }
    public  void exeDarSaida(){
        System.out.println("digite a quantidade para dar saida");
        if(p.saida(Long.parseLong(sn.nextLine()))){
            System.out.println("saida relalizada");
        }else {
            System.out.println("saida nao realizada");
        }


    }
    public  void exeConsultar(){
        p.imprimir();
    }
    public  void  exeMostrarNivel(){
             p.checarNivel();
    }
}