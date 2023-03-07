import javax.sound.sampled.SourceDataLine;

public class principal {
    
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setTitulacao("Era do Gelo");
        filme1.setDuracao(120);
        filme1.setAno(2020);
        filme1.setSinopse("Habitantes da Vila Gelinho está com futuro incerto");

        
        
        System.out.println(filme1.getTitulacao());
        System.out.println(filme1.getDuracao());
        System.out.println(filme1.getAno());
        System.out.println(filme1.getSinopse());

        Genero genero1 = new Genero();
        genero1.setDescricao("Aventura");

        System.out.println(genero1.getDescricao());

        Sala sala1 = new Sala();
        sala1.SetSala("Primeira")
        sala1.setDescricao("3D");
        sala1.setLocalizacao("Não sei");

        System.out.println(sala1.getSala());
        System.out.println(sala1.getDescricao());
        System.out.println(sala1.getLocalizacao());
        System.out.println(sala1.getQuantidade_de_Cadeiras());

    }
}
