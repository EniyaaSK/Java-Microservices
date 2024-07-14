package com.example.demo_poc_crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EkartService {
    @Autowired
    EkartRemote remote;

    public List<Ekart> implementFindDoc(int exeId) {
        return remote.findAllByExecutiveId(exeId);
    }

    public Ekart implementFindById(int patientID){
        return remote.findById(patientID).orElse(new Ekart());
    }

    public void implementDelete(int id) {

        remote.deleteById(id);
    }

    public List<Ekart> implementFindall() {
        return remote.findAll();
    }

    public Ekart implementsave(Ekart ekart) {

        return remote.save(ekart);
    }


}
//   public List<Ekart> findParcelsByExecutive(String executiveName) {
//        return remote.findByExecutiveName(executiveName);
//    }
//    public List<Ekart> findParcelsByAddress(String receiverAddress) {
//        return remote.findByReceiverAddress(receiverAddress);
//    }
