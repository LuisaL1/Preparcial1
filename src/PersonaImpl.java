public class PersonaImpl implements Persona {
    private String name;
    private String lastName;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName() {

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}