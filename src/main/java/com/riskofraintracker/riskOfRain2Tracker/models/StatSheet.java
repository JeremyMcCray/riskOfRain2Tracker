package com.riskofraintracker.riskOfRain2Tracker.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class StatSheet {

    public StatSheet(){}
    @Id
    @GeneratedValue
    Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Fields fields;

    @OneToOne
    private PlayerInfo playerInfo;

//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @XmlElement(name = "fields")
    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    @Override
    public String toString() {
        return "\n StatSheet{" +
                "fields=" + fields.toString() +
                '}';
    }
}