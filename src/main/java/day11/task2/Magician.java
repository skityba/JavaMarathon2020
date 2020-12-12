package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double magicAtt;

    public Magician() {
        physDef = 0.0;
        magicDef = 80.0;
        physAtt = 5.0;
        magicAtt = 20.0;
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

    public double getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
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
        return "Magician{" + "health=" + health + "}";
    }
}

