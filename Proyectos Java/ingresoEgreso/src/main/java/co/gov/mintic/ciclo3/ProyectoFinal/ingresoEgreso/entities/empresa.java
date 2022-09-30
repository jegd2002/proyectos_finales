package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "empresa") //se crea la tabla en base de datos
public class empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private long idAdministrador;


    @Column(name = "nombre_empresa")
    private String nombreEmpresa;


    @Column(name = "direccion")
    private String direccion;


    @Column(name = "telefono")
    private String telefono;


    @Column(name = "nit")
    private String NIT;


    @Column(name = "login_empresa")
    private String idLogeoEmpresa;


    @Column(name = "password")
    private String password;


    public empresa(long idAdministrador, String nombreEmpresa, String direccion, String telefono, String NIT, String idLogeoEmpresa, String password) {
        this.idAdministrador = idAdministrador;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
        this.idLogeoEmpresa = idLogeoEmpresa;
        this.password = password;
    }

    public empresa() {

    }

    public long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getIdLogeoEmpresa() {
        return idLogeoEmpresa;
    }

    public void setIdLogeoEmpresa(String idLogeoEmpresa) {
        this.idLogeoEmpresa = idLogeoEmpresa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "empresa{" +
                "idAdministrador=" + idAdministrador +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", NIT='" + NIT + '\'' +
                ", idLogeoEmpresa=" + idLogeoEmpresa +
                ", password='" + password + '\'' +
                '}';
    }

    //    public void setNombreEmpresa() {
//        Scanner name = new Scanner(System.in);
//        String name1;
//        System.out.println("ingrese nombre empresa: ");
//        name1 = name.nextLine();
//        this.nombreEmpresa = name1;
//    }
//    public void setDireccion() {
//        Scanner direccion = new Scanner(System.in);
//        String direccionEmpresa;
//        System.out.println("ingrese direccion de la empresa: ");
//        direccionEmpresa = direccion.nextLine();
//        this.direccion = direccionEmpresa;
//    }
//    public void setTelefono() {
//        Scanner telefono = new Scanner(System.in);
//        String numTel = "";
//        System.out.println("ingrese telefono de la empresa: ");
//        numTel = telefono.nextLine();
//        this.telefono = numTel;
//    }
//
//    public void setNIT() {
//        Scanner nit = new Scanner(System.in);
//        String numNit;
//        System.out.println("ingrese el Nit de la empresa: ");
//        numNit = nit.nextLine();
//        this.NIT = numNit;
//    }
//
//    public void setIdAdministrador() {
//        Scanner idAdmin = new Scanner(System.in);
//        long numId;
//        System.out.println("ingrese el ID del Administrador: ");
//        numId = idAdmin.nextLong();
//        this.idAdministrador = numId;
//    }

}
