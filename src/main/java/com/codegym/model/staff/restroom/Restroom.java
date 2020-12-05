package com.codegym.model.staff.restroom;

import com.codegym.model.staff.restroom.category.CategoryRoom;

import javax.persistence.*;

@Entity
public class Restroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer  idRestroom;
    private String nameRoom;
    @ManyToOne
    @JoinColumn(name = "categoryRoom_id")
    private CategoryRoom categoryRoom;

    public Restroom() {
    }

    public Restroom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public Integer getIdRestroom() {
        return idRestroom;
    }

    public void setIdRestroom(Integer idRestroom) {
        this.idRestroom = idRestroom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }
}
