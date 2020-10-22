package co.com.bancolombia.certificacion.retoCliente.models;

public class DataUser {

    private String name;
    private String lastname;
    private String email;
    private String city;
    private String codePostal;
    private String password;
    private String confirmPassword;


    public DataUser(String name, String lastname, String email, String city, String codePostal, String password, String confirmPassword) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.city = city;
        this.codePostal = codePostal;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
