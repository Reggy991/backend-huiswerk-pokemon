public class Main {
    public static void main(String[] args) {
        FirePokemon f1 = new FirePokemon("Charmander", 25, 39, 62, 60, 15, "CHARMANDER", "bessen", 43, "rage");

        WaterPokemon w1 = new WaterPokemon("Squirtle", 23, 66, 63, 50, 9, "squirtle squirtle", "water planten", "Hydro pump", 23);

        GrassPokemon g1 = new GrassPokemon("Bulbasaur", 45, 50, 64, 70, 7, "bulba", "planten", "Ash Ketchum", "mist suck up" );

        ElectricPokemon e1 = new ElectricPokemon("Pikachu", 21, 82, 112, 40, 6, "pika pika", "bessen", "Electric defense", "Burst Attack Volt Shock Fist");

        f1.specialAttack(f1.getName());
        w1.speaks(w1.getName(), w1.sound);
        g1.trainer(g1.getTrainer(), g1.getName());
        e1.eats(e1.getName(), e1.food);
    }
}
