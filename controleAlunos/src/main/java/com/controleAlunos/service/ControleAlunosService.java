package com.controleAlunos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.controleAlunos.entity.ControleAlunos;
import com.controleAlunos.repository.ControleAlunoRepository;

@Service
public class ControleAlunosService {
	private final ControleAlunoRepository controleAlunoRepository;
	
	@Autowired
	public ControleAlunosService(ControleAlunoRepository controleAlunoRepository) {
		this.controleAlunoRepository = controleAlunoRepository;
	}
	
	public ControleAlunos saveControleAluno(ControleAlunos controleAluno) {
		return controleAlunoRepository.save(controleAluno);
	}
	
	public ControleAlunos getControleAlunoById(Long id) {
		return controleAlunoRepository.findById(id).orElse(null);
	}
	
	public List<ControleAlunos> getAllControleAluno(){
		return controleAlunoRepository.findAll();
	}
	
	public void deleteControleAluno(Long id) {
		controleAlunoRepository.deleteById(id);
	}

}
