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
public class schedule {
    @Id
    private String Busid;
    private String source;
    private String destination;

    public schedule(String Busid, String source, String destination) {
        this.Busid = Busid;
        this.source = source;
        this.destination = destination;
    }

    public schedule() {
    }

    public String getBusid() {
        return Busid;
    }

    public void setBusid(String Busid) {
        this.Busid = Busid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
