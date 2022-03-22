package com.company;

public class Produto {

    public int idProduto ;
    public String descricao;
    public long quantidade;
    public long nivel;
    public double valor;

    public boolean entrada(long l){
        if(l>0){
            quantidade += l;
            return true;
        }

        return false;
    }
    public boolean saida (long l){
        if(l <= quantidade && l > 0){
            quantidade -= l;
            return true;
        }

        return false;
    }
    public void imprimir (){
        System.out.println("-----------------");
        System.out.println("id: " + idProduto );
        System.out.println("descricao: " + descricao);
        System.out.println("quantidade: " + quantidade);
        System.out.println("valor: " + valor);
        System.out.println("nivel: " + nivel);
        System.out.println("-----------------");

    }
  public void checarNivel (){
        if (nivel > quantidade){
            System.out.println("nivel abaixo do disponivel, avisar setor de compras.");

        }else{
            System.out.println("Nivel ok");


        }

  }
}
