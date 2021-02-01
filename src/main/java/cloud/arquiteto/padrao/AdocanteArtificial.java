package cloud.arquiteto.padrao;

public class AdocanteArtificial implements Adocante {

  @Override
  public void adocar(Bebida bebida) {
    bebida.saborAdocicado+=1;
  }

}
