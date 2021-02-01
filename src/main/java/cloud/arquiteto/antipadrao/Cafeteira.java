package cloud.arquiteto.antipadrao;

public class Cafeteira {
    public static void main( String[] args )
    {
        System.out.println( "Bem vindo ao Cafe Sem Liskov!" );

        Cafe cafezinho = new Cafe();

        AcucarComum acucarComum = new AcucarComum();
        AcucarEmCubos acucarEmCubos = new AcucarEmCubos();
        AcucarMascavo acucarMascavo = new AcucarMascavo();
        Mel mel = new Mel();
        AdocanteArtificial adocanteArtificial = new AdocanteArtificial();

        cafezinho.adicionarAcucarComum(acucarComum);
        cafezinho.adicionarAcucarEmCubos(acucarEmCubos);
        cafezinho.adicionarAcucarMascavo(acucarMascavo);
        cafezinho.adicionarAcucarEmCubos(acucarEmCubos);
        cafezinho.adicionarMel(mel);
        cafezinho.adicionarAdocanteArtificial(adocanteArtificial);

        System.out.println( cafezinho.saborAdocicado + " está doce demais!" );
    }
}
