package Enemy;

public enum EnemyRaceType {

    ORC(100, 25),
    GOBLIN(30, 10),
    UNDEAD(70, 15),
    VAMPIRE(100, 20),
    KOBOLD(80, 15),
    TROLL(200, 30),
    GIANT(300, 40);

    private double HP;
    private double attackValue;

    private EnemyRaceType(double HP, double attackValue){
        this.HP = HP;
        this.attackValue = attackValue;
    }

    public double getHP() {
        return HP;
    }

    public double getAttackValue() {
        return attackValue;
    }
}
