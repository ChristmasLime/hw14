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
    public static void compareStudents(Ravenclaw [] students) {
        if (students == null ||  students.length == 0) {
            System.out.println("Не передан ни один ученик");
            return;
        }
        Ravenclaw best = null;
        int maxSum = 0;
        for (Ravenclaw student : students) {
            if (student == null) {
                continue;
            }
            int sum = student.getIntelligence() + student.getWisdom() + student.getWit()+student.getCreativity();

            if (best == null || sum > maxSum) {
                best = student;
                maxSum = sum;
            }
        }
        if (best != null) {
            String message = best.getName() + " " + best.getLastName() + " лучший Гриффиндорец, чем остальные ";

            for (Ravenclaw student : students) {
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
