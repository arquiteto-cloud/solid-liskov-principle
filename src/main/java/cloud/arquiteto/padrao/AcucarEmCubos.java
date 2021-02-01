package cloud.arquiteto.padrao;

public class AcucarEmCubos implements Adocante {

  @Override
  public void adocar(Bebida bebida) {
    bebida.saborAdocicado+=1;
  }

}
