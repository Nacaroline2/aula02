package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosProcedimentos;

@RestController
@RequestMapping("/procedimentos")

public class ProcedimentosController {

    List<DadosProcedimentos> procedimentos = new ArrayList<>();

    @PostMapping

    private String requisicaoProcedimentos(@RequestBody DadosProcedimentos procedimento){
        procedimentos.add(procedimento);
        return  String.format("Adicionei na lista os procedimentos médicos %s, %.2f", procedimento.descricao(), procedimento.valor());        
    }

    @GetMapping

    private List<DadosProcedimentos> obterListaProcedimentos(){
        return procedimentos;
    }
}
