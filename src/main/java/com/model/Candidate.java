package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String candidate;
    private int votes;

    // Getters
    public int getId() { return id; }
    public String getCandidate() { return candidate; }
    public int getVotes() { return votes; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setCandidate(String candidate) { this.candidate = candidate; }
    public void setVotes(int votes) { this.votes = votes; }
}
