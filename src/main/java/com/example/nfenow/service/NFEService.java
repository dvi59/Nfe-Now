package com.example.nfenow.service;

import com.example.nfenow.dto.NfeDTO;
import com.example.nfenow.entity.NFE;
import com.example.nfenow.exception.MessageHandler;
import com.example.nfenow.respository.NFERepository;
import jakarta.persistence.EntityNotFoundException;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NFEService {

    @Autowired
    private NFERepository nfeRepository;

    public NFE nfeRegister(@NotNull NFE nfe) {

        if (nfe.getCnpj() == null) {
            throw new MessageHandler("CNPJ Deve ser informado");
        }
        if (nfe.getRazaoSocial() == null) {
            throw new MessageHandler("Razao Social Deve ser informado");
        }
        if (nfe.getEndereco() == null) {
            throw new MessageHandler("Endereço Deve ser informado");
        }
        if (nfe.getNrSerie() == null) {
            throw new MessageHandler("Número de Série Deve ser informado");
        }
        if (nfe.getValor() == 0) {
            throw new MessageHandler("Valor Deve ser informado");
        }

        return nfeRepository.save(nfe);
    }

    public List<NFE> nfeAllList() {
        return nfeRepository.findAll();
    }

    public Optional<NFE> nfeFindOne(Long id) {
        return nfeRepository.findById(id);
    }

    public void nfeDelete(Long id) {
        nfeRepository.deleteById(id);
    }

    public NFE nfeUpdate(Long id, NfeDTO nfeDTO) {
        NFE nfe = nfeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("NFE NOT FOUND"));

        if (nfeDTO.getCnpj() != null) {
            nfe.setCnpj(nfeDTO.getCnpj());
        }
        if (nfeDTO.getEndereco() != null) {
            nfe.setEndereco(nfeDTO.getEndereco());
        }

        if (nfeDTO.getNrSerie() != null) {
            nfe.setNrSerie(nfeDTO.getNrSerie());
        }
        if (nfeDTO.getRazaoSocial() != null) {
            nfe.setRazaoSocial(nfeDTO.getRazaoSocial());
        }
        if (nfeDTO.getValor() != 0) {
            nfe.setValor(nfeDTO.getValor());
        }

        return nfeRepository.save(nfe);
    }


}
