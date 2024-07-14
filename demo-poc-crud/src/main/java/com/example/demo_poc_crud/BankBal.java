//package com.example.demo_poc_crud;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/Bank")
//public class BankBal {
//    private int[] Amount = {
//            46220, 9420, 38500, 1246, 465300, 7512, 90000, 10500, 14000, 25630, 9000, 8000, 11000, 1500, 3000, 7000, 4000, 2500, 12000, 5000
//    };
//    ///Get mapping - Getting all values
//    @GetMapping ("/get")
//    public int[] getAmount(){
//        return Amount;
//    }
//    ///Get mapping - Getting the particular value
//    @GetMapping("/getOne/{index}")
//    public int getOneAmount(@PathVariable("index") int index){
//        return Amount[index];
//    }
//    ///Put mapping - to update the value
//    @PutMapping("/update")
//    public void updatebalance(){
//        for(int i=0; i < Amount.length; i++){
//            if (Amount[i] >= 5000 && Amount[i] <= 9999){
//                Amount[i] = (int)(Amount[i] - (Amount[i] * 0.03));
//            } else if (Amount[i] >= 1000 && Amount[i] <= 4999) {
//                Amount[i] = (int)(Amount[i] - (Amount[i] * 0.05));
//            }
//            return;
//        }
//    }
//}
