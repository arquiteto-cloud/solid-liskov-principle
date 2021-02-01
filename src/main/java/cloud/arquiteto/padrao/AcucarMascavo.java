package cloud.arquiteto.padrao;

public class AcucarMascavo implements Adocante {

  @Override
  public void adocar(Bebida bebida) {
    bebida.saborAdocicado+=1;
  }

}
