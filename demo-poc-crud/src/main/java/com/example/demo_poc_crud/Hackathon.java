//package com.example.demo_poc_crud;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/hack")
//public class Hackathon {
//    public List<String> Student = new ArrayList<>();
//
//    @PostConstruct
//
//    public void name() {
//        Student.add("Sneha");
//        Student.add("Ram");
//        Student.add("Anu");
//
//    }
//
//    @PutMapping("/Change/{index}")
//    public String update(@PathVariable("index") int index, @RequestBody String alternate) {
//        Student.set(index, alternate);
//        return alternate + "has replace at" + index;
//    }
//    @PostMapping ("/newadd")
//    public String add (@RequestBody String newParticipant) {
//        Student.add(newParticipant);
//        return newParticipant + "has been added";
//    }
//    @DeleteMapping("/remove/{index}")
//    public String delete (@PathVariable("index") int index){
//        String response= Student.get(index)+"has delete";
//        Student.remove(index);
//        return response;
//    }
//}