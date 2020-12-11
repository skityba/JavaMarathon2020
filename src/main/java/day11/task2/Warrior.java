package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        health = 100.0;
        physDef = 80.0;
        magicDef = 0.0;
        physAtt = 30.0;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(double physAtt) {
        this.physAtt = physAtt;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (physAtt * hero.physDef / 100.0));
        if (hero.health < MINHEALTH) {
            hero.health = MINHEALTH;
        }
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Warrior{" + "health=" + health + "}";
    }
}

