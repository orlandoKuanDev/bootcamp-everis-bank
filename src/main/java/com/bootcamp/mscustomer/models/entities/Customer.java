package com.bootcamp.mscustomer.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collation = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private String id;
    @NotBlank
    @Size(max = 140)
    private String name;
    private String code;
    //@NaturalId
    private String iban;
    private String names;
    private String surname;
    private String phone;
    private String address;
    @Valid
    private CustomerType customerType;
}