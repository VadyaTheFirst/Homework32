public abstract class Birds extends Animal{

    public Birds(String name, int age, String enviroment) {
        super(name, age, enviroment);
    }
@Override
    public void hunts(){
        System.out.println("Охотиться в "+getEnviroment());
    }

    public void moves(){
        System.out.println("Летает");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
