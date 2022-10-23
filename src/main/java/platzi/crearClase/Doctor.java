package platzi.crearClase;

public class Doctor {

    static int id = 0;
    String name;
    String speciality;

    // Crearemos los comportamientos

    public Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;

    }

    public Doctor() {
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }

}
