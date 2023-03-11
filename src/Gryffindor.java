public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;


    public Gryffindor(String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндор. " + super.toString() +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }

    public int scores() {
        return nobility + honor + bravery;
    }
}
