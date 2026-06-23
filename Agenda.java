package exercicio3;

public class Agenda {
	
	// Arrays para guardar as informações de forma paralela (tamanho fixo de 10)
    private String[] nomes = new String[10];
    private int[] idades = new int[10];
    private float[] alturas = new float[10];

    public void armazenaPessoa(String nome, int idade, float altura) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == null) {
                nomes[i] = nome;
                idades[i] = idade;
                alturas[i] = altura;
                System.out.println(nome + " foi guardado na posição " + i + " da agenda.");
                return;
            }
        }
        System.out.println("Erro: A tua agenda  atingiu o limite de 10 pessoas!");
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null && nomes[i].equalsIgnoreCase(nome)) {
                return i; 
            }
        }
        return -1; 
    }

    public void removePessoa(String nome) {
        int posicao = buscaPessoa(nome);
        if (posicao != -1) {
            nomes[posicao] = null;
            idades[posicao] = 0;
            alturas[posicao] = 0.0f;
            System.out.println("Registo de " + nome + " foi limpado com sucesso.");
        } else {
            System.out.println("Erro: Nenhum nome encontrado " + nome);
        }
    }

    public void imprimeAgenda() {
        System.out.println("\n===== CONTACTOS SALVOS =====");
        boolean vazia = true;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                vazia = false;
                System.out.println("Posição [" + i + "] -> Nome: " + nomes[i] + " | Idade: " + idades[i] + " anos | Altura: " + alturas[i] + "m");
            }
        }
        if (vazia) {
            System.out.println("A tua lista de contactos esta vazia.");
        }
    }

    public void imprimePessoa(int index) {
        if (index >= 0 && index < nomes.length && nomes[index] != null) {
            System.out.println("Dados do Indice " + index + ": " + nomes[index] + ", " + idades[index] + " anos, " + alturas[index] + "m.");
        } else {
            System.out.println("Erro: Essa posição esta vazia ou o indice é invalido.");
        }
    }

}
