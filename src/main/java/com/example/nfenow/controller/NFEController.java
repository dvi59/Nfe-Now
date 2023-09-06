package com.example.nfenow.controller;

import com.example.nfenow.dto.NfeDTO;
import com.example.nfenow.entity.NFE;
import com.example.nfenow.service.NFEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("nfe")
public class NFEController {


    @Autowired
    private NFEService nfeService;

    //Cadastro de uma nova NFE
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public NFE nfeAdd(@RequestBody NFE nfe){
        return nfeService.nfeRegister(nfe);
    }

    //Listar todas NFE's
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<NFE> listNFE(){
        return nfeService.nfeAllList();
    }

    //Retorno de uma NFE
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<NFE> oneNFE(@PathVariable Long id){
        return  nfeService.nfeFindOne(id);
    }

    //Exclusão de uma NFE
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNFE(@PathVariable Long id){
        nfeService.nfeDelete(id);
    }

    //Atualização de informações da NFE
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NFE updaNFE(@PathVariable Long id, @RequestBody NfeDTO nfeDTO){
        return nfeService.nfeUpdate(id, nfeDTO);
    }

}
