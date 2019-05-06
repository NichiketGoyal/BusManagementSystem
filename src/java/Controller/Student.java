/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Nichiket
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", password=" + password + '}';
    }

    public Student(){
        super();
    }
    
    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public Student(int id,String name, String password ){
        this.name = name;
        this.password = password;
        this.id=id;
    }
    
    
    
}
