public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String lastName, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, lastName, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public String toString() {
        return super.toString() +
                "\nТрудолюбие: " + diligence +
                "\nВерность: " + loyalty +
                "\nЧестность: " + honesty;
    }

    public int getMagicForceHufflepuff() {
        return super.getMagicForce() + getDiligence() + getLoyalty() + getHonesty();
    }

    public void compareMagicForceHufflepuff(Hufflepuff otherStudent) {
        if (otherStudent == null) {
            System.out.println("Ошибка! Невозможно сравнить силу магии - передан пустой объект.");
        } else {
            if (getMagicForceHufflepuff() > otherStudent.getMagicForceHufflepuff()) {
                System.out.println(getName() + " " + getLastName() + " обладает больше силой магии ,чем " + otherStudent.getName() + " " + otherStudent.getLastName());
            } else if (getMagicForceHufflepuff() < otherStudent.getMagicForceHufflepuff()) {
                System.out.println(otherStudent.getName() + " " + otherStudent.getLastName() + " обладает больше силой магии ,чем " + getName() + " " + getLastName());
            } else {
                System.out.println(getName() + " " + getLastName() + " " + otherStudent.getName() + " " + otherStudent.getLastName() + " обладают одинаковой силой магии");
            }
        }
    }
}
