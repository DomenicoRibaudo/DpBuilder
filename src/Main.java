//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//        Il costruttore accetterà un Builder in input
//        Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//        Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder("Luca", "Bianchi");
        personBuilder.setAge(21);
        personBuilder.setAddress("Via Roma");
        Person person1 = personBuilder.build();
        System.out.println("Persona creata con personBuilder : " + person1);

        Person person2 = new Person("Marco", "Polo",23, "Via Genova");
        System.out.println("Persona creata con costruttore : " + person2);
    }
}


