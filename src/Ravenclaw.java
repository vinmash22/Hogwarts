public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int conjure, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(name, conjure, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Когтевран. " + super.toString() +
                ", ум = " + mind +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creativity;
    }

    public int scores() {
        return mind + wisdom + wit + creativity;
    }
}
