public class GrassPokemon extends Pokemon {
    private String Trainer;
    private String special;

    public GrassPokemon(String name, int level, int hp, int xp, int height, int weight, String sound, String food, String trainer, String special) {
        super(name, level, hp, xp, height, weight, sound, food);
        Trainer = trainer;
        this.special = special;
    }

    public String getTrainer() {
        return Trainer;
    }

    public String getSpecial() {
        return special;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
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

    public void trainer(String trainer, String name) {
        System.out.println("De trainer van " + name + " heet " + trainer + ".");
    }
}
