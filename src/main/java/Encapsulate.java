public class Encapsulate {
    public static void main(String[] args) {
        System.out.println("BOOKS");

        //books encapsulation
        Book book1 = new Book();
        book1.setName("Clash of Civilizations");
        book1.setAuthor("Samuel Huntington");
        book1.setYear(1996);
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());

        System.out.println("------------------------");

        Book book2 = new Book();
        book2.setName("Never let me go");
        book2.setAuthor("Kazuo Ishiguro");
        book2.setYear(2005);
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYear());

        //planets encapsulation
        System.out.println("PLANETS");

        Planet mars = new Planet("Mars", 54367894, 305959594);
        Planet venus = new Planet("Venus", 1, 455647745);
        mars.getPlanetInfo();
        System.out.println("------------------------");
        venus.getPlanetInfo();
    }
}
