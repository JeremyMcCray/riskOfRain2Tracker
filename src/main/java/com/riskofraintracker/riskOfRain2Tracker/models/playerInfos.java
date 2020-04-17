package com.riskofraintracker.riskOfRain2Tracker.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class playerInfos {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private PlayerInfo playerInfo;

    @OneToOne(cascade = CascadeType.ALL)
    private RunReport runReport;

//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @XmlElement(name = "PlayerInfo")
    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RunReport getRunReport() {
        return runReport;
    }

    public void setRunReport(RunReport runReport) {
        this.runReport = runReport;
    }

    @Override
    public String toString() {
        return "PlayerInfos{" +
                "playerInfo=" + playerInfo +
//                ", additionalProperties=" + additionalProperties +
                '}';
    }
}