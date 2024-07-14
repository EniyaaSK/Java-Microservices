package com.example.executive_crud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor",url = "http://localhost:1234/ekart")
public interface FiegnCommunicator {

    @GetMapping("/byExecutive/{exeId}")
    public List<Ekart> callekarts(@PathVariable("exeId") int Id);


}
