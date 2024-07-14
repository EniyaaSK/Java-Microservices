package com.example.executive_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/executive")
public class ExecutiveMapping {
    @Autowired
    ExecutiveService service;

    @PostMapping("/add")
    public Executive callSave(@RequestBody Executive executive){
        return service.implementSave(executive);
    }

    @GetMapping("/{id}")
    public Executive callOne(@PathVariable("id") int id){
        return service.implementFindByID(id);
    }

    @GetMapping("/")
    public List<Executive> callFetch(){
        return service.implementFindAll();
    }
    @PutMapping("/update")
    public Executive update(@RequestBody Executive executive){
        return service.implementSave (executive) ;
    }
}
