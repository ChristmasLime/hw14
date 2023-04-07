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
    public static void compareStudents(Hufflepuff [] students) {
        if (students == null ||  students.length == 0) {
            System.out.println("Не передан ни один ученик");
            return;
        }
        Hufflepuff best = null;
        int maxSum = 0;
        for (Hufflepuff student : students) {
            if (student == null) {
                continue;
            }
            int sum = student.getDiligence() + student.getLoyalty() + student.getHonesty();

            if (best == null || sum > maxSum) {
                best = student;
                maxSum = sum;
            }
        }
        if (best != null) {
            String message = best.getName() + " " + best.getLastName() + " лучший Гриффиндорец, чем остальные ";

            for (Hufflepuff student : students) {
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
