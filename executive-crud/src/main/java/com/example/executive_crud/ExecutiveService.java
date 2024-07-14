package com.example.executive_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutiveService {
    @Autowired
    ExecutiveRemote remote;

    @Autowired
    FiegnCommunicator fiegnCommunicator;

    public Executive implementFindByID(int id){
        Executive obj = remote.findById(id).orElse(new Executive());
        if(obj!=null){
            obj.setMyEkarts (fiegnCommunicator.callekarts (obj.getExecutiveId()));
        }
        return obj;
    }

    public List<Executive> implementFindAll(){
        return remote.findAll();
    }

    public Executive implementSave(Executive executive){
        return remote.save(executive);
    }


}


