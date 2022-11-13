public class Main {

    public static void animalCout(Animal[] animals) {

        for (byte i = 0; i <animals.length; i++) {
            System.out.println(animals[i].toString());
            animals[i].hunts();
            animals[i].moves();
        }
    }

    public static void uniqueVerify(Animal[] animals,int j){
        for (int i = 0; i <animals.length; i++){
            if (i!=j){
                if (animals[j].equals(animals[i])){
                    System.out.println("Есть одинаковые животные с номерами "+j+" и "+ i);
                }
            }

        }
    }
    public static void main(String[] args) {

Animal[] animals = new Animal[6];
animals[0]= new NonFlying("Пингвин" ,12,"Арктика");
animals[1]= new Flying("Ворона" ,100,"Везде, кроме полюсов");
animals[2]= new Amphibians("Жаба",2,"Болота");
animals[3]= new grassEaters("Газель" ,5,"Поля",5);
animals[4]=new Predator("Гиена" ,3,"Африка",50);
animals[5]= new NonFlying("Пингвин" ,12,"Арктика");
animalCout(animals);
uniqueVerify(animals,0);
    }
}