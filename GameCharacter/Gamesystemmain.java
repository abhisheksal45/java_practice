package GameCharacter;

public class  Gamesystemmain {
    public static void main(String[] args) {
        Character player1=new Warrior("Arthor");
        Character Player2=new mage("Merline");
        Battlefield match=new Battlefield();
        match.fight(player1,Player2);
    }
}
