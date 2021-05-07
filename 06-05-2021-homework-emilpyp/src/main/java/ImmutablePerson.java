public final class ImmutablePerson {
    private final String name;
    private final String lastname;
    private final int age;

    public ImmutablePerson(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "Name: " + this.name +
                "\nLastname: " + this.lastname +
                "\nAge: " + this.age;
    }

    public static void main(String[] args) {
        ImmutablePerson taylor = new ImmutablePerson("Taylor", "Swift", 30);
        //taylor.age = 5;

        System.out.println(taylor);
    }
}
