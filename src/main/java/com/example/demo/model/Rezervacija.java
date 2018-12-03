package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
public class Rezervacija implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long idSmestaja;
    Date startDate;
    Date endDate;
    boolean confirmed = false;
    @ManyToOne
    User agent;


    public Rezervacija(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSmestaja() {
        return idSmestaja;

    }

    public void setIdSmestaja(long idSmestaja) {
        this.idSmestaja = idSmestaja;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public boolean isConfirmed() { return confirmed; }

    public void setConfirmed(boolean confirmed) { this.confirmed = confirmed; }

    @Override
    public String toString() {
        return "Rezervacija{" +
                "id=" + id +
                ", idSmestaja=" + idSmestaja +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", confirmed=" + confirmed +
                '}';
    }
    public User getAgent() {
        return agent;
    }

    public void setAgent(User agent) {
        this.agent = agent;
    }

}
