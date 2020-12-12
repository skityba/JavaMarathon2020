package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private double healSelf;
    private double healTeam;
    private double magicAtt;

    public Shaman() {
        physDef = 20.0;
        magicDef = 20.0;
        physAtt = 10.0;
        magicAtt = 15.0;
        healSelf = 50.0;
        healTeam = 50.0;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
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

    public double getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(double magicAtt) {
        this.magicAtt = magicAtt;
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

    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (magicAtt - (magicAtt * hero.magicDef / 100.0));
        if (hero.health < MINHEALTH) {
            hero.health = MINHEALTH;
        }
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Shaman{" + "health=" + health + "}";
    }
}

