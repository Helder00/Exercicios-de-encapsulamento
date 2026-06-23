package exercicio4;

public class Televisao {
	
	private int volume;
    private int canal;

    public Televisao() {
        this.volume = 12; // Volume inicial moderado
        this.canal = 1;   // Começa na STV ou TVM
    }

    // Encapsulamento com validação básica dentro dos Setters
    public int getVolume() { return volume; }
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public int getCanal() { return canal; }
    public void setCanal(int canal) {
        if (canal > 0) {
            this.canal = canal;
        }
    }

}
