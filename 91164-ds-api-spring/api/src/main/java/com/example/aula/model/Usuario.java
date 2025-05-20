package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.apache.logging.log4j.message.Message;

@Entity
@Table(name = "tb_jogador")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;


    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotBlank(message = "A idade é obrigatória.")
    private String idade;

    @NotBlank(message = "A altura é obrigatória")
    private String altura;

    @NotBlank(message = "Coloque o peso.")
    private String peso;

    @NotBlank(message = "Coloque a posição.")
    private String posicao;

    private String numCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, Sexo sexo, String idade, String altura, String peso, String posicao, String numCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "A idade é obrigatória.") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "A idade é obrigatória.") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "A altura é obrigatória") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "A altura é obrigatória") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "Coloque o peso.") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "Coloque o peso.") String peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "Coloque a posição.") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "Coloque a posição.") String posicao) {
        this.posicao = posicao;
    }

    public String getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(String numCamisa) {
        this.numCamisa = numCamisa;
    }
}
