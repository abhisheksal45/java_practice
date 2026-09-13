package GameCharacter;

public abstract class Character {
    String name;
    int health;
    int attackpower;

    public Character(String name, int health, int attackpower) {
        this.name = name;
        this.health = health;
        this.attackpower = attackpower;
    }
public abstract void attack(Character target);
    public abstract void specilability(Character target);

    public void takedamage(int damage){
        this.health=health-damage;
        if(this.health<0)this.health=0;
        System.out.println(this.name +" takes" +damage+ " damage! health left: " +this.health);
    }
}
