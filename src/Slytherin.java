public class Slytherin extends Hogwarts {
    public int cunning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustForPower;

    public Slytherin(String name, String lastName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, lastName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public String toString() {
        return super.toString() +
                "\nХитрость: " + cunning +
                "\nРешительность: " + determination +
                "\nАмбициозность: " + ambition +
                "\nНаходчивость: " + resourcefulness +
                "\nЖажда власти: " + lustForPower;
    }

    public int getMagicForceSlytherin() {
        return super.getMagicForce() + getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
    }

    public void compareMagicForceSlytherin(Slytherin otherStudent) {
        if (otherStudent == null) {
            System.out.println("Ошибка! Невозможно сравнить силу магии - передан пустой объект.");
        } else {
            if (getMagicForceSlytherin() > otherStudent.getMagicForceSlytherin()) {
                System.out.println(getName() + " " + getLastName() + " обладает больше силой магии ,чем " + otherStudent.getName() + " " + otherStudent.getLastName());
            } else if (getMagicForceSlytherin() < otherStudent.getMagicForceSlytherin()) {
                System.out.println(otherStudent.getName() + " " + otherStudent.getLastName() + " обладает больше силой магии ,чем " + getName() + " " + getLastName());
            } else {
                System.out.println(getName() + " " + getLastName() + " " + otherStudent.getName() + " " + otherStudent.getLastName() + " обладают одинаковой силой магии");
            }
        }
    }
}
