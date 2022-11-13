import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int age;
    protected final String enviroment;

    public Animal(String name, int age, String enviroment) {
        if (name.isBlank()){
            this.name="Имя объекта не указано";
        } else {
            this.name = name;
        }
        if (age<0) {
            this.age = 1;
        } else {
            this.age = age;
        }

        if (enviroment.isBlank()){
            this.enviroment="Среда обитания неизвестна";
        } else {
            this.enviroment = enviroment;
        }
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnviroment() {
        return enviroment;
    }

    protected final void eat(){
        System.out.println("Это животное, как илюбое другое, ест");
    };
    protected abstract void hunts();
    protected abstract void moves();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name) && enviroment.equals(animal.enviroment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, enviroment);
    }
}
