public class Hogwarts {
    private final String name;
    private final int conjure;
    private final int transgress;

    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return name + ": " +
                "сила магии = " + conjure +
                ", трансгрессия = " + transgress;
    }

    public void compare(Hogwarts student) {
        if (conjure > student.conjure) {
            System.out.println(name + " обладает бОльшей мощностью магии, чем " + student.name);
        }
        else {
            System.out.println(student.name + " обладает бОльшей мощностью магии, чем " + name);
        }
        if (transgress > student.transgress) {
            System.out.println(name + " обладает бОльшим расстоянием трансгрессии, чем " + student.name);
        }
        else {
            System.out.println(student.name + " обладает бОльшим расстоянием трансгрессии, чем " + name);
        }
    }
}
