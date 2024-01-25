package com.controleAlunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.controleAlunos.entity.ControleAlunos;
import com.controleAlunos.service.ControleAlunosService;
import com.projetoPedidos.entities.Pedido;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/controleAlunos")
public class ControleAlunoController {
	private final ControleAlunosService controleAlunoService;
	
	@Autowired
	public ControleAlunoController (ControleAlunosService controleAlunoService) {
		this.controleAlunoService = controleAlunoService;
	}
	
	@PostMapping
	public ControleAlunos createControleAluno(@RequestBody ControleAlunos controleAluno) {
		return controleAlunoService.saveControleAluno(controleAluno);
	}
	
	@GetMapping("/{id}")
	public ControleAlunos getControleAluno(@PathVariable Long id) {
		return controleAlunoService.getControleAlunoById(id);
	}
	
	@GetMapping
	public List<ControleAlunos> getAllControleAluno(){
		return controleAlunoService.getAllControleAluno();
	}
	
	@DeleteMapping("/{id}")
	public void deleteControleAluno(@PathVariable Long id) {
		controleAlunoService.deleteControleAluno(id);
	}
	
}
