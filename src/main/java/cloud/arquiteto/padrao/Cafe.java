package cloud.arquiteto.padrao;

public class Cafe extends Bebida {
  public void adicionarAdocante(Adocante adocante) {
    adocante.adocar(this);
  }
}
