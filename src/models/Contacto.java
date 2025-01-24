package models;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Sobrescribir equals para comparar contactos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica si es el mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica tipo y null
        Contacto contacto = (Contacto) obj;
        // Dos contactos son iguales si tienen el mismo nombre, apellido y teléfono
        return nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido);
    }

    // Sobrescribir hashCode para garantizar la consistencia con equals
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono);
    }

    @Override
    public String toString() {
        return nombre+" "+apellido+" -> ("+telefono+")";
    }
}
