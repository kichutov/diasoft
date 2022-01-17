package com.kichutov.diasoft.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="pass")
    private String pass;
    @Column(name="mail")
    private String mail;

}



