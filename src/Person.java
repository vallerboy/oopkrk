public class Person {
    private String name;
    private String lastname;
    private String eyeColor;

    public Person(String name, String lastname, String eyeColor) {
        this.name = name;
        this.lastname = lastname;

        if(eyeColor != null) {
            this.eyeColor = eyeColor;
        }else{
            System.out.println("Brak zniżki!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }

    public Person(String name, String lastname) {
        this(name, lastname, null);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
