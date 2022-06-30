public class Planet {
    private String name;
    private int population;
    private int age;

    public Planet (String name, int population, int age) {
        this.name = name;
        this.population = population;
        this.age = age;
    }

    public void getPlanetInfo () {
        System.out.println(name);
        if (population == 1) {
            System.out.println(population + " creature populates this planet.");
        } else {
            System.out.println(population + " creatures populate this planet.");
        }
        System.out.println(age + " years old.");
    }
}