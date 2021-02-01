package cloud.arquiteto.padrao;

public class Cafeteira {
    public static void main( String[] args )
    {
        System.out.println( "Bem vindo ao Cafe Liskov!" );

        Cafe cafezinho = new Cafe();

        Adocante acucarComum = new AcucarComum();
        Adocante acucarEmCubos = new AcucarEmCubos();
        Adocante acucarMascavo = new AcucarMascavo();
        Adocante adocanteArtificial = new AdocanteArtificial();
        Adocante mel = new Mel();

        // Novidade da loja!!!!
        Adocante melMaple = new MelMaple();

        cafezinho.adicionarAdocante(acucarComum);
        cafezinho.adicionarAdocante(acucarEmCubos);
        cafezinho.adicionarAdocante(acucarMascavo);
        cafezinho.adicionarAdocante(acucarEmCubos);
        cafezinho.adicionarAdocante(mel);
        cafezinho.adicionarAdocante(adocanteArtificial);
        cafezinho.adicionarAdocante(melMaple);

        System.out.println( cafezinho.saborAdocicado + " agora está saboroso!" );
    }
}
