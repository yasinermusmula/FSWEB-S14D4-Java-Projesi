package RPG_Game;

public class MainMonster {
    public static void main(String[] args) {
        Monster monsterTroll = new Troll("Troll",20,15.5);
        System.out.println(monsterTroll.bleed());
        System.out.println(monsterTroll.poison());
        System.out.println(monsterTroll.bleed() + monsterTroll.poison() + monsterTroll.getDamage());
        System.out.println(monsterTroll.attack());
    }
}
