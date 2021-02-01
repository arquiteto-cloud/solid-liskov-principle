package cloud.arquiteto.antipadrao;

public class Cafe extends Bebida {
  public void adicionarAcucarComum(AcucarComum acucarComum) {
    acucarComum.adocar(this);
  }

  public void adicionarAcucarEmCubos(AcucarEmCubos acucarEmCubos) {
    acucarEmCubos.adocar(this);
  }

  public void adicionarAcucarMascavo(AcucarMascavo acucarMascavo) {
    acucarMascavo.adocar(this);
  }

  public void adicionarMel(Mel mel) {
    mel.adocar(this);
  }

  public void adicionarAdocanteArtificial(AdocanteArtificial adocanteArtificial) {
    adocanteArtificial.adocar(this);
  }
}
