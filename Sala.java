public class Sala {
   private String descricao;
   private String localizacao;
   private int quantidade_de_cadeiras;
   private String tipo_de_tela;

   public String getDescricao(){
    return this.descricao;
       }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return this.localizacao;
            }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public int getQuantidade_de_Cadeiras(){
        return this.quantidade_de_cadeiras;

    }

    public void setQuantidade_de_Cadeiras(int quantidade_de_cadeiras){
        this.quantidade_de_cadeiras = quantidade_de_cadeiras;

    }

    public String getTipo_de_Tela(){
        this.tipo_de_tela;
            }

    public void setTipo_de_Tela(String tipo_de_tela){
        this.tipo_de_tela = tipo_de_tela;
    }

    
}
