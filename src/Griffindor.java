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
    public void studentInfo() {
        super.studentInfo();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }
    public static void compareStudents(Griffindor stud1, Griffindor stud2, Griffindor stud3) {
        int sum1 = stud1.getNobility() + stud1.getHonor() + stud1.getBravery();
        int sum2 = stud2.getNobility() + stud2.getHonor() + stud2.getBravery();
        int sum3 = stud3.getNobility() + stud3.getHonor() + stud3.getBravery();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " " + stud1.getLastName() + " лучший Гриффиндорец, чем остальные  "
                    + stud2.getName() + " " + stud2.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " " + stud2.getLastName() + " лучший Гриффиндорец, чем остальные  "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " " + stud3.getLastName() + " лучший Гриффиндорец, чем остальные  "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud2.getName() + " " + stud2.getLastName());
        } else {
            System.out.println("Гриффиндорцы равны");
        }
    }
}




