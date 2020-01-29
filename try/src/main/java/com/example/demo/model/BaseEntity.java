package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_gen")
    protected Long id;
    private String createdBy;
    private String createdAt;
    private String modifiedBy;
    private String modifiedAt;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }
}
