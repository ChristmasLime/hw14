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
    public static void compareStudents(Griffindor [] students) {
        if (students == null ||  students.length == 0) {
            System.out.println("Не передан ни один ученик");
            return;
        }
        Griffindor best = null;
        int maxSum = 0;
        for (Griffindor student : students) {
            if (student == null) {
                continue;
            }
            int sum = student.getNobility() + student.getHonor() + student.getBravery();

            if (best == null || sum > maxSum) {
                best = student;
                maxSum = sum;
            }
        }
        if (best != null) {
            String message = best.getName() + " " + best.getLastName() + " лучший Гриффиндорец, чем остальные ";

            for (Griffindor student : students) {
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





