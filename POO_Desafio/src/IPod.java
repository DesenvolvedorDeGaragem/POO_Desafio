

public class IPod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Este método deverá iniciar uma música");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Este método deverá pausar a música");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Este método servirá para selecionar uma música");
    }

}
