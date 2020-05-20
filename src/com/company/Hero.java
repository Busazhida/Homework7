package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int Health;
    private String Damage;
    private String SuperAbilityType;

    public void setHealth(int health) {
        Health = health;
    }
    public int getHealth() {
        return Health;
    }
    public void setDamage(String damage) {
        Damage = damage;
    }
    public String getDamage() {
        return Damage;
    }
    public void setSuperAbilityType(String superAbilityType) {
        SuperAbilityType = superAbilityType;
    }
    public String getSuperAbilityType() {
        return SuperAbilityType;
    }
}
