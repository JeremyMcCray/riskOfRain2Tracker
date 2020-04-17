package com.riskofraintracker.riskOfRain2Tracker.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;


@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ItemStacks {

    public ItemStacks(){}
    @Id
    @GeneratedValue
    Long id;

    private String Syringe;
    private String critGlasses;
    private String attackSpeedOnCrit;
    private String sprintOutOfCombat;
    private String personalShield;
    private String bandolier;
    private String stunChanceOnHit;
    private String bossDamageBonus;
    private String energizedOnEquipmentUse;
    private String nearbyDamageBonus;
    private String monsoonPlayerHelper;

    @OneToOne(cascade = CascadeType.ALL)
    private PlayerInfo playerInfo;

//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @XmlElement(name = "Syringe")
    public String getSyringe() {
        return Syringe;
    }

    public void setSyringe(String syringe) {
        this.Syringe = syringe;
    }

    @XmlElement(name = "CritGlasses")
    public String getCritGlasses() { return critGlasses; }

    public void setCritGlasses(String critGlasses) { this.critGlasses = critGlasses; }

    @XmlElement(name = "AttackSpeedOnCrit")
    public String getAttackSpeedOnCrit() {
        return attackSpeedOnCrit;
    }

    public void setAttackSpeedOnCrit(String attackSpeedOnCrit) {
        this.attackSpeedOnCrit = attackSpeedOnCrit;
    }

    @XmlElement(name = "SprintOutOfCombat")
    public String getSprintOutOfCombat() {
        return sprintOutOfCombat;
    }

    public void setSprintOutOfCombat(String sprintOutOfCombat) {
        this.sprintOutOfCombat = sprintOutOfCombat;
    }

    @XmlElement(name = "PersonalShield")
    public String getPersonalShield() {
        return personalShield;
    }

    public void setPersonalShield(String personalShield) {
        this.personalShield = personalShield;
    }

    @XmlElement(name = "Bandolier")
    public String getBandolier() {
        return bandolier;
    }

    public void setBandolier(String bandolier) {
        this.bandolier = bandolier;
    }

    @XmlElement(name = "StunChanceOnHit")
    public String getStunChanceOnHit() {
        return stunChanceOnHit;
    }

    public void setStunChanceOnHit(String stunChanceOnHit) {
        this.stunChanceOnHit = stunChanceOnHit;
    }

    @XmlElement(name = "BossDamageBonus")
    public String getBossDamageBonus() {
        return bossDamageBonus;
    }

    public void setBossDamageBonus(String bossDamageBonus) {
        this.bossDamageBonus = bossDamageBonus;
    }

    @XmlElement(name = "EnergizedOnEquipmentUse")
    public String getEnergizedOnEquipmentUse() {
        return energizedOnEquipmentUse;
    }

    public void setEnergizedOnEquipmentUse(String energizedOnEquipmentUse) {
        this.energizedOnEquipmentUse = energizedOnEquipmentUse;
    }
    @XmlElement(name = "NearbyDamageBonus")
    public String getNearbyDamageBonus() {
        return nearbyDamageBonus;
    }

    public void setNearbyDamageBonus(String nearbyDamageBonus) {
        this.nearbyDamageBonus = nearbyDamageBonus;
    }

    @XmlElement(name = "MonsoonPlayerHelper")
    public String getMonsoonPlayerHelper() {
        return monsoonPlayerHelper;
    }

    public void setMonsoonPlayerHelper(String monsoonPlayerHelper) {
        this.monsoonPlayerHelper = monsoonPlayerHelper;
    }
//
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
//        this.additionalProperties = additionalProperties;
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
        return "\n ItemStacks{" +
                "syringe='" + Syringe + '\n' +
                ", critGlasses='" + critGlasses + '\n' +
                ", attackSpeedOnCrit='" + attackSpeedOnCrit + '\n' +
                ", sprintOutOfCombat='" + sprintOutOfCombat + '\n' +
                ", personalShield='" + personalShield + '\n' +
                ", bandolier='" + bandolier + '\n' +
                ", stunChanceOnHit='" + stunChanceOnHit + '\n' +
                ", bossDamageBonus='" + bossDamageBonus + '\n' +
                ", energizedOnEquipmentUse='" + energizedOnEquipmentUse + '\n' +
                ", nearbyDamageBonus='" + nearbyDamageBonus + '\n' +
                ", monsoonPlayerHelper='" + monsoonPlayerHelper + '\n' +
//                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
