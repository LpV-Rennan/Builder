import java.time.LocalDate;

public class Vaca {
    private String registro;
    private String nome;
    private String estagio;
    private LocalDate dataDeNascimento;
    private String raca;
    private Double mediaDeProducao;

    Vaca(){
        this.registro = "";
        this.raca = "";
        this.estagio = "";

    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstagio() {
        return estagio;
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getMediaDeProducao() {
        return mediaDeProducao;
    }

    public void setMediaDeProducao(Double mediaDeProducao) {
        this.mediaDeProducao = mediaDeProducao;
    }
}
