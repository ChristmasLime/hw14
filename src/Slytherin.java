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
                "\nАмбициозность: " + ambition+
                "\nНаходчивость: " + resourcefulness+
                "\nЖажда власти: " + lustForPower;
    }
    public static void compareStudents(Slytherin[] students) {
        if (students == null ||  students.length == 0) {
            System.out.println("Не передан ни один ученик");
            return;
        }
       Slytherin best = null;
        int maxSum = 0;
        for (Slytherin student : students) {
            if (student == null) {
                continue;
            }
            int sum = student.getCunning() + student.getDetermination() + student.getAmbition()+student.getResourcefulness()+student.getLustForPower();

            if (best == null || sum > maxSum) {
                best = student;
                maxSum = sum;
            }
        }
        if (best != null) {
            String message = best.getName() + " " + best.getLastName() + " лучший Гриффиндорец, чем остальные ";

            for (Slytherin student : students) {
                if (student != null && student != best) {
                    message += student.getName() + " " + student.getLastName() + " и ";
                }
            }
            if (message.endsWith("и ")) {
                message = message.substring(0, message.length() - 2);
            }
            System.out.println(message);
        } else {
            System.out.println("Не передан ни один ученик");
        }
    }
}

