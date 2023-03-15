package src;

import src.Pokemon;

public class WaterPokemon extends Pokemon {
    private String attack;
    private int accuracy;

    public WaterPokemon(String name, int level, int hp, int xp, int height, int weight, String sound, String food, String attack, int accuracy) {
        super(name, level, hp, xp, height, weight, sound, food);
        this.attack = attack;
        this.accuracy = accuracy;
    }

    public String getAttack() {
        return attack;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public void eats(String name, String food) {
        System.out.println(name + " eet " + food + ".");
    }

    @Override
    public void speaks(String name, String sound) {
        System.out.println(name + " zegt: '" + sound +"'.");
    }
}
