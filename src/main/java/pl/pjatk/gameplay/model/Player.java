package pl.pjatk.gameplay.model;

public class Player {
    private int id;
    private String name;
    private String playerClass;
    private int hp;
    private int damage;

    public Player(int id, String name, String playerClass, int hp, int damage) {
        this.id = id;
        this.name = name;
        this.playerClass = playerClass;
        this.hp = hp;
        this.damage = damage;
    }

    public Player(String name, String playerClass, int hp, int damage) {
        this.name = name;
        this.playerClass = playerClass;
        this.hp = hp;
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
