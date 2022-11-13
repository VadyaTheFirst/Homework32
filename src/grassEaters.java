public final class grassEaters extends Mammal{
    public grassEaters(String name, int age, String enviroment, int speed) {
        super(name, age, enviroment, speed);
    }

    public void hunts() {
        System.out.println("Пасется");
    }

    @Override
    public String toString() {
        return "grassEaters{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
