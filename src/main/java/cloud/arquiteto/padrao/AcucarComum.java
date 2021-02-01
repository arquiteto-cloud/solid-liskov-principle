package cloud.arquiteto.padrao;

public class AcucarComum implements Adocante {

  @Override
  public void adocar(Bebida bebida) {
    bebida.saborAdocicado+=1;
  }

}
