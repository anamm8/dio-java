package edu.ana.primeirasemana;

public class MinhaClasse{
    // Classe executável -> Tem capacidade de inicializar o programa, tem de ter um método especial - main
    public static void main (String [] args){
        // Corpo da classe
        System.out.println("Olá a todos!"); // Classe system, dá-me um output, printando

        String BR = "Brasil";
        BR = "Brazil"; // Não devemos fazer isto se quisermos manter o valor de BR sempre igual, para isso usamos:
        //final String BR = "Brasil";

        String meuNome = "Anita";
        int anoFabricacao = 2026; // Tipo, nome definido e valor
        boolean verdadeira; // sem valor

        String primeiroNome = "Anita";
        String segundoNome = "Costa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeironome, String segundoNome) {
        return primeironome.concat(" ").concat(segundoNome);
        // return "Resultado da concat " + primeironome.concat(" ").concat(segundoNome);
    }
}