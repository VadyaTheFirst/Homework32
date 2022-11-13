public final class  Amphibians extends Animal{

    public Amphibians (String name, int age, String enviroment) {
        super(name, age, enviroment);
    }


    public void hunts(){
        System.out.println("Умеет охотиться в "+getEnviroment());
    }

    public void moves(){
        System.out.println("Перемещается");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
