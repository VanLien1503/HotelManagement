package com.codegym.model.user;

import com.codegym.model.staff.restroom.Restroom;

import javax.persistence.*;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private String nameUser;
    private String addressUser;
    private Integer phoneUser;


    @ManyToOne
    @JoinColumn(name = "restroom_id")
    private Restroom restroom;
    public User() {
    }

    public User(String nameUser, String addressUser, Integer phoneUser, Restroom restroom) {
        this.nameUser = nameUser;
        this.addressUser = addressUser;
        this.phoneUser = phoneUser;
        this.restroom = restroom;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getAddressUser() {
        return addressUser;
    }

    public void setAddressUser(String addressUser) {
        this.addressUser = addressUser;
    }

    public Integer getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(Integer phoneUser) {
        this.phoneUser = phoneUser;
    }

    public Restroom getRestroom() {
        return restroom;
    }

    public void setRestroom(Restroom restroom) {
        this.restroom = restroom;
    }
}
