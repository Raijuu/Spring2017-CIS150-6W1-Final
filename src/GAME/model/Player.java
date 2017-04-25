package GAME.model;

import java.util.Random;

public abstract class Player {

    protected int currentHP;
    protected int maxHP;
    protected int attackStat;
    protected int defenseStat;
    protected String name;
    protected String playerClass;
    protected boolean isAlive;
    Random rng = new Random();

    public Player() {
        isAlive = true;
        attackStat = 10;
        defenseStat = 10;
        currentHP = maxHP = 100;
        name = "J.D.";
    }

    public Player(int setAtk, int setDef, int setHP) {
        this();
        attackStat = setAtk;
        defenseStat = setDef;
        currentHP = maxHP = setHP;
    }

    public void RandomlyGenerateStats() {
        int nameSeed = rng.nextInt(28);
        switch (nameSeed) {
            case 0:
                name = "Arnold";
                break;
            case 1:
                name = "Samantha";
                break;
            case 2:
                name = "Scarlax";
                break;
            case 3:
                name = "Jovia";
                break;
            case 4:
                name = "Breadly";
                break;
            case 5:
                name = "Car'rel";
                break;
            case 6:
                name = "Dah'vid";
                break;
            case 7:
                name = "Exala";
                break;
            case 8:
                name = "Falistad";
                break;
            case 9:
                name = "Geron'Imo";
                break;
            case 10:
                name = "Har'e";
                break;
            case 11:
                name = "Inistini";
                break;
            case 12:
                name = "Jul'ear";
                break;
            case 13:
                name = "Kiare";
                break;
            case 14:
                name = "Lianne";
                break;
            case 15:
                name = "Mistine";
                break;
            case 16:
                name = "Nec'ro";
                break;
            case 17:
                name = "Ober'on";
                break;
            case 18:
                name = "Paul";
                break;
            case 19:
                name = "Quiznos";
                break;
            case 20:
                name = "Roger";
                break;
            case 21:
                name = "Sarah";
                break;
            case 22:
                name = "Tifa";
                break;
            case 23:
                name = "Unigotha";
                break;
            case 24:
                name = "Vericin";
                break;
            case 25:
                name = "Wal'iam";
                break;
            case 26:
                name = "Xianal";
                break;
            case 27:
                name = "Yifta";
                break;
            case 28:
                name = "Zazafa";
                break;

        }

        currentHP = maxHP = (rng.nextInt(4)+8)*10;
        defenseStat = (rng.nextInt(4)+3);
        attackStat = (rng.nextInt(4)+10);

    }

    // Report Stats
    public void ReportStats() {
        System.out.print(this.name + " the " + playerClass + " (" + this.currentHP + "/" + this.maxHP + ") ATK:" + this.attackStat + " DEF: " + this.defenseStat);
    }

    // receive healing
    public void getHealed(int healAmount) {
        if(maxHP > currentHP) {
            currentHP += healAmount;
        }
    }

    // Returns amount of remaining hit points.
    public int getHealthPoints() {
        return currentHP;
    }

    // This is used to calculate the blow taken by another character, returns remaining hitpoints.
    abstract int calcDamage(int damageIn);

    // This is used to calculate the blow to land on another player, returns damage amount.
    abstract int calcAttack();

    // This is a helper function to reduce the hitpoints by amount damaged
    protected void reduceHealthPoints(int damage) {
        currentHP  -= damage;

        if (currentHP <= 0) {
            isAlive = false;
        }
    }

}
