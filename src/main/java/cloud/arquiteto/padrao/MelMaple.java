package cloud.arquiteto.padrao;

public class MelMaple extends Mel {
  @Override
  public void adocar(Bebida bebida) {
    bebida.saborAdocicado += 3;
  }
}
