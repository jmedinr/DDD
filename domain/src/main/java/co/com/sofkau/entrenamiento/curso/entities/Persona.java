package co.com.sofkau.entrenamiento.curso.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.entities.values.Telefono;
import co.com.sofkau.entrenamiento.curso.entities.values.Correo;
import co.com.sofkau.entrenamiento.curso.entities.values.Direccion;
import co.com.sofkau.entrenamiento.curso.entities.values.Documento;
import co.com.sofkau.entrenamiento.curso.entities.values.Nombre;

import java.util.Objects;


public class Persona extends Entity<PersonaId> {
    protected Nombre nombre;
    protected Telefono telefono;
    protected Correo correo;
    protected Direccion direccion;
    protected Documento documento;

    public Persona(PersonaId entityId) {
        super(entityId);
    }

    public Persona(PersonaId entityId, Nombre nombre, Telefono telefono, Correo correo, Direccion direccion, Documento documento) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.documento = documento;
    }

    public static Persona form(PersonaId entityId, Nombre nombre, Telefono telefono, Correo correo, Direccion direccion, Documento documento) {
        var persona = new Persona(entityId);
        persona.nombre = nombre;
        persona.correo = correo;
        persona.direccion = direccion;
        persona.telefono = telefono;
        persona.documento = documento;
        return persona;
    }

    public String name() {
        return nombre.value();
    }

    public String telefono() {
        return telefono.value();
    }

    public String correo() {
        return correo.value();
    }

    public String direccion() {
        return direccion.value();
    }

    public String documento() {
        return documento.value();
    }

    public void updateNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public void updateTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void updateCorreo(Correo correo) {
        this.correo = correo;
    }

    public void updateDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void updateDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        if (!super.equals(o)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(telefono, persona.telefono) && Objects.equals(correo, persona.correo) && Objects.equals(direccion, persona.direccion) && Objects.equals(documento, persona.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, telefono, correo, direccion, documento);
    }
}
