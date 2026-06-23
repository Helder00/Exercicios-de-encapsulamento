package exercicio2;

public class Elevador {
	
	private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;

    public Elevador() {}

    // Getters e Setters 
    public int getAndarAtual() { return andarAtual; }
    public void setAndarAtual(int andarAtual) { this.andarAtual = andarAtual; }

    public int getTotalAndares() { return totalAndares; }
    public void setTotalAndares(int totalAndares) { this.totalAndares = totalAndares; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public int getQtdPessoas() { return qtdPessoas; }
    public void setQtdPessoas(int qtdPessoas) { this.qtdPessoas = qtdPessoas; }

    // Métodos 
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;  // Térreo
        this.qtdPessoas = 0;  // Vazio
        System.out.println("Sistema ligado. Predio com " + totalAndares + " andares. Capacidade maxima: " + capacidade + " pessoas.");
    }

    public void entra() {
        if (this.qtdPessoas < this.capacidade) {
            this.qtdPessoas++;
            System.out.println("Mais uma pessoa entrou. Quantidade atual: " + qtdPessoas);
        } else {
            System.out.println("Aviso: O elevador cheio! Aguarde pelo próximo.");
        }
    }

    public void sai() {
        if (this.qtdPessoas > 0) {
            this.qtdPessoas--;
            System.out.println("Uma pessoa Saiu. Quantidade atual: " + qtdPessoas);
        } else {
            System.out.println("Aviso: O elevador ja esta  completamente vazio.");
        }
    }

    public void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            System.out.println("A subir... Estamos no andar: " + andarAtual);
        } else {
            System.out.println("Aviso: Estas no último andar do prédio!");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
            System.out.println("A descer... Estamos no andar: " + andarAtual);
        } else {
            System.out.println("Aviso: O elevador  esta no primeiro andar(térreo).");
        }
    }

}
