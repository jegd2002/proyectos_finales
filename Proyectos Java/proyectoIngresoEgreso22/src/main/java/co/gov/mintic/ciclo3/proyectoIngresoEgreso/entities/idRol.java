package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities;

import javax.persistence.*;


@Entity
@Table(name = "roles") //se crea la tabla en base de datos
public class idRol {
    @Id //Se declara la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private long idRol;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "estado")
    private boolean estado;

    public idRol(long idRol, String descripcion, boolean estado) {
        this.setIdRol(idRol);
        this.setDescripcion(descripcion);
        this.setEstado(estado);
    }

    public idRol() {
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idRol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
