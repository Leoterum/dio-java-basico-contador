package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner inputUsuario = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = inputUsuario.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = inputUsuario.nextInt();
            if (parametroUm >= parametroDois){throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");}
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("Erro: " + e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ){
        int contagem = parametroDois - parametroUm;
        //teste do resultado da contagem
        //System.out.println("Resultado da contagem " + contagem);
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}

