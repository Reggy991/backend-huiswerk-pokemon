package src;

public class ElectricPokemon extends Pokemon {
    private String defence;
    private String attack;

    public ElectricPokemon(String name, int level, int hp, int xp, int height, int weight, String sound, String food, String defence, String attack) {
        super(name, level, hp, xp, height, weight, sound, food);
        this.defence = defence;
        this.attack = attack;
    }

    public String getDefence() {
        return defence;
    }

    public String getAttack() {
        return attack;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public void setAttack(String attack) {
        this.attack = attack;
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
