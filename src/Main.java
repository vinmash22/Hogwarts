import java.util.Arrays;

public class Main {
    public static void printGryffindor(Gryffindor o) {
        System.out.println(o);
    }

    public static void printHufflepuff(Hufflepuff o) {
        System.out.println(o);
    }

    public static void printRavenclaw(Ravenclaw o) {
        System.out.println(o);
    }

    public static void printSlytherin(Slytherin o) {
        System.out.println(o);
    }

    public static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        int s1 = student1.scores();
        int s2 = student2.scores();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }

    }

    public static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int s1 = student1.scores();
        int s2 = student2.scores();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Пуффендуйец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуйец, чем " + student1.getName());
        }

    }

    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int s1 = student1.scores();
        int s2 = student2.scores();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }

    }

    public static void compareSlytherin(Slytherin student1, Slytherin student2) {
        int s1 = student1.scores();
        int s2 = student2.scores();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }

    }

    public static void main(String[] args) {
        Gryffindor garry = new Gryffindor("Гарри Поттер", 40, 5, 2, 15, 25);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 15, 10, 5, 7, 20);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10, 5, 3, 7, 10);
        printGryffindor(garry);
        printGryffindor(germiona);
        printGryffindor(ron);

        Hufflepuff zachariya = new Hufflepuff("Захария Смит", 15, 10, 20, 22, 28);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 15, 10, 20, 22, 28);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли", 20, 15, 30, 20, 27);
        System.out.println();
        printHufflepuff(zachariya);
        printHufflepuff(sedric);
        printHufflepuff(jastin);

        Ravenclaw jou = new Ravenclaw("Чжоу Чанг", 30, 25, 41, 15, 7, 35);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 28, 15, 39, 10, 24, 31);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 24, 35, 52, 10, 17, 15);
        System.out.println();
        printRavenclaw(jou);
        printRavenclaw(padma);
        printRavenclaw(marcus);

        Slytherin draco = new Slytherin("Драко Малфой", 29, 20, 14, 16, 27, 30, 58);
        Slytherin grechem = new Slytherin("Грэхэм Монтегю", 25, 10, 10, 13, 14, 25, 15);
        Slytherin gregori = new Slytherin("Грегори Гойл", 10, 5, 9, 10, 16, 20, 10);
        System.out.println();
        printSlytherin(draco);
        printSlytherin(grechem);
        printSlytherin(gregori);
        System.out.println();
        compareGryffindor(garry, germiona);
        System.out.println();
        compareHufflepuff(sedric, jastin);
        System.out.println();
        compareRavenclaw(jou, padma);
        System.out.println();
        compareSlytherin(draco, gregori);
        System.out.println();
        garry.compare(draco);
    }
}