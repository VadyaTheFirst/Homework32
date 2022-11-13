public abstract class Mammal extends Animal {

    protected int speed;

    public Mammal(String name, int age, String enviroment, int speed) {
        super(name, age, enviroment);
        if (speed <= 0) {
            this.speed = 3;
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override

    public void moves(){
        System.out.println("Гуляет со скоростью "+getSpeed()+" км в час");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
