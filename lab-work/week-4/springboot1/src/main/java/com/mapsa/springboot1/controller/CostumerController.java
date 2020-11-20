package com.mapsa.springboot1.controller;

import com.mapsa.springboot1.model.Costumer;
import com.mapsa.springboot1.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/costumer")
public class CostumerController {

    @Autowired
    private CostumerRepository costumerRepository;

    @GetMapping
    private List<Costumer> costumers() {
        return costumerRepository.findAll();
    }

    @PostMapping
    private void save(@RequestBody Costumer costumer) {
        costumerRepository.save(costumer);
    }

    @PutMapping
    private Costumer put(@RequestBody Costumer costumer) {
        return costumerRepository.saveAndFlush(costumer);
    }

    @DeleteMapping
    private void delete(@RequestBody Costumer costumer) {
        costumerRepository.delete(costumer);
    }

    @PatchMapping
    private Costumer patch(@RequestBody Costumer costumer) {
        costumerRepository.delete(costumer);
        return costumerRepository.save(costumer);
    }

}
