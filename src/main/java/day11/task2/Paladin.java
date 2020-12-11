package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin() {
        health = 100.0;
        physDef = 50.0;
        magicDef = 20.0;
        physAtt = 15.0;
        healSelf = 25.0;
        healTeam = 10.0;
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

    public void healHimself() {
        health += healSelf;
        if (health > MAXHEALTH) {
            health = MAXHEALTH;
        }
        System.out.println(toString());
    }

    public void healTeammate(Hero hero) {
        hero.health += healTeam;
        if (hero.health > MAXHEALTH) {
            hero.health = MAXHEALTH;
        }
        System.out.println(hero);
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
        return "Paladin{" + "health=" + health + "}";
    }
}


