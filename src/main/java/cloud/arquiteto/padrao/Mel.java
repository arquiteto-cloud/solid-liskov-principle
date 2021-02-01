package cloud.arquiteto.padrao;

public class Mel implements Adocante {

  @Override
  public void adocar(Bebida bebida) {
    bebida.saborAdocicado+=2;
  }

}
