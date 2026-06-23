package exercicio4;

public class Main {

	public static void main(String[] args) {
		
		Televisao tvSala = new Televisao();
        ControleRemoto comando = new ControleRemoto();

        comando.consultarStatus(tvSala);

        // Mexendo no som e nos canais
        System.out.println("Apertando botões do comando...");
        comando.aumentarVolume(tvSala);
        comando.aumentarVolume(tvSala);
        
        comando.aumentarCanal(tvSala);
        comando.trocarCanal(tvSala, 4); // Vai direto pro canal 4

        comando.consultarStatus(tvSala);
	}

}
