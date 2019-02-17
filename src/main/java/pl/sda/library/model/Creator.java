package pl.sda.library.model;

import java.util.Objects;

public class Creator {

    private String firstName;
    private String lastName;

    Creator(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;              //== porównuje referencje -czyli miejsce w pamieci jest takie same , moga byc dwaj J.Kow ale w innym miejscu zapisane
        if (o == null || getClass() != o.getClass()) return false;
        Creator author = (Creator) o;                 //rzutowanie
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {    //zwraca unikalny kod
      //  return  firstName.hashCode() + lastName.hashCode();   //porównuje kody po imieniu /po imieniu i nazwisku
        return Objects.hash(firstName, lastName);                //  oblicza hashcode ze zmiennych ktore podamy
    }

    @Override
    public String toString() {
        return "Creator{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
