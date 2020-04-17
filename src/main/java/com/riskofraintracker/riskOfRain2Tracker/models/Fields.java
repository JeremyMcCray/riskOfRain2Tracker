package com.riskofraintracker.riskOfRain2Tracker.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;


@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Fields {

    public Fields(){}
    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    private StatSheet statSheet;

    private String totalGamesPlayed;
    private String totalTimeAlive;
    private String totalKills;
    private String totalDeaths;
    private String totalDamageDealt;
    private String totalDamageTaken;
    private String totalHealthHealed;
    private String highestDamageDealt;
    private String highestLevel;
    private String totalGoldCollected;
    private String maxGoldCollected;
    private String totalDistanceTraveled;
    private String totalItemsCollected;
    private String highestItemsCollected;
    private String totalStagesCompleted;
    private String highestStagesCompleted;
    private String totalPurchases;
    private String highestPurchases;
    private String totalGoldPurchases;
    private String highestGoldPurchases;
    private String totalBloodPurchases;
    private String highestBloodPurchases;
    private String totalTier1Purchases;
    private String highestTier1Purchases;
    private String totalDronesPurchased;
    private String totalGreenSoupsPurchased;
    private String totalEliteKills;
    private String totalTeleporterBossKillsWitnessed;

    private String totalTimeAliveMercBody;
    private String longestRunMercBody;
    private String damageDealtToBeetleBody;
    private String damageDealtToBeetleGuardBody;
    private String damageDealtToBisonBody;
    private String damageDealtToExplosivePotDestructibleBody;
    private String damageDealtToGolemBody;
    private String damageDealtToGreaterWispBody;
    private String damageDealtToImpBody;
    private String damageDealtToLemurianBody;
    private String damageDealtToMagmaWormBody;
    private String damageDealtToTitanBody;
    private String damageDealtToWispBody;
    private String damageDealtAsMercBody;
    private String damageTakenFromBeetleBody;
    private String damageTakenFromBisonBody;
    private String damageTakenFromExplosivePotDestructibleBody;
    private String damageTakenFromGreaterWispBody;
    private String damageTakenFromLemurianBody;
    private String damageTakenFromMagmaWormBody;
    private String damageTakenFromTitanBody;
    private String damageTakenFromWispBody;
    private String damageTakenAsMercBody;
    private String killsAgainstBeetleBody;
    private String killsAgainstBeetleGuardBody;
    private String killsAgainstExplosivePotDestructibleBody;
    private String killsAgainstGolemBody;
    private String killsAgainstGreaterWispBody;
    private String killsAgainstImpBody;
    private String killsAgainstLemurianBody;
    private String killsAgainstMagmaWormBody;
    private String killsAgainstTitanBody;
    private String killsAgainstWispBody;
    private String killsAgainstEliteBeetleBody;
    private String killsAgainstEliteLemurianBody;
    private String deathsFromWispBody;
    private String killsAsMercBody;
    private String deathsAsMercBody;
    private String timesPickedMercBody;
    private String totalCollectedSyringe;
    private String totalCollectedCritGlasses;
    private String totalCollectedAttackSpeedOnCrit;
    private String totalCollectedSprintOutOfCombat;
    private String totalCollectedPersonalShield;
    private String totalCollectedBandolier;
    private String totalCollectedStunChanceOnHit;
    private String totalCollectedBossDamageBonus;
    private String totalCollectedEnergizedOnEquipmentUse;
    private String totalCollectedNearbyDamageBonus;
    private String totalCollectedMonsoonPlayerHelper;
    private String highestCollectedSyringe;
    private String highestCollectedCritGlasses;
    private String highestCollectedAttackSpeedOnCrit;
    private String highestCollectedSprintOutOfCombat;
    private String highestCollectedPersonalShield;
    private String highestCollectedBandolier;
    private String highestCollectedStunChanceOnHit;
    private String highestCollectedBossDamageBonus;
    private String highestCollectedEnergizedOnEquipmentUse;
    private String highestCollectedNearbyDamageBonus;
    private String highestCollectedMonsoonPlayerHelper;
    private String totalTimeHeldSaw;
    private String totalTimesFiredSaw;
    private String totalTimesVisitedFrozenwall;
    private String totalTimesVisitedGolemplains;
    private String totalTimesVisitedGoolake;
    private String totalTimesClearedGolemplains;
    private String totalTimesClearedGoolake;


@XmlElement(name = "totalGamesPlayed")
    public String getTotalGamesPlayed() {
        return totalGamesPlayed;
    }


    public void setTotalGamesPlayed(String totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }
    
@XmlElement(name = "totalTimeAlive")
    public String getTotalTimeAlive() {
        return totalTimeAlive;
    }
    

    public void setTotalTimeAlive(String totalTimeAlive) {
        this.totalTimeAlive = totalTimeAlive;
    }
    
@XmlElement(name = "totalKills")
    public String getTotalKills() {
        return totalKills;
    }
    

    public void setTotalKills(String totalKills) {
        this.totalKills = totalKills;
    }
    
@XmlElement(name = "totalDeaths")
    public String getTotalDeaths() {
        return totalDeaths;
    }
    

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }
    
@XmlElement(name = "totalDamageDealt")
    public String getTotalDamageDealt() {
        return totalDamageDealt;
    }
    

    public void setTotalDamageDealt(String totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }
    
@XmlElement(name = "totalDamageTaken")
    public String getTotalDamageTaken() {
        return totalDamageTaken;
    }
    

    public void setTotalDamageTaken(String totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }
    
@XmlElement(name = "totalHealthHealed")
    public String getTotalHealthHealed() {
        return totalHealthHealed;
    }
    

    public void setTotalHealthHealed(String totalHealthHealed) {
        this.totalHealthHealed = totalHealthHealed;
    }
    
@XmlElement(name = "highestDamageDealt")
    public String getHighestDamageDealt() {
        return highestDamageDealt;
    }
    

    public void setHighestDamageDealt(String highestDamageDealt) {
        this.highestDamageDealt = highestDamageDealt;
    }
    
@XmlElement(name = "highestLevel")
    public String getHighestLevel() {
        return highestLevel;
    }
    

    public void setHighestLevel(String highestLevel) {
        this.highestLevel = highestLevel;
    }
    
@XmlElement(name = "totalGoldCollected")
    public String getTotalGoldCollected() {
        return totalGoldCollected;
    }
    

    public void setTotalGoldCollected(String totalGoldCollected) {
        this.totalGoldCollected = totalGoldCollected;
    }
    
@XmlElement(name = "maxGoldCollected")
    public String getMaxGoldCollected() {
        return maxGoldCollected;
    }
    

    public void setMaxGoldCollected(String maxGoldCollected) {
        this.maxGoldCollected = maxGoldCollected;
    }
    
@XmlElement(name = "totalDistanceTraveled")
    public String getTotalDistanceTraveled() {
        return totalDistanceTraveled;
    }
    

    public void setTotalDistanceTraveled(String totalDistanceTraveled) {
        this.totalDistanceTraveled = totalDistanceTraveled;
    }
    
@XmlElement(name = "totalItemsCollected")
    public String getTotalItemsCollected() {
        return totalItemsCollected;
    }
    

    public void setTotalItemsCollected(String totalItemsCollected) {
        this.totalItemsCollected = totalItemsCollected;
    }
    
@XmlElement(name = "highestItemsCollected")
    public String getHighestItemsCollected() {
        return highestItemsCollected;
    }
    

    public void setHighestItemsCollected(String highestItemsCollected) {
        this.highestItemsCollected = highestItemsCollected;
    }
    
@XmlElement(name = "totalStagesCompleted")
    public String getTotalStagesCompleted() {
        return totalStagesCompleted;
    }
    

    public void setTotalStagesCompleted(String totalStagesCompleted) {
        this.totalStagesCompleted = totalStagesCompleted;
    }
    
@XmlElement(name = "highestStagesCompleted")
    public String getHighestStagesCompleted() {
        return highestStagesCompleted;
    }
    

    public void setHighestStagesCompleted(String highestStagesCompleted) {
        this.highestStagesCompleted = highestStagesCompleted;
    }
    
@XmlElement(name = "totalPurchases")
    public String getTotalPurchases() {
        return totalPurchases;
    }
    

    public void setTotalPurchases(String totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
    
@XmlElement(name = "highestPurchases")
    public String getHighestPurchases() {
        return highestPurchases;
    }
    

    public void setHighestPurchases(String highestPurchases) {
        this.highestPurchases = highestPurchases;
    }
    
@XmlElement(name = "totalGoldPurchases")
    public String getTotalGoldPurchases() {
        return totalGoldPurchases;
    }
    

    public void setTotalGoldPurchases(String totalGoldPurchases) {
        this.totalGoldPurchases = totalGoldPurchases;
    }
    
@XmlElement(name = "highestGoldPurchases")
    public String getHighestGoldPurchases() {
        return highestGoldPurchases;
    }
    

    public void setHighestGoldPurchases(String highestGoldPurchases) {
        this.highestGoldPurchases = highestGoldPurchases;
    }
    
@XmlElement(name = "totalBloodPurchases")
    public String getTotalBloodPurchases() {
        return totalBloodPurchases;
    }
    

    public void setTotalBloodPurchases(String totalBloodPurchases) {
        this.totalBloodPurchases = totalBloodPurchases;
    }
    
@XmlElement(name = "highestBloodPurchases")
    public String getHighestBloodPurchases() {
        return highestBloodPurchases;
    }
    

    public void setHighestBloodPurchases(String highestBloodPurchases) {
        this.highestBloodPurchases = highestBloodPurchases;
    }
    
@XmlElement(name = "totalTier1Purchases")
    public String getTotalTier1Purchases() {
        return totalTier1Purchases;
    }
    

    public void setTotalTier1Purchases(String totalTier1Purchases) {
        this.totalTier1Purchases = totalTier1Purchases;
    }
    
@XmlElement(name = "highestTier1Purchases")
    public String getHighestTier1Purchases() {
        return highestTier1Purchases;
    }
    

    public void setHighestTier1Purchases(String highestTier1Purchases) {
        this.highestTier1Purchases = highestTier1Purchases;
    }
    
@XmlElement(name = "totalDronesPurchased")
    public String getTotalDronesPurchased() {
        return totalDronesPurchased;
    }
    

    public void setTotalDronesPurchased(String totalDronesPurchased) {
        this.totalDronesPurchased = totalDronesPurchased;
    }
    
@XmlElement(name = "totalGreenSoupsPurchased")
    public String getTotalGreenSoupsPurchased() {
        return totalGreenSoupsPurchased;
    }
    

    public void setTotalGreenSoupsPurchased(String totalGreenSoupsPurchased) {
        this.totalGreenSoupsPurchased = totalGreenSoupsPurchased;
    }
    
@XmlElement(name = "totalEliteKills")
    public String getTotalEliteKills() {
        return totalEliteKills;
    }
    

    public void setTotalEliteKills(String totalEliteKills) {
        this.totalEliteKills = totalEliteKills;
    }
    
@XmlElement(name = "totalTeleporterBossKillsWitnessed")
    public String getTotalTeleporterBossKillsWitnessed() {
        return totalTeleporterBossKillsWitnessed;
    }
    

    public void setTotalTeleporterBossKillsWitnessed(String totalTeleporterBossKillsWitnessed) {
        this.totalTeleporterBossKillsWitnessed = totalTeleporterBossKillsWitnessed;
    }
    
    @XmlElement(name = "totalTimeAlive.MercBody")
    public String getTotalTimeAliveMercBody() {
        return totalTimeAliveMercBody;
    }
    

    public void setTotalTimeAliveMercBody(String totalTimeAliveMercBody) {
        this.totalTimeAliveMercBody = totalTimeAliveMercBody;
    }
    
@XmlElement(name = "longestRun.MercBody")
    public String getLongestRunMercBody() {
        return longestRunMercBody;
    }
    

    public void setLongestRunMercBody(String longestRunMercBody) {
        this.longestRunMercBody = longestRunMercBody;
    }
    
@XmlElement(name = "damageDealtTo.BeetleBody")
    public String getDamageDealtToBeetleBody() {
        return damageDealtToBeetleBody;
    }
    

    public void setDamageDealtToBeetleBody(String damageDealtToBeetleBody) {
        this.damageDealtToBeetleBody = damageDealtToBeetleBody;
    }
    
@XmlElement(name = "damageDealtTo.BeetleGuardBody")
    public String getDamageDealtToBeetleGuardBody() {
        return damageDealtToBeetleGuardBody;
    }
    

    public void setDamageDealtToBeetleGuardBody(String damageDealtToBeetleGuardBody) {
        this.damageDealtToBeetleGuardBody = damageDealtToBeetleGuardBody;
    }
    
@XmlElement(name = "damageDealtTo.BisonBody")
    public String getDamageDealtToBisonBody() {
        return damageDealtToBisonBody;
    }
    

    public void setDamageDealtToBisonBody(String damageDealtToBisonBody) {
        this.damageDealtToBisonBody = damageDealtToBisonBody;
    }
    
@XmlElement(name = "damageDealtTo.ExplosivePotDestructibleBody")
    public String getDamageDealtToExplosivePotDestructibleBody() {
        return damageDealtToExplosivePotDestructibleBody;
    }
    

    public void setDamageDealtToExplosivePotDestructibleBody(String damageDealtToExplosivePotDestructibleBody) {
        this.damageDealtToExplosivePotDestructibleBody = damageDealtToExplosivePotDestructibleBody;
    }
    
@XmlElement(name = "damageDealtTo.GolemBody")
    public String getDamageDealtToGolemBody() {
        return damageDealtToGolemBody;
    }
    

    public void setDamageDealtToGolemBody(String damageDealtToGolemBody) {
        this.damageDealtToGolemBody = damageDealtToGolemBody;
    }
    
@XmlElement(name = "damageDealtTo.GreaterWispBody")
    public String getDamageDealtToGreaterWispBody() {
        return damageDealtToGreaterWispBody;
    }
    

    public void setDamageDealtToGreaterWispBody(String damageDealtToGreaterWispBody) {
        this.damageDealtToGreaterWispBody = damageDealtToGreaterWispBody;
    }
    
@XmlElement(name = "damageDealtTo.ImpBody")
    public String getDamageDealtToImpBody() {
        return damageDealtToImpBody;
    }
    

    public void setDamageDealtToImpBody(String damageDealtToImpBody) {
        this.damageDealtToImpBody = damageDealtToImpBody;
    }
    
@XmlElement(name = "damageDealtTo.LemurianBody")
    public String getDamageDealtToLemurianBody() {
        return damageDealtToLemurianBody;
    }
    

    public void setDamageDealtToLemurianBody(String damageDealtToLemurianBody) {
        this.damageDealtToLemurianBody = damageDealtToLemurianBody;
    }
    
@XmlElement(name = "damageDealtTo.MagmaWormBody")
    public String getDamageDealtToMagmaWormBody() {
        return damageDealtToMagmaWormBody;
    }
    

    public void setDamageDealtToMagmaWormBody(String damageDealtToMagmaWormBody) {
        this.damageDealtToMagmaWormBody = damageDealtToMagmaWormBody;
    }
    
@XmlElement(name = "damageDealtTo.TitanBody")
    public String getDamageDealtToTitanBody() {
        return damageDealtToTitanBody;
    }
    

    public void setDamageDealtToTitanBody(String damageDealtToTitanBody) {
        this.damageDealtToTitanBody = damageDealtToTitanBody;
    }
    
@XmlElement(name = "damageDealtTo.WispBody")
    public String getDamageDealtToWispBody() {
        return damageDealtToWispBody;
    }
    

    public void setDamageDealtToWispBody(String damageDealtToWispBody) {
        this.damageDealtToWispBody = damageDealtToWispBody;
    }
    
@XmlElement(name = "damageDealtAs.MercBody")
    public String getDamageDealtAsMercBody() {
        return damageDealtAsMercBody;
    }
    

    public void setDamageDealtAsMercBody(String damageDealtAsMercBody) {
        this.damageDealtAsMercBody = damageDealtAsMercBody;
    }
    
@XmlElement(name = "damageTakenFrom.BeetleBody")
    public String getDamageTakenFromBeetleBody() {
        return damageTakenFromBeetleBody;
    }
    

    public void setDamageTakenFromBeetleBody(String damageTakenFromBeetleBody) {
        this.damageTakenFromBeetleBody = damageTakenFromBeetleBody;
    }
    
@XmlElement(name = "damageTakenFrom.BisonBody")
    public String getDamageTakenFromBisonBody() {
        return damageTakenFromBisonBody;
    }
    

    public void setDamageTakenFromBisonBody(String damageTakenFromBisonBody) {
        this.damageTakenFromBisonBody = damageTakenFromBisonBody;
    }
    
@XmlElement(name = "damageTakenFrom.ExplosivePotDestructibleBody")
    public String getDamageTakenFromExplosivePotDestructibleBody() {
        return damageTakenFromExplosivePotDestructibleBody;
    }
    

    public void setDamageTakenFromExplosivePotDestructibleBody(String damageTakenFromExplosivePotDestructibleBody) {
        this.damageTakenFromExplosivePotDestructibleBody = damageTakenFromExplosivePotDestructibleBody;
    }
    
@XmlElement(name = "damageTakenFrom.GreaterWispBody")
    public String getDamageTakenFromGreaterWispBody() {
        return damageTakenFromGreaterWispBody;
    }
    

    public void setDamageTakenFromGreaterWispBody(String damageTakenFromGreaterWispBody) {
        this.damageTakenFromGreaterWispBody = damageTakenFromGreaterWispBody;
    }
    
@XmlElement(name = "damageTakenFrom.LemurianBody")
    public String getDamageTakenFromLemurianBody() {
        return damageTakenFromLemurianBody;
    }
    

    public void setDamageTakenFromLemurianBody(String damageTakenFromLemurianBody) {
        this.damageTakenFromLemurianBody = damageTakenFromLemurianBody;
    }
    
@XmlElement(name = "damageTakenFrom.MagmaWormBody")
    public String getDamageTakenFromMagmaWormBody() {
        return damageTakenFromMagmaWormBody;
    }
    

    public void setDamageTakenFromMagmaWormBody(String damageTakenFromMagmaWormBody) {
        this.damageTakenFromMagmaWormBody = damageTakenFromMagmaWormBody;
    }
    
@XmlElement(name = "damageTakenFrom.TitanBody")
    public String getDamageTakenFromTitanBody() {
        return damageTakenFromTitanBody;
    }
    

    public void setDamageTakenFromTitanBody(String damageTakenFromTitanBody) {
        this.damageTakenFromTitanBody = damageTakenFromTitanBody;
    }
    
@XmlElement(name = "damageTakenFrom.WispBody")
    public String getDamageTakenFromWispBody() {
        return damageTakenFromWispBody;
    }
    

    public void setDamageTakenFromWispBody(String damageTakenFromWispBody) {
        this.damageTakenFromWispBody = damageTakenFromWispBody;
    }
    
@XmlElement(name = "damageTakenAs.MercBody")
    public String getDamageTakenAsMercBody() {
        return damageTakenAsMercBody;
    }
    

    public void setDamageTakenAsMercBody(String damageTakenAsMercBody) {
        this.damageTakenAsMercBody = damageTakenAsMercBody;
    }
    
@XmlElement(name = "killsAgainst.BeetleBody")
    public String getKillsAgainstBeetleBody() {
        return killsAgainstBeetleBody;
    }
    

    public void setKillsAgainstBeetleBody(String killsAgainstBeetleBody) {
        this.killsAgainstBeetleBody = killsAgainstBeetleBody;
    }
    
@XmlElement(name = "killsAgainst.BeetleGuardBody")
    public String getKillsAgainstBeetleGuardBody() {
        return killsAgainstBeetleGuardBody;
    }
    

    public void setKillsAgainstBeetleGuardBody(String killsAgainstBeetleGuardBody) {
        this.killsAgainstBeetleGuardBody = killsAgainstBeetleGuardBody;
    }
    
@XmlElement(name = "killsAgainst.ExplosivePotDestructibleBody")
    public String getKillsAgainstExplosivePotDestructibleBody() {
        return killsAgainstExplosivePotDestructibleBody;
    }
    

    public void setKillsAgainstExplosivePotDestructibleBody(String killsAgainstExplosivePotDestructibleBody) {
        this.killsAgainstExplosivePotDestructibleBody = killsAgainstExplosivePotDestructibleBody;
    }
    
@XmlElement(name = "killsAgainst.GolemBody")
    public String getKillsAgainstGolemBody() {
        return killsAgainstGolemBody;
    }
    

    public void setKillsAgainstGolemBody(String killsAgainstGolemBody) {
        this.killsAgainstGolemBody = killsAgainstGolemBody;
    }
    
@XmlElement(name = "killsAgainst.GreaterWispBody")
    public String getKillsAgainstGreaterWispBody() {
        return killsAgainstGreaterWispBody;
    }
    

    public void setKillsAgainstGreaterWispBody(String killsAgainstGreaterWispBody) {
        this.killsAgainstGreaterWispBody = killsAgainstGreaterWispBody;
    }
    
@XmlElement(name = "killsAgainst.ImpBody")
    public String getKillsAgainstImpBody() {
        return killsAgainstImpBody;
    }
    

    public void setKillsAgainstImpBody(String killsAgainstImpBody) {
        this.killsAgainstImpBody = killsAgainstImpBody;
    }
    
@XmlElement(name = "killsAgainst.LemurianBody")
    public String getKillsAgainstLemurianBody() {
        return killsAgainstLemurianBody;
    }
    

    public void setKillsAgainstLemurianBody(String killsAgainstLemurianBody) {
        this.killsAgainstLemurianBody = killsAgainstLemurianBody;
    }
    
@XmlElement(name = "killsAgainst.MagmaWormBody")
    public String getKillsAgainstMagmaWormBody() {
        return killsAgainstMagmaWormBody;
    }
    

    public void setKillsAgainstMagmaWormBody(String killsAgainstMagmaWormBody) {
        this.killsAgainstMagmaWormBody = killsAgainstMagmaWormBody;
    }
    
@XmlElement(name = "killsAgainst.TitanBody")
    public String getKillsAgainstTitanBody() {
        return killsAgainstTitanBody;
    }
    

    public void setKillsAgainstTitanBody(String killsAgainstTitanBody) {
        this.killsAgainstTitanBody = killsAgainstTitanBody;
    }
    
@XmlElement(name = "killsAgainst.WispBody")
    public String getKillsAgainstWispBody() {
        return killsAgainstWispBody;
    }
    

    public void setKillsAgainstWispBody(String killsAgainstWispBody) {
        this.killsAgainstWispBody = killsAgainstWispBody;
    }
    
@XmlElement(name = "killsAgainstElite.BeetleBody")
    public String getKillsAgainstEliteBeetleBody() {
        return killsAgainstEliteBeetleBody;
    }
    

    public void setKillsAgainstEliteBeetleBody(String killsAgainstEliteBeetleBody) {
        this.killsAgainstEliteBeetleBody = killsAgainstEliteBeetleBody;
    }
    
@XmlElement(name = "killsAgainstElite.LemurianBody")
    public String getKillsAgainstEliteLemurianBody() {
        return killsAgainstEliteLemurianBody;
    }
    

    public void setKillsAgainstEliteLemurianBody(String killsAgainstEliteLemurianBody) {
        this.killsAgainstEliteLemurianBody = killsAgainstEliteLemurianBody;
    }
    
@XmlElement(name = "deathsFrom.WispBody")
    public String getDeathsFromWispBody() {
        return deathsFromWispBody;
    }
    

    public void setDeathsFromWispBody(String deathsFromWispBody) {
        this.deathsFromWispBody = deathsFromWispBody;
    }
    
@XmlElement(name = "killsAs.MercBody")
    public String getKillsAsMercBody() {
        return killsAsMercBody;
    }
    

    public void setKillsAsMercBody(String killsAsMercBody) {
        this.killsAsMercBody = killsAsMercBody;
    }
    
@XmlElement(name = "deathsAs.MercBody")
    public String getDeathsAsMercBody() {
        return deathsAsMercBody;
    }
    

    public void setDeathsAsMercBody(String deathsAsMercBody) {
        this.deathsAsMercBody = deathsAsMercBody;
    }
    
@XmlElement(name = "timesPicked.MercBody")
    public String getTimesPickedMercBody() {
        return timesPickedMercBody;
    }
    

    public void setTimesPickedMercBody(String timesPickedMercBody) {
        this.timesPickedMercBody = timesPickedMercBody;
    }
    
@XmlElement(name = "totalCollected.Syringe")
    public String getTotalCollectedSyringe() {
        return totalCollectedSyringe;
    }
    

    public void setTotalCollectedSyringe(String totalCollectedSyringe) {
        this.totalCollectedSyringe = totalCollectedSyringe;
    }
    
@XmlElement(name = "totalCollected.CritGlasses")
    public String getTotalCollectedCritGlasses() {
        return totalCollectedCritGlasses;
    }
    

    public void setTotalCollectedCritGlasses(String totalCollectedCritGlasses) {
        this.totalCollectedCritGlasses = totalCollectedCritGlasses;
    }
    
    
@XmlElement(name = "totalCollected.AttackSpeedOnCrit")
    public String getTotalCollectedAttackSpeedOnCrit() {
        return totalCollectedAttackSpeedOnCrit;
    }
    

    public void setTotalCollectedAttackSpeedOnCrit(String totalCollectedAttackSpeedOnCrit) {
        this.totalCollectedAttackSpeedOnCrit = totalCollectedAttackSpeedOnCrit;
    }
    
    
@XmlElement(name = "totalCollected.SprintOutOfCombat")
    public String getTotalCollectedSprintOutOfCombat() {
        return totalCollectedSprintOutOfCombat;
    }
    

    public void setTotalCollectedSprintOutOfCombat(String totalCollectedSprintOutOfCombat) {
        this.totalCollectedSprintOutOfCombat = totalCollectedSprintOutOfCombat;
    }
    
    
@XmlElement(name = "totalCollected.PersonalShield")
    public String getTotalCollectedPersonalShield() {
        return totalCollectedPersonalShield;
    }
    

    public void setTotalCollectedPersonalShield(String totalCollectedPersonalShield) {
        this.totalCollectedPersonalShield = totalCollectedPersonalShield;
    }
    
@XmlElement(name = "totalCollected.Bandolier")
    public String getTotalCollectedBandolier() {
        return totalCollectedBandolier;
    }
    

    public void setTotalCollectedBandolier(String totalCollectedBandolier) {
        this.totalCollectedBandolier = totalCollectedBandolier;
    }
    
    
@XmlElement(name = "totalCollected.StunChanceOnHit")
    public String getTotalCollectedStunChanceOnHit() {
        return totalCollectedStunChanceOnHit;
    }
    

    public void setTotalCollectedStunChanceOnHit(String totalCollectedStunChanceOnHit) {
        this.totalCollectedStunChanceOnHit = totalCollectedStunChanceOnHit;
    }
    
    
@XmlElement(name = "totalCollected.BossDamageBonus")
    public String getTotalCollectedBossDamageBonus() {
        return totalCollectedBossDamageBonus;
    }
    

    public void setTotalCollectedBossDamageBonus(String totalCollectedBossDamageBonus) {
        this.totalCollectedBossDamageBonus = totalCollectedBossDamageBonus;
    }
    
    
@XmlElement(name = "totalCollected.EnergizedOnEquipmentUse")
    public String getTotalCollectedEnergizedOnEquipmentUse() {
        return totalCollectedEnergizedOnEquipmentUse;
    }
    

    public void setTotalCollectedEnergizedOnEquipmentUse(String totalCollectedEnergizedOnEquipmentUse) {
        this.totalCollectedEnergizedOnEquipmentUse = totalCollectedEnergizedOnEquipmentUse;
    }
    
    
@XmlElement(name = "totalCollected.NearbyDamageBonus")
    public String getTotalCollectedNearbyDamageBonus() {
        return totalCollectedNearbyDamageBonus;
    }
    

    public void setTotalCollectedNearbyDamageBonus(String totalCollectedNearbyDamageBonus) {
        this.totalCollectedNearbyDamageBonus = totalCollectedNearbyDamageBonus;
    }
    
@XmlElement(name = "totalCollected.MonsoonPlayerHelper")
    public String getTotalCollectedMonsoonPlayerHelper() {
        return totalCollectedMonsoonPlayerHelper;
    }
    

    public void setTotalCollectedMonsoonPlayerHelper(String totalCollectedMonsoonPlayerHelper) {
        this.totalCollectedMonsoonPlayerHelper = totalCollectedMonsoonPlayerHelper;
    }
    
@XmlElement(name = "highestCollected.Syringe")
    public String getHighestCollectedSyringe() {
        return highestCollectedSyringe;
    }
    

    public void setHighestCollectedSyringe(String highestCollectedSyringe) {
        this.highestCollectedSyringe = highestCollectedSyringe;
    }
    
@XmlElement(name = "highestCollected.CritGlasses")
    public String getHighestCollectedCritGlasses() {
        return highestCollectedCritGlasses;
    }
    

    public void setHighestCollectedCritGlasses(String highestCollectedCritGlasses) {
        this.highestCollectedCritGlasses = highestCollectedCritGlasses;
    }
    
@XmlElement(name = "highestCollected.AttackSpeedOnCrit")
    public String getHighestCollectedAttackSpeedOnCrit() {
        return highestCollectedAttackSpeedOnCrit;
    }
    

    public void setHighestCollectedAttackSpeedOnCrit(String highestCollectedAttackSpeedOnCrit) {
        this.highestCollectedAttackSpeedOnCrit = highestCollectedAttackSpeedOnCrit;
    }
    
@XmlElement(name = "highestCollected.SprintOutOfCombat")
    public String getHighestCollectedSprintOutOfCombat() {
        return highestCollectedSprintOutOfCombat;
    }
    

    public void setHighestCollectedSprintOutOfCombat(String highestCollectedSprintOutOfCombat) {
        this.highestCollectedSprintOutOfCombat = highestCollectedSprintOutOfCombat;
    }
    
@XmlElement(name = "highestCollected.PersonalShield")
    public String getHighestCollectedPersonalShield() {
        return highestCollectedPersonalShield;
    }
    

    public void setHighestCollectedPersonalShield(String highestCollectedPersonalShield) {
        this.highestCollectedPersonalShield = highestCollectedPersonalShield;
    }
    
@XmlElement(name = "highestCollected.Bandolier")
    public String getHighestCollectedBandolier() {
        return highestCollectedBandolier;
    }
    

    public void setHighestCollectedBandolier(String highestCollectedBandolier) {
        this.highestCollectedBandolier = highestCollectedBandolier;
    }
    
@XmlElement(name = "highestCollected.StunChanceOnHit")
    public String getHighestCollectedStunChanceOnHit() {
        return highestCollectedStunChanceOnHit;
    }
    

    public void setHighestCollectedStunChanceOnHit(String highestCollectedStunChanceOnHit) {
        this.highestCollectedStunChanceOnHit = highestCollectedStunChanceOnHit;
    }
    
@XmlElement(name = "highestCollected.BossDamageBonus")
    public String getHighestCollectedBossDamageBonus() {
        return highestCollectedBossDamageBonus;
    }
    

    public void setHighestCollectedBossDamageBonus(String highestCollectedBossDamageBonus) {
        this.highestCollectedBossDamageBonus = highestCollectedBossDamageBonus;
    }
    
@XmlElement(name = "highestCollected.EnergizedOnEquipmentUse")
    public String getHighestCollectedEnergizedOnEquipmentUse() {
        return highestCollectedEnergizedOnEquipmentUse;
    }
    

    public void setHighestCollectedEnergizedOnEquipmentUse(String highestCollectedEnergizedOnEquipmentUse) {
        this.highestCollectedEnergizedOnEquipmentUse = highestCollectedEnergizedOnEquipmentUse;
    }
    
@XmlElement(name = "highestCollected.NearbyDamageBonus")
    public String getHighestCollectedNearbyDamageBonus() {
        return highestCollectedNearbyDamageBonus;
    }
    

    public void setHighestCollectedNearbyDamageBonus(String highestCollectedNearbyDamageBonus) {
        this.highestCollectedNearbyDamageBonus = highestCollectedNearbyDamageBonus;
    }
    
@XmlElement(name = "highestCollected.MonsoonPlayerHelper")
    public String getHighestCollectedMonsoonPlayerHelper() {
        return highestCollectedMonsoonPlayerHelper;
    }
    

    public void setHighestCollectedMonsoonPlayerHelper(String highestCollectedMonsoonPlayerHelper) {
        this.highestCollectedMonsoonPlayerHelper = highestCollectedMonsoonPlayerHelper;
    }
    
@XmlElement(name = "totalTimeHeld.Saw")
    public String getTotalTimeHeldSaw() {
        return totalTimeHeldSaw;
    }
    

    public void setTotalTimeHeldSaw(String totalTimeHeldSaw) {
        this.totalTimeHeldSaw = totalTimeHeldSaw;
    }
    
@XmlElement(name = "totalTimesFired.Saw")
    public String getTotalTimesFiredSaw() {
        return totalTimesFiredSaw;
    }
    

    public void setTotalTimesFiredSaw(String totalTimesFiredSaw) {
        this.totalTimesFiredSaw = totalTimesFiredSaw;
    }
    
@XmlElement(name = "totalTimesVisited.frozenwall")
    public String getTotalTimesVisitedFrozenwall() {
        return totalTimesVisitedFrozenwall;
    }
    

    public void setTotalTimesVisitedFrozenwall(String totalTimesVisitedFrozenwall) {
        this.totalTimesVisitedFrozenwall = totalTimesVisitedFrozenwall;
    }
    
@XmlElement(name = "totalTimesVisited.golemplains")
    public String getTotalTimesVisitedGolemplains() {
        return totalTimesVisitedGolemplains;
    }
    

    public void setTotalTimesVisitedGolemplains(String totalTimesVisitedGolemplains) {
        this.totalTimesVisitedGolemplains = totalTimesVisitedGolemplains;
    }
    
@XmlElement(name = "totalTimesVisited.goolake")
    public String getTotalTimesVisitedGoolake() {
        return totalTimesVisitedGoolake;
    }
    

    public void setTotalTimesVisitedGoolake(String totalTimesVisitedGoolake) {
        this.totalTimesVisitedGoolake = totalTimesVisitedGoolake;
    }
    
@XmlElement(name = "totalTimesCleared.golemplains")
    public String getTotalTimesClearedGolemplains() {
        return totalTimesClearedGolemplains;
    }
    

    public void setTotalTimesClearedGolemplains(String totalTimesClearedGolemplains) {
        this.totalTimesClearedGolemplains = totalTimesClearedGolemplains;
    }
    
@XmlElement(name = "totalTimesCleared.goolake")
    public String getTotalTimesClearedGoolake() {
        return totalTimesClearedGoolake;
    }
    

    public void setTotalTimesClearedGoolake(String totalTimesClearedGoolake) {
        this.totalTimesClearedGoolake = totalTimesClearedGoolake;
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
    

    public StatSheet getStatSheet() {
        return statSheet;
    }


    public void setStatSheet(StatSheet statSheet) {
        this.statSheet = statSheet;
    }


    @Override
    public String toString() {
        return "Fields{" +
                "totalGamesPlayed='" + totalGamesPlayed + '\n' +
                ", totalTimeAlive='" + totalTimeAlive + '\n' +
                ", totalKills='" + totalKills + '\n' +
                ", totalDeaths='" + totalDeaths + '\n' +
                ", totalDamageDealt='" + totalDamageDealt + '\n' +
                ", totalDamageTaken='" + totalDamageTaken + '\n' +
                ", totalHealthHealed='" + totalHealthHealed + '\n' +
                ", highestDamageDealt='" + highestDamageDealt + '\n' +
                ", highestLevel='" + highestLevel + '\n' +
                ", totalGoldCollected='" + totalGoldCollected + '\n' +
                ", maxGoldCollected='" + maxGoldCollected + '\n' +
                ", totalDistanceTraveled='" + totalDistanceTraveled + '\n' +
                ", totalItemsCollected='" + totalItemsCollected + '\n' +
                ", totalStagesCompleted='" + totalStagesCompleted + '\n' +
                '}';
    }
    
}


