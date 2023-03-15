package src;

public class FirePokemon extends Pokemon {
    private int defence;
    private String special;

    public FirePokemon(String name, int level, int hp, int xp, int height, int weight, String sound, String food, int defence, String special) {
        super(name, level, hp, xp, height, weight, sound, food);
        this.defence = defence;
        this.special = special;
    }

    public int getDefence() {
        return defence;
    }

    public String getSpecial() {
        return special;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public void eats(String name, String food) {
        System.out.println(name + " eet " + food + ".");
    }

    @Override
    public void speaks(String name, String sound) {
        System.out.println(name + " zegt: '" + sound +"'.");
    }

    public void specialAttack(String name) {
        System.out.println(name + "'s speciale gave is: " + special + ".");
    }
}
