public abstract class Pokemon {
    private String name;
    private int level;
    int hp;
    int xp;
    int height;
    int weight;
    String sound;
    String food;

    public Pokemon(String name, int level, int hp, int xp, int height, int weight, String sound, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.height = height;
        this.weight = weight;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void eats(String name, String food);

    public abstract void speaks(String name, String sound);

}
