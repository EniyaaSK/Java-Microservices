package com.example.executive_crud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ekart {
    private int parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private int receiverContact;
    private int productprice;
    private String productStatus;
    private String executiveName;
    private int executiveId;

}
