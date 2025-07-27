package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String name;
    private String password;
    private String phone;
    private String status;
    private String role;

    // Getters
    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getPhone() { return phone; }
    public String getStatus() { return status; }
    public String getRole() { return role; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setName(String name) { this.name = name; }
    public void setPassword(String password) { this.password = password; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setStatus(String status) { this.status = status; }
    public void setRole(String role) { this.role = role; }
}
