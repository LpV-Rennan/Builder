import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacaBuilderTest {
    @Test
    void deveRetornarExcessaoParaVacaSemRegistro(){
        try{
            VacaBuilder vacaBuilder = new VacaBuilder();
            Vaca vaca = vacaBuilder
                    .setDataDeNascimento(LocalDate.now().minusDays(1))
                    .setRaca("Nelore")
                    .setNome("Princesa")
                    .setEstagio("Novilha")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Registro não informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoParaVacaSemData(){
        try{
            VacaBuilder vacaBuilder = new VacaBuilder();
            Vaca vaca = vacaBuilder
                    .setRaca("Nelore")
                    .setNome("Princesa")
                    .setEstagio("Novilha")
                    .setRegistro("33")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Data de nascimento não informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoParaVacaDataFuturo(){
        try{
            VacaBuilder vacaBuilder = new VacaBuilder();
            Vaca vaca = vacaBuilder
                    .setRaca("Nelore")
                    .setNome("Princesa")
                    .setEstagio("Novilha")
                    .setRegistro("33")
                    .setDataDeNascimento(LocalDate.now().plusDays(1))
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("A data de nascimento não pode estar no futuro", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoParaVacaSemEstagio(){
        try{
            VacaBuilder vacaBuilder = new VacaBuilder();
            Vaca vaca = vacaBuilder
                    .setRaca("Nelore")
                    .setNome("Princesa")
                    .setRegistro("33")
                    .setDataDeNascimento(LocalDate.now())
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Estagio nao informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoParaVacaMuitoVelha(){
        try{
            VacaBuilder vacaBuilder = new VacaBuilder();
            Vaca vaca = vacaBuilder
                    .setRaca("Nelore")
                    .setNome("Princesa")
                    .setEstagio("Novilha")
                    .setRegistro("33")
                    .setDataDeNascimento(LocalDate.now().minusDays(3).minusYears(1))
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Vaca muito velha para ser novilha", e.getMessage());
        }
    }
    @Test
    void deveRetornarVacaValida(){
            VacaBuilder vacaBuilder = new VacaBuilder();
            Vaca vaca = vacaBuilder
                    .setRaca("Nelore")
                    .setNome("Princesa")
                    .setEstagio("Novilha")
                    .setRegistro("33")
                    .setDataDeNascimento(LocalDate.now())
                    .setMediaDeProducao(0.0)
                    .build();

    }
}