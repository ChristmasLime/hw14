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
    public int getMagicForce() {
        return getMagicPower() + getTransgressionDistance();
    }
    public void compareMagicForce(Hogwarts otherStudent) {
        if (otherStudent == null) {
            System.out.println("Ошибка! Невозможно сравнить силу магии - передан пустой объект.");
        } else {
            if (getMagicForce() > otherStudent.getMagicForce()) {
                System.out.println(getLastName()+" " + getLastName() + " обладает больше силой магии ,чем " + otherStudent.getName()+ otherStudent.getLastName());
            } else if(getMagicForce() < otherStudent.getMagicForce()){
                System.out.println( otherStudent.getName() +" "+ otherStudent.getLastName() + " обладает больше силой магии ,чем " + getName()+" " + getLastName());
            } else {
                System.out.println(getName()+getLastName() +" "+otherStudent.getName()+otherStudent.getLastName()+ " обладают одинаковой силой магии");
            }
        }
    }

}