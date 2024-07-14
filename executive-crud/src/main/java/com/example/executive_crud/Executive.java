package com.example.executive_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Executive {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int executiveId;
        private String executiveName;
        private String executiveContact;
        private int servicePin;
        transient private List<Ekart> myEkarts;
    }

