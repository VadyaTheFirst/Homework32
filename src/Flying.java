public class Flying extends Birds{

    public Flying(String name, int age, String enviroment) {
        super(name, age, enviroment);
    }

    @Override
    public void moves(){
        System.out.println("Летает");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
