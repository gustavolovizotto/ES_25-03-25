// Nome: Gustavo Lovizotto Tesin  RA:2648830
public class Cidade {
    private int codCid;
    private String nomeCid;
    private String ufCid;

    // Construtor padrão (sem parâmetros)
    public Cidade() {
        this.codCid = 0;
        this.nomeCid = "";
        this.ufCid = "";
    }

    // Construtor com parâmetros (sobrecarga)
    public Cidade(int codCid, String nomeCid, String ufCid) {
        this.codCid = codCid;
        this.nomeCid = nomeCid;
        this.ufCid = ufCid;
    }

    // Getters e Setters
    public int getCodCid() {
        return codCid;
    }

    public void setCodCid(int codCid) {
        this.codCid = codCid;
    }

    public String getNomeCid() {
        return nomeCid;
    }

    public void setNomeCid(String nomeCid) {
        this.nomeCid = nomeCid;
    }

    public String getUfCid() {
        return ufCid;
    }

    public void setUfCid(String ufCid) {
        this.ufCid = ufCid;
    }
}
