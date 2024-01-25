package com.controleAlunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controleAlunos.entity.ControleAlunos;

public interface ControleAlunoRepository extends JpaRepository<ControleAlunos, Long>{

}
