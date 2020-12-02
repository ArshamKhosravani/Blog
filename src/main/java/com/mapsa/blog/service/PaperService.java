package com.mapsa.blog.service;

import com.mapsa.blog.model.PaperEntity;
import com.mapsa.blog.repository.PaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperService {
    @Autowired
    private PaperRepository paperRepository;

    public void addPaper(PaperEntity paperEntity) {
        paperRepository.save(paperEntity);
    }

    public void removePaper(long id) {
        paperRepository.deleteById(id);
    }

    public List<PaperEntity> getAllPapers() {
        return paperRepository.findAll();
    }

    public PaperEntity getPaper(long id){
        return paperRepository.findById(id).get();
    }

    public void updatePaper(long id, PaperEntity paperEntity) {
        paperRepository.deleteById(id);
        paperRepository.save(paperEntity);
    }


}
