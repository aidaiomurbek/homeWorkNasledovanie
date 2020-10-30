package com.company;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(int health, int damage,Weapon weapon) {
        super(health, damage);
        this.weapon= weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "weapon:" + weapon.getTypeWeapon() +"\nимя оружия: "+ weapon.getNameWeapon()+" \nжизнь босса: "+ getHealth() +" \nурон босса: "+getDamage();
    }
}
