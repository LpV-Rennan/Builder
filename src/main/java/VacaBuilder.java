import java.time.LocalDate;

public class VacaBuilder {
    private Vaca vaca;

    public VacaBuilder() {
        this.vaca = new Vaca();
    }

    public Vaca build(){
        if (vaca.getRegistro().isEmpty())  {
            throw new IllegalArgumentException("Registro não informado");
        }

        if (vaca.getDataDeNascimento()==null){
            throw new IllegalArgumentException("Data de nascimento não informada");
        }

        if (vaca.getDataDeNascimento().isAfter(LocalDate.now())){
            throw  new IllegalArgumentException( "A data de nascimento não pode estar no futuro");
        }

        if(vaca.getEstagio().isEmpty()){
            throw new IllegalArgumentException("Estagio nao informado");
        }

        if (vaca.getEstagio().equals("Novilha") && vaca.getDataDeNascimento().isBefore(LocalDate.now().minusYears(1))){
            throw new IllegalArgumentException("Vaca muito velha para ser novilha");
        }
        
        return this.vaca;
    }

    public VacaBuilder setRegistro(String registro) {
        this.vaca.setRegistro(registro);
        return this;
    }



    public VacaBuilder setNome(String nome) {
        this.vaca.setNome(nome);
        return this;
    }



    public VacaBuilder setEstagio(String estagio) {
        this.vaca.setEstagio(estagio);
        return this;
    }



    public VacaBuilder setDataDeNascimento(LocalDate dataDeNascimento) {
       this.vaca.setDataDeNascimento(dataDeNascimento);
       return this;
    }



    public VacaBuilder setRaca(String raca) {
        this.vaca.setRaca(raca);
        return this;
    }


    public VacaBuilder setMediaDeProducao(Double mediaDeProducao) {
        this.vaca.setMediaDeProducao(mediaDeProducao);
        return this;
    }
}
