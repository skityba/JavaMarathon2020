package day11.task2;

public abstract class Hero {
    public static final double MAXHEALTH = 100.0;
    public static final double MINHEALTH = 0.0;
    public double health;
    public double physDef;
    public double magicDef;
    public double physAtt;
    public Hero(){
        health = 100.0;
    }
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (physAtt * hero.physDef / 100.0));
        if (hero.health < MINHEALTH) {
            hero.health = MINHEALTH;
        }
        System.out.println(hero);
    }
}
