package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "empleado") //se crea la tabla en base de datos@Entity
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private long idEmpleado;


    @Column(name = "nombres_empleado")
    private String nombreEmpleado;


    @Column(name = "correo", unique = true)
    private String correo;

    @Column(name = "empresa_perteneciente")
    private String empresaPerteneciente;


    @Column(name = "username",unique = true)
    private String username;


    @Column(name = "password")
    private String password;

    @ManyToOne()
    @JoinColumn(name = "rol_id_rol")
    private idRol rol;

    @ManyToOne()
    @JoinColumn(name = "empresa_id_empresa")
    private empresa empresa;


    public empleado(long idEmpleado, String nombreEmpleado, String correo, String empresaPerteneciente, String username, String password, idRol rol, co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa empresa) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresaPerteneciente = empresaPerteneciente;
        this.username = username;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public idRol getRol() {
        return rol;
    }

    public void setRol(idRol rol) {
        this.rol = rol;
    }

    public co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa empresa) {
        this.empresa = empresa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaPerteneciente='" + empresaPerteneciente + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
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
