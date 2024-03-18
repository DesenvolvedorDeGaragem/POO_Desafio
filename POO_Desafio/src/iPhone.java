public class iPhone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Este método faz uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Este método atende uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Este método inicia o correio de voz");
    }

}
