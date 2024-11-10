package com.example.escola.controllers;

import com.example.escola.models.Aluno;
import com.example.escola.repositories.AlunoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    AlunoRepository repository;

    @GetMapping
    public ResponseEntity<List<Aluno>> getAllAlunos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/add")
    @Transactional
    public ResponseEntity<Aluno> createProfessor(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(repository.save(aluno));
    }
}