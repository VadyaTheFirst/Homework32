public final class NonFlying extends Birds {
    public NonFlying(String name, int age, String enviroment) {
        super(name, age, enviroment);
    }

    @Override
    public void moves(){
        System.out.println("Ходит");
    }

    @Override
    public String toString() {
        return "NonFlying{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enviroment='" + enviroment + '\'' +
                '}';
    }
}
