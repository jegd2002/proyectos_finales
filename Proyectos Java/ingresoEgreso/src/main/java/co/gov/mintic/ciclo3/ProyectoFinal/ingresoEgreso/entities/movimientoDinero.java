package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities;

import javax.persistence.*;

@Entity
@Table(name = "movimiento_dinero") //se crea la tabla en base de datos@Entity
public class movimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento")
    private long idmovimiento;

    @Column(name = "monto_movimiento", nullable = false)
    private float montoMovimiento;

    @Column(name = "monto_positivo")
    private float montoPositivo;

    @Column(name = "monto_negativo")
    private float montoNegativo;

    @Column(name = "username_empleado_movimiento",nullable = false)
    private String idEmpleadoMovimiento;

    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private empleado empleado;

    @ManyToOne
    @JoinColumn(name = "empresa_empleado")
    private empresa empresa;

    public movimientoDinero(long idmovimiento, float montoMovimiento, float montoPositivo, float montoNegativo, String idEmpleadoMovimiento, co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado empleado, co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa empresa) {
        this.idmovimiento = idmovimiento;
        this.montoMovimiento = montoMovimiento;
        this.montoPositivo = montoPositivo;
        this.montoNegativo = montoNegativo;
        this.idEmpleadoMovimiento = idEmpleadoMovimiento;
        this.empleado = empleado;
        this.empresa = empresa;
    }

    public movimientoDinero() {

    }

    public long getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(long idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public float getMontoPositivo() {
        return montoPositivo;
    }

    public void setMontoPositivo(float montoPositivo) {
        this.montoPositivo = montoPositivo;
    }

    public float getMontoNegativo() {
        return montoNegativo;
    }

    public void setMontoNegativo(float montoNegativo) {
        this.montoNegativo = montoNegativo;
    }

    public String getIdEmpleadoMovimiento() {
        return idEmpleadoMovimiento;
    }

    public void setIdEmpleadoMovimiento(String idEmpleadoMovimiento) {
        this.idEmpleadoMovimiento = idEmpleadoMovimiento;
    }

    public co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado empleado) {
        this.empleado = empleado;
    }

    public co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "movimientoDinero{" +
                "idmovimiento=" + idmovimiento +
                ", montoMovimiento=" + montoMovimiento +
                ", montoPositivo=" + montoPositivo +
                ", montoNegativo=" + montoNegativo +
                ", idEmpleadoMovimiento=" + idEmpleadoMovimiento +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                '}';
    }

    //    public void setMontoMovimiento() {
//        Scanner montoDinero = new Scanner(System.in);
//        float cantidadCapital;
//        System.out.println("ingrese el monto del movimiento: ");
//        cantidadCapital = montoDinero.nextFloat();
//        this.montoMovimiento = cantidadCapital;
//    }
//
//    public void setMontoPositivo() {
//        Scanner montoPositivo = new Scanner(System.in);
//        float cantidadPositiva;
//        System.out.println("ingrese el monto positivo del movimiento: ");
//        cantidadPositiva = montoPositivo.nextFloat();
//        this.montoPositivo = cantidadPositiva;
//    }
//
//    public void setMontoNegativo() {
//        Scanner montoNegativo = new Scanner(System.in);
//        float cantidadNegativa;
//        System.out.println("ingrese el monto negativo del movimiento: ");
//        cantidadNegativa = montoNegativo.nextFloat();
//        this.montoNegativo = cantidadNegativa;
//    }
//
//    public void setIdEmpleadoMovimiento() {
//        Scanner idEmpleado = new Scanner(System.in);
//        long numId;
//        System.out.println("ingrese el el id de la persona quien realiza el movimiento: ");
//        numId = idEmpleado.nextLong();
//        this.idEmpleadoMovimiento = numId;
//    }
}
