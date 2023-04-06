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
    public void studentInfo() {
        super.studentInfo();
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }
    public static void compareStudents(Ravenclaw stud1, Ravenclaw stud2, Ravenclaw stud3) {
        int sum1 = stud1.getIntelligence() + stud1.getWisdom() + stud1.getWit()+stud1.getCreativity();
        int sum2 = stud2.getIntelligence() + stud2.getWisdom() + stud2.getWit()+stud2.getCreativity();
        int sum3 = stud3.getIntelligence() + stud3.getWisdom() + stud3.getWit()+stud3.getCreativity();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println(stud1.getName() + " " + stud1.getLastName() + " лучший Пуффендуец, чем остальные "
                    + stud2.getName() + " " + stud2.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println(stud2.getName() + " " + stud2.getLastName() + " лучший Пуффендуец, чем остальные "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud3.getName() + " " + stud3.getLastName());
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println(stud3.getName() + " " + stud3.getLastName() + " лучший Пуффендуец, чем остальные  "
                    + stud1.getName() + " " + stud1.getLastName() + " и " + stud2.getName() + " " + stud2.getLastName());
        } else {
            System.out.println("Пуффендуйцы равны");
        }
    }
}
