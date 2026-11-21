package negocio.domain.entity;

import negocio.domain.enums.Estado;
import negocio.domain.enums.Rol;

import java.math.BigDecimal;

public class Ticket {

    int id;
    int negocioId;
    int numero;
    int numeroMesa;

    int meseroId;
    String meseroAlias;

    int cocineroId;
    String cocineroAlias;

    Estado estado;
    BigDecimal total;

    Rol canceladoPor;
    String canceladoMotivo;

    public Ticket(
            int id, int negocioId, int numero, int numeroMesa, int meseroId, String meseroAlias,
            int cocineroId, String cocineroAlias, Estado estado, BigDecimal total,
            Rol canceladoPor, String canceladoMotivo
    ) {

        this.id = id;
        this.negocioId = negocioId;
        this.numero = numero;
        this.numeroMesa = numeroMesa;
        this.meseroId = meseroId;
        this.meseroAlias = meseroAlias;
        this.cocineroId = cocineroId;
        this.cocineroAlias = cocineroAlias;
        this.estado = estado;
        this.total = total;
        this.canceladoPor = canceladoPor;
        this.canceladoMotivo = canceladoMotivo;

    }


    // GETTERS

    public String getCanceladoMotivo() {
        return canceladoMotivo;
    }

    public Rol getCanceladoPor() {
        return canceladoPor;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getCocineroAlias() {
        return cocineroAlias;
    }

    public int getCocineroId() {
        return cocineroId;
    }

    public String getMeseroAlias() {
        return meseroAlias;
    }

    public int getMeseroId() {
        return meseroId;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getNumero() {
        return numero;
    }

    public int getNegocioId() {
        return negocioId;
    }

    public int getId() {
        return id;
    }


    // SETTERS

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setCanceladoPor(Rol canceladoPor) {
        this.canceladoPor = canceladoPor;
    }

    public void setCanceladoMotivo(String canceladoMotivo) {
        this.canceladoMotivo = canceladoMotivo;
    }

}
