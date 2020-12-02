package com.mapsa.blog.controller;

import com.mapsa.blog.model.PaperEntity;
import com.mapsa.blog.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaperController {
    @Autowired
    private PaperService paperService;

    @GetMapping("/papers/{id}/")
    public PaperEntity getPaper(long id) {
        return paperService.getPaper(id);
    }

    @GetMapping("/papers/")
    public List<PaperEntity> getAllPapers() {
        return paperService.getAllPapers();
    }

    @PostMapping("/papers/")
    public void addPaper(PaperEntity paperEntity) {
        paperService.addPaper(paperEntity);
    }

    @DeleteMapping("/papers/{id}/")
    public void deletePaper(long id) {
        paperService.removePaper(id);
    }

    @PutMapping("/papers/{id}/")
    public void updatePaper(long id,PaperEntity paperEntity){
        paperService.updatePaper(id,paperEntity);
    }
}
