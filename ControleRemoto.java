package exercicio4;

public class ControleRemoto {
	
    public void aumentarVolume(Televisao tv) {
        tv.setVolume(tv.getVolume() + 1);
        System.out.println("Som: " + tv.getVolume());
    }

    public void diminuirVolume(Televisao tv) {
        tv.setVolume(tv.getVolume() - 1);
        System.out.println("Som: " + tv.getVolume());
    }

    public void aumentarCanal(Televisao tv) {
        tv.setCanal(tv.getCanal() + 1);
        System.out.println("Canal atual: " + tv.getCanal());
    }

    public void diminuirCanal(Televisao tv) {
        if (tv.getCanal() > 1) {
            tv.setCanal(tv.getCanal() - 1);
            System.out.println("Canal atual: " + tv.getCanal());
        } else {
            System.out.println("Não há canais abaixo do número 1.");
        }
    }

    public void trocarCanal(Televisao tv, int canalDesejado) {
        if (canalDesejado > 0) {
            tv.setCanal(canalDesejado);
            System.out.println("Sintonizado direto no canal: " + tv.getCanal());
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public void consultarStatus(Televisao tv) {
        System.out.println("\n========================");
        System.out.println(" CANAL SELECIONADO: " + tv.getCanal());
        System.out.println(" POTÊNCIA DO SOM: " + tv.getVolume());
        System.out.println("========================\n");
    }

}
