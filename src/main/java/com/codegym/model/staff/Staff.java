package com.codegym.model.staff;

import com.codegym.model.staff.department.Department;

import javax.persistence.*;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStaff;
    private String nameStaff;
    private Integer phoneStaff;
    private String addressStaff;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Staff() {
    }

    public Staff(String nameStaff, Integer phoneStaff, String addressStaff, Department department) {
        this.nameStaff = nameStaff;
        this.phoneStaff = phoneStaff;
        this.addressStaff = addressStaff;
        this.department = department;
    }

    public Integer getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(Integer idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public Integer getPhoneStaff() {
        return phoneStaff;
    }

    public void setPhoneStaff(Integer phoneStaff) {
        this.phoneStaff = phoneStaff;
    }

    public String getAddressStaff() {
        return addressStaff;
    }

    public void setAddressStaff(String addressStaff) {
        this.addressStaff = addressStaff;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
