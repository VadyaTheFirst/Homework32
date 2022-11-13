public final class Predator extends Mammal{
    public Predator(String name, int age, String enviroment, int speed) {
        super(name, age, enviroment, speed);
    }

    public void hunts(){
        System.out.println("Умеет охотиться");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
