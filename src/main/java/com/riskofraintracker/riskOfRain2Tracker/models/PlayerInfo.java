package com.riskofraintracker.riskOfRain2Tracker.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.xml.bind.annotation.*;


@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PlayerInfo {

    public PlayerInfo(){}
    @Id
    @GeneratedValue
    Long id;

    private String name;
    private String bodyName;
    private String killerBodyName;

    @OneToOne(cascade = CascadeType.ALL)
    private StatSheet statSheet;

    @OneToOne(cascade = CascadeType.ALL)
    private playerInfos playerInfos;

    private String itemAcquisitionOrder;

    @OneToOne(cascade = CascadeType.ALL)
    private ItemStacks itemStacks;

    private String equipment;
    private String finalMessageToken;
    private String localPlayerIndex;
    private String userProfileFileName;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodyName() {
        return bodyName;
    }

    public void setBodyName(String bodyName) {
        this.bodyName = bodyName;
    }

    public String getKillerBodyName() {
        return killerBodyName;
    }

    public void setKillerBodyName(String killerBodyName) {
        this.killerBodyName = killerBodyName;
    }


    @XmlElement(name = "statSheet")
    public StatSheet getStatSheet() {
        return statSheet;
    }

    public void setStatSheet(StatSheet statSheet) {
        this.statSheet = statSheet;
    }

    public String getItemAcquisitionOrder() {
        return itemAcquisitionOrder;
    }

    public void setItemAcquisitionOrder(String itemAcquisitionOrder) {
        this.itemAcquisitionOrder = itemAcquisitionOrder;
    }


    @XmlElement(name = "itemStacks")
    public ItemStacks getItemStacks() {
        return itemStacks;
    }

    public void setItemStacks(ItemStacks itemStacks) {
        this.itemStacks = itemStacks;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFinalMessageToken() {
        return finalMessageToken;
    }

    public void setFinalMessageToken(String finalMessageToken) {
        this.finalMessageToken = finalMessageToken;
    }

    public String getLocalPlayerIndex() {
        return localPlayerIndex;
    }

    public void setLocalPlayerIndex(String localPlayerIndex) {
        this.localPlayerIndex = localPlayerIndex;
    }

    public String getUserProfileFileName() {
        return userProfileFileName;
    }

    public void setUserProfileFileName(String userProfileFileName) {
        this.userProfileFileName = userProfileFileName;
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

    public com.riskofraintracker.riskOfRain2Tracker.models.playerInfos getPlayerInfos() {
        return playerInfos;
    }

    public void setPlayerInfos(com.riskofraintracker.riskOfRain2Tracker.models.playerInfos playerInfos) {
        this.playerInfos = playerInfos;
    }

    public String toString() {
        return "\n playerInfo{" +
                "name='" + name + '\n' +
                ", bodyName='" + bodyName + '\n' +
                ", killerBodyName='" + killerBodyName + '\n' +
                ", statSheet=" + statSheet.toString() +
                ", itemAcquisitionOrder='" + itemAcquisitionOrder + '\n' +
                ", itemStacks=" + itemStacks.toString() +
                "\n , equipment='" + equipment + '\n' +
                ", finalMessageToken='" + finalMessageToken + '\n' +
                ", localPlayerIndex='" + localPlayerIndex + '\n' +
                ", userProfileFileName='" + userProfileFileName + '\n' +
//                ", additionalProperties=" + additionalProperties +
                '}';
    }
}