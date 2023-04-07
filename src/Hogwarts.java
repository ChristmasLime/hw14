public class Hogwarts {
    private String name;
    private  String lastName;
    private  int magicPower;
    private  int transgressionDistance;

    public Hogwarts(String name, String lastName, int magicPower, int transgressionDistance) {
        this.name = name;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public String  toString() {
        return "Имя студента: " + name + " " + lastName +
                "\nСила магии: " + magicPower +
                "\nДальность трансгрессии: " + transgressionDistance;
    }

    public void compareMagicPower(Hogwarts otherStudent) {
        if (this.magicPower > otherStudent.magicPower) {
            System.out.println(this.name+" " + this.lastName + " обладает больше силой магии ,чем " + otherStudent.name + otherStudent.lastName);
        } else if(this.magicPower < otherStudent.magicPower){
            System.out.println( otherStudent.name +" "+ otherStudent.lastName + " обладает больше силой магии ,чем " + this.name + this.lastName);
        }else{
            System.out.println(this.name+this.lastName +" "+otherStudent.name+otherStudent.lastName+ " обладают одинаковой силой магии");
        }
    }
    public void compareTransgressionDistance(Hogwarts otherStudent) {
        if (this.transgressionDistance > otherStudent.transgressionDistance) {
            System.out.println(this.name+" " + this.lastName + " может трансгредировать на большее расстояние, чем " + otherStudent.name + otherStudent.lastName);
        } else if (this.transgressionDistance < otherStudent.transgressionDistance) {
            System.out.println(otherStudent.name+" " + otherStudent.lastName + " может трансгредировать на большее расстояние, чем " + this.name + this.lastName);
        } else {
            System.out.println(this.name+" " + this.lastName + " и " + otherStudent.name +" "+ otherStudent.lastName + " могут трансгредировать на одинаковое расстояние.");
        }
    }
}