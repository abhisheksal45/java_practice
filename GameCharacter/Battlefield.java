package GameCharacter;

public class Battlefield implements BattleRequirement{
    @Override
    public void fight(Character c1, Character c2) {
        System.out.println("------------Battle Start ----------------");
        while(c1.health>0 &&c2.health>0){
            c1.attack(c2);

            if(c2.health<=0 ) break;;
            c2.attack(c1);
            System.out.println();

        }
   System.out.println("------Match Over-----");
        if(c1.health>0){
            System.out.println(c1.name+ "WINS!");
        }
   else {
       System.out.println(c2.name + " WINS!");
        }
    }
}
