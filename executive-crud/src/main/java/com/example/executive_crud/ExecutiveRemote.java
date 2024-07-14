package com.example.executive_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExecutiveRemote extends JpaRepository<Executive,Integer> {

}