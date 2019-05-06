/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Nichiket
 */
@Entity
public class Staff {
    @Id
    private String busid;
    private String name;
    private String phone;
    public Staff() {
    }

    public String getBusid() {
        return busid;
    }

    public Staff(String busid, String name, String phone) {
        this.busid = busid;
        this.name = name;
        this.phone = phone;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
