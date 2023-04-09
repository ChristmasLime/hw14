public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String lastName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, lastName, magicPower, transgressionDistance);
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

    public String toString() {
        return super.toString() +
                "\nБлагородство: " + nobility +
                "\nЧесть: " + honor +
                "\nХрабрость: " + bravery;
    }

    public int getMagicForceGriffindor() {
        return super.getMagicForce() + getNobility() + getHonor() + getBravery();
    }

    public void compareMagicForceGriffindor(Griffindor otherStudent) {
        if (otherStudent == null) {
            System.out.println("Ошибка! Невозможно сравнить силу магии - передан пустой объект.");
        } else {
            if (getMagicForceGriffindor() > otherStudent.getMagicForceGriffindor()) {
                System.out.println(getName() + " " + getLastName() + " обладает больше силой магии ,чем " + otherStudent.getName() + " " + otherStudent.getLastName());
            } else if (getMagicForceGriffindor() < otherStudent.getMagicForceGriffindor()) {
                System.out.println(otherStudent.getName() + " " + otherStudent.getLastName() + " обладает больше силой магии ,чем " + getName() + " " + getLastName());
            } else {
                System.out.println(getName() + " " + getLastName() + " " + otherStudent.getName() + " " + otherStudent.getLastName() + " обладают одинаковой силой магии");
            }
        }
    }
}







