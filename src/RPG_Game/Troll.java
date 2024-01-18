package RPG_Game;

public class Troll extends Monster{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
}
