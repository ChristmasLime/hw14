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

    public static void compareStudents(Hufflepuff stud1, Hufflepuff stud2, Hufflepuff stud3) {
        int sum1 = stud1.getDiligence() + stud1.getLoyalty() + stud1.getHonesty();
        int sum2 = stud2.getDiligence() + stud2.getLoyalty() + stud2.getHonesty();
        int sum3 = stud3.getDiligence() + stud3.getLoyalty() + stud3.getHonesty();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " " + stud1.getLastName() + " лучший Пуффендуец, чем остальные "
                    + stud2.getName() + " " + stud2.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " " + stud2.getLastName() + " лучший Пуффендуец, чем остальные "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " " + stud3.getLastName() + " лучший Пуффендуец, чем остальные "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud2.getName() + " " + stud2.getLastName());
        } else {
            System.out.println("Пуффендуйцы равны");
        }
    }
}
