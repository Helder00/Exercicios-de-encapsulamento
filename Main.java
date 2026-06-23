import java.util.Scanner;

// Importacao das classes de cada exercicio

import exercicio1.CarroCorrida;
import exercicio2.Elevador;
import exercicio3.Agenda;
import exercicio4.Televisao;
import exercicio4.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("MENU DE TESTES DO TRABALHO");
        System.out.println("Qual exercicio pretende rodar?");
        System.out.println("1 - Testar o Carro");
        System.out.println("2 - Testar o Elevador");
        System.out.println("3 - Testar a Agenda");
        System.out.println("4 - Testar a TV e Comando");
        System.out.print("Escolhe um numero: ");
        
        int escolha = ler.nextInt();
        System.out.println(); 
        
        if (escolha == 1) {
            System.out.println("--- Escolhido o Exercicio 1: Carro ---");
            CarroCorrida c = new CarroCorrida(84, "Helder Chivurre", "Toyata Mar X", 180);
            
            c.acelerar(30); // O codigo ira  falhar porque o motor nao esta ligado 
            c.ligar();
            c.acelerar(100);
            c.parar();
            c.desligar();
        } 
        else if (escolha == 2) {
            System.out.println("--- Escolhido o Exercicio 2: Elevador ---");
            Elevador el = new Elevador();
            el.inicializa(4, 10); // Cabe 4 pessoas, predio tem 10 andares
            
            el.entra();
            el.entra();
            el.sobe();
            el.desce();
            el.sai();
        } 
        else if (escolha == 3) {
            System.out.println("--- Escolhido o Exercicio 3: Agenda ---");
            Agenda ag = new Agenda();
            
            ag.armazenaPessoa("Manuel", 22, 1.75f);
            ag.armazenaPessoa("Antonio", 19, 1.62f);
            ag.imprimeAgenda();
            
            int ondeEsta = ag.buscaPessoa("Antonio");
            System.out.println("Antonio encontradao na posicao: " + ondeEsta);
        } 
        else if (escolha == 4) {
            System.out.println("--- Escolhido o Exercicio 4: TV e Comando ---");
            Televisao tv = new Televisao();
            ControleRemoto comando = new ControleRemoto();
            
            comando.consultarStatus(tv);
            comando.aumentarVolume(tv);
            comando.trocarCanal(tv, 7); // Mudar para o canal 7
            comando.consultarStatus(tv);
        } 
        else {
            System.out.println("Opcao errada. Corre o programa de novo e escolhe de 1 a 4!");
        }
        
        ler.close(); 
    }
}