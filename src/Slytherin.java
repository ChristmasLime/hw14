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

    public void studentInfo() {
        super.studentInfo();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
    }

    public static void compareStudents(Slytherin stud1, Slytherin stud2, Slytherin stud3) {
        int sum1 = stud1.getCunning() + stud1.getDetermination() + stud1.getAmbition() + stud1.getResourcefulness() + stud1.getLustForPower();
        int sum2 = stud2.getCunning() + stud2.getDetermination() + stud2.getAmbition() + stud2.getResourcefulness() + stud2.getLustForPower();
        int sum3 = stud3.getCunning() + stud3.getDetermination() + stud3.getAmbition() + stud3.getResourcefulness() + stud3.getLustForPower();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " " + stud1.getLastName() + " лучший Слизеринец, чем остальные "
                    + stud2.getName() + " " + stud2.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " " + stud2.getLastName() + " лучший Слизеринец чем остальные, чем чем остальные  "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " " + stud3.getLastName() + " лучший Слизеринец, чем чем остальные  "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud2.getName() + " " + stud2.getLastName());
        } else {
            System.out.println("Слизеринцы равны");
        }

    }
}

