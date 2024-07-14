package com.example.demo_poc_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EkartRemote extends JpaRepository <Ekart,Integer> {
    List<Ekart>findAllByExecutiveId(int exeId);


}
