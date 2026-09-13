package GameCharacter;

public class Warrior extends Character{
    public Warrior(String name){
        super(name,100,15);
    }

    @Override
    public void attack(Character target) {
        System.out.println(this.name+ "Hits with a sword !");
        target.takedamage(this.attackpower);
    }

    @Override
    public void specilability(Character target) {
System.out.println(this.name +"uses sheild slam!");
target.takedamage(this.attackpower+10);
    }
}
