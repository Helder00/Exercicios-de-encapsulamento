package exercicio1;

public class CarroCorrida {
	
    private int numeroCarro;
    private String piloto;
    private String equipe;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    // Construtor 
    public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0.0f; 
        this.ligado = false;         
    }

    // Métodos Getters e Setters 
    
    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }
    
    public float getVelocidadeAtual() { return velocidadeAtual; }
    
    public float getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(float velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }
    
    public String getEquipe() { return equipe; }
    public void setEquipe(String equipe) { this.equipe = equipe; }
    
    public int getNumeroCarro() { return numeroCarro; }
    public void setNumeroCarro(int numeroCarro) { this.numeroCarro = numeroCarro; }

    public String getPiloto() { return piloto; }
    public void setPiloto(String piloto) { this.piloto = piloto; }


    // Metudos ligar,Desligar , acelerar ,atenuar e parar
    public void ligar() {
        this.ligado = true;
        System.out.println("Motor ligado! Carro #" + numeroCarro + " está pronto.");
    }

    public void desligar() {
        if (this.velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println("Motor desligado com sucesso.");
        } else {
            System.out.println("Aviso: Trava o carro primeiro antes de desligar!");
        }
    }

    public void acelerar(float aceleracao) {
        if (!this.ligado) {
            System.out.println("Erro: Não podes acelerar com o carro desligado.");
            return;
        }
        
        if (this.velocidadeAtual + aceleracao > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
            System.out.println("Limite atingido! A correr à velocidade máxima de: " + velocidadeMaxima + " Km/h");
        } else {
            this.velocidadeAtual += aceleracao;
            System.out.println("A acelerar... Velocidade atual: " + velocidadeAtual + " Km/h");
        }
    }

    public void atenuar(float reducao) {
        if (!this.ligado) {
            System.out.println("Erro: O carro está desligado, não há como atenuar.");
            return;
        }

        if (this.velocidadeAtual - reducao < 0) {
            this.velocidadeAtual = 0;
            System.out.println("O carro reduziu até parar completamente.");
        } else {
            this.velocidadeAtual -= reducao;
            System.out.println("Velocidade reduzida para: " + velocidadeAtual + " Km/h");
        }
    }

    public void parar() {
        this.velocidadeAtual = 0;
        System.out.println("Travão de mão puxado. O carro está totalmente parado.");
    }
}
	
	