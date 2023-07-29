package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosMedicos;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    List<DadosMedicos> medicos = new ArrayList<>();

    @GetMapping
    private List<DadosMedicos> obterListaMedicos(){
        return medicos;
    }

    @GetMapping("/{nome}")
    private String requisicaoGetComParametro(@PathVariable String nome){
        return "Essas são as informações do(a) Dr(a) " + nome;
    }

    @PostMapping
    private String requisicaoPost(@RequestBody DadosMedicos medico){
        medicos.add(medico);
        return  String.format("Adicionei na lista os dados do médico:: %s", medico.nome());        
    }
    
}
