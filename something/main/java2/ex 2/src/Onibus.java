public class Onibus extends Veiculo{
    private boolean ligado;

    public void ligar(){
        ligado = true;
        System.out.println("Onibus ligado");
    }
    public void Desligar(){
        desligado = true;
        System.out.println("Onibus Desligado");
    }
}
