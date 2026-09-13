package GameCharacter;

public class mage extends Character{
    public mage(String name) {
        super(name, 60, 25);
    }

    @Override
    public void attack(Character target) {
        System.out.println(this.name +" casts a fireball");
        this.takedamage(this.attackpower);
    }

    @Override
    public void specilability(Character target) {
System.out.println(this.name+ " uses Heal ! restores 20 health");
this.health=this.health+20;
    }
}
