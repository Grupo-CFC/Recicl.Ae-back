package com.example.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Pontuacao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
/* 
public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long>{
    
    @Query("select po from Pontuacao po left join fetch po.pontos p where po.id = :id ")
    Pontuacao findPontuacaoFetchPontos(@Param("id") Long id);
}*/

 
@Repository
public class PontuacaoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Pontuacao inserir(Pontuacao pontuacao) {
        entityManager.merge(pontuacao);
        return pontuacao;
    }
    
    public List<Pontuacao> obterTodos() {
        return entityManager.createQuery("from Pontuacao",
        Pontuacao.class).getResultList();
    }
}

