//package com.example.demo_poc_crud;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BasicRest {
//    public String []Name = {"Anu","Ram","Charu","Sakthi"};
//
//    @GetMapping("/get")
//    public String[] getName() {
//        return Name;
//    }
//
//    @GetMapping("/particular/{index}")
//    public String getonename(@PathVariable("index") int index){
//        return Name[index];
//    }
//    @DeleteMapping("/remove/{index}")
//    public String invaliate (@PathVariable("index") int index){
//        return Name[index];
//    }
//}
//
