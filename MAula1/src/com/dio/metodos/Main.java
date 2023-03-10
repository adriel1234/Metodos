package com.dio.metodos;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        // Mensagem
        System.out.println("Exrcicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(18);

        //Emprestimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);


    }
}
