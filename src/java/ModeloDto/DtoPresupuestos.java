/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ULISES.VIEYRA
 */
public class DtoPresupuestos implements Serializable  {

    private int IdPresupuesto;
    private int IdPaciente;
    private int IdTratamiento;
    private int IdTipoDescuento;
    private Float Precio;
    private Date FechaDeAlta;
    private int IdDoctor;
    private int IdUsuario;

    public DtoPresupuestos() {
    }

    public DtoPresupuestos(int IdPresupuesto, int IdPaciente, int IdTratamiento, int IdTipoDescuento, Float Precio, Date FechaDeAlta,
            int IdDoctor, int IdUsuario) {
        this.IdPresupuesto = IdPresupuesto;
        this.IdPaciente = IdPaciente;
        this.IdTratamiento = IdTratamiento;
        this.IdTipoDescuento = IdTipoDescuento;
        this.Precio = Precio;
        this.FechaDeAlta = FechaDeAlta;
        this.IdDoctor = IdDoctor;
        this.IdUsuario = IdUsuario;
    }

    /**
     * @return the IdPresupuesto
     */
    public int getIdPresupuesto() {
        return IdPresupuesto;
    }

    /**
     * @param IdPresupuesto the IdPresupuesto to set
     */
    public void setIdPresupuesto(int IdPresupuesto) {
        this.IdPresupuesto = IdPresupuesto;
    }

    /**
     * @return the IdPaciente
     */
    public int getIdPaciente() {
        return IdPaciente;
    }

    /**
     * @param IdPaciente the IdPaciente to set
     */
    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    /**
     * @return the IdTratamiento
     */
    public int getIdTratamiento() {
        return IdTratamiento;
    }

    /**
     * @param IdTratamiento the IdTratamiento to set
     */
    public void setIdTratamiento(int IdTratamiento) {
        this.IdTratamiento = IdTratamiento;
    }

    /**
     * @return the IdTipoDescuento
     */
    public int getIdTipoDescuento() {
        return IdTipoDescuento;
    }

    /**
     * @param IdTipoDescuento the IdTipoDescuento to set
     */
    public void setIdTipoDescuento(int IdTipoDescuento) {
        this.IdTipoDescuento = IdTipoDescuento;
    }

    /**
     * @return the Precio
     */
    public Float getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the FechaDeAlta
     */
    public Date getFechaDeAlta() {
        return FechaDeAlta;
    }

    /**
     * @param FechaDeAlta the FechaDeAlta to set
     */
    public void setFechaDeAlta(Date FechaDeAlta) {
        this.FechaDeAlta = FechaDeAlta;
    }

    /**
     * @return the IdDoctor
     */
    public int getIdDoctor() {
        return IdDoctor;
    }

    /**
     * @param IdDoctor the IdDoctor to set
     */
    public void setIdDoctor(int IdDoctor) {
        this.IdDoctor = IdDoctor;
    }

    /**
     * @return the IdUsuario
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     * @param IdUsuario the IdUsuario to set
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
}
