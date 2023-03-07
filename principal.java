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
    }
}
