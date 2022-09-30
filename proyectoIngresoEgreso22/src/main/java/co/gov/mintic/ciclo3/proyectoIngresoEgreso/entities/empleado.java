package co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado") //se crea la tabla en base de datos@Entity
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private long idEmpleado;

    @Column(name = "nombres_empleado")
    private String nombreEmpleado;
    @Column(name = "correo")
    private String correo;
    @Column(name = "empresa_perteneciente")
    private String empresaPerteneciente;
    @Column(name = "id_Login_empleado")
    private long idLogeo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rol_id_rol")
    private idRol rol;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id_empresa")
    private empresa empresa;


    public empleado(long idEmpleado, String nombreEmpleado, String correo, String empresaPerteneciente, long idLogeo, idRol rol, co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empresa empresa) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.idLogeo = idLogeo;
        this.rol = rol;
        this.empresa = empresa;
    }

    public empleado() {
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPerteneciente() {
        return empresaPerteneciente;
    }

    public void setEmpresaPerteneciente(String empresaPerteneciente) {
        this.empresaPerteneciente = empresaPerteneciente;
    }

    public long getIdLogeo() {
        return idLogeo;
    }

    public void setIdLogeo(long idLogeo) {
        this.idLogeo = idLogeo;
    }

    public idRol getRol() {
        return rol;
    }

    public void setRol(idRol rol) {
        this.rol = rol;
    }

    public co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaPerteneciente='" + empresaPerteneciente + '\'' +
                ", idLogeo=" + idLogeo +
                ", rol=" + rol +
                ", empresa=" + empresa +
                '}';
    }

    //    public void setNombreEmpleado() {
//        Scanner empleado = new Scanner(System.in);
//        String nombreEmpleado;
//        System.out.println("ingrese nombre empleado: ");
//        nombreEmpleado = empleado.nextLine();
//        this.nombreEmpleado = nombreEmpleado;
//    }
//
//    public void setCorreo() {
//        Scanner correo = new Scanner(System.in);
//        String correoEmpleado;
//        System.out.println("ingrese correo empleado: ");
//        correoEmpleado = correo.nextLine();
//        this.correo = correoEmpleado;
//    }
//
//    public void setEmpresaPerteneciente() {
//        Scanner empresaPerma = new Scanner(System.in);
//        String nombreEmpresa;
//        System.out.println("ingrese nombre empresa a la que pertenece el empleado: ");
//        nombreEmpresa = empresaPerma.nextLine();
//        this.empresaPerteneciente = nombreEmpresa;
//    }
//
//    public void setIdEmpleado() {
//        Scanner idEmple = new Scanner(System.in);
//        long numIdEmpleado;
//        System.out.println("ingrese id correspondiente del empleado: ");
//        numIdEmpleado = idEmple.nextLong();
//        this.idEmpleado = numIdEmpleado;
//    }
}
