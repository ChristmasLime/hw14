public class Main {
    public static void splitOffers() {
        System.out.println("########################################################################################");
    }
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри", "Поттер", 90, 85, 95,44,66);
        Griffindor hermione = new Griffindor("Гермиона", "Грейнджер", 95, 90, 90,44,67);
        Griffindor ron = new Griffindor("Рон", "Уизли", 80, 95, 80,67,88);


        Hufflepuff zacharias = new Hufflepuff("Захария", "Смит", 90, 95, 95,53,35);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 80, 90, 90,45,76);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 85, 90, 80,45,66);

        Ravenclaw cho = new Ravenclaw("Чжоу", "Чанг", 95, 95, 95, 95,56,56);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 90, 90, 85, 90,80,70);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 85, 95, 90, 85,66,55);

        Slytherin draco = new Slytherin("Драко", "Малфой", 85, 95, 90, 95, 90,83,24);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 80, 90, 85, 90, 85,75,44);
        Slytherin goyle = new Slytherin("Грегори", "Гойл", 90, 80, 85, 90, 95,64,77);


 splitOffers();
        System.out.println(hermione);
 splitOffers();
         System.out.println(draco);
 splitOffers();
        System.out.println(zacharias);
splitOffers();
        System.out.println(cho);
 splitOffers();
 goyle.compareMagicForce(justin);
 splitOffers();
        ron.compareMagicForce(null);
splitOffers();
       hermione.compareMagicForceGriffindor(harry);
splitOffers();
       justin.compareMagicForceHufflepuff(cedric);
splitOffers();
        marcus.compareMagicForceRavenclaw(padma);
splitOffers();
        graham.compareMagicForceSlytherin(null);
splitOffers();
    }
}







