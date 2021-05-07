public class ImmutablePerson {
    private final String name;
    private final String lastname;
    private final int age;

    ImmutablePerson(String name, String lastname, int age){
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

    public ImmutablePerson setName(String newName){
        return new ImmutablePerson(newName, this.lastname, this.age);
    }

    public ImmutablePerson setLastname(String newLastname){
        return new ImmutablePerson(this.name, newLastname, this.age);
    }

    public ImmutablePerson setAge(int newAge){
        return new ImmutablePerson(this.name, this.lastname, newAge);
    }

    @Override
    public String toString(){
        return "Name: " + this.name +
                "\nLastname: " + this.lastname +
                "\nAge: " + this.age;
    }

    public static void main(String[] args) {
        ImmutablePerson taylor = new ImmutablePerson("Taylor", "Swift", 30);
        ImmutablePerson twinTaylor = taylor.setAge(30);

        //System.out.println(emil);

        System.out.println(taylor);
        System.out.println();
        System.out.println(twinTaylor);
        System.out.println();
        System.out.printf("%s == %s: %b", taylor.getName(), twinTaylor.getName(), (taylor == twinTaylor));
    }
}
