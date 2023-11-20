package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pontuacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ra;
    @Column(nullable = false)
    private int peso;
    private int pontos;

    public Pontuacao(Long ra, int peso, int pontos) {
        this.ra = ra;
        this.peso = peso;
        this.pontos = pontos;
    }
    public Pontuacao() {
    }


    public Long getRa() {
        return ra;
    }
    public void setRa(Long ra) {
        this.ra = ra;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    @Override
    public String toString() {
        return "Pontuacao [ra=" + ra + ", peso=" + peso + ", pontos=" + pontos + "]";
    }

}
