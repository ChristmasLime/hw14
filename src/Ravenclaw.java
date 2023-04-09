public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String lastName, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, lastName, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
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

    public String toString() {
        return super.toString() +
                "\nУм: " + intelligence +
                "\nМудрость: " + wisdom +
                "\nОстроумие: " + wit +
                "\nТворчество: " + creativity;
    }

    public int getMagicForceRavenclaw() {
        return super.getMagicForce() + getIntelligence() + getWisdom() + getWit() + getCreativity();
    }

    public void compareMagicForceRavenclaw(Ravenclaw otherStudent) {
        if (otherStudent == null) {
            System.out.println("Ошибка! Невозможно сравнить силу магии - передан пустой объект.");
        } else {
            if (getMagicForceRavenclaw() > otherStudent.getMagicForceRavenclaw()) {
                System.out.println(getName() + " " + getLastName() + " обладает больше силой магии ,чем " + otherStudent.getName() + " " + otherStudent.getLastName());
            } else if (getMagicForceRavenclaw() < otherStudent.getMagicForceRavenclaw()) {
                System.out.println(otherStudent.getName() + " " + otherStudent.getLastName() + " обладает больше силой магии ,чем " + getName() + " " + getLastName());
            } else {
                System.out.println(getName() + " " + getLastName() + " " + otherStudent.getName() + " " + otherStudent.getLastName() + " обладают одинаковой силой магии");
            }
        }
    }
}
