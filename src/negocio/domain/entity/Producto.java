package negocio.domain.entity;

import negocio.domain.enums.Categoria;

import java.math.BigDecimal;
import java.time.Instant;

public class Producto {

    int id;
    int negocioId;
    String titulo;
    String descripcion;
    BigDecimal precio;
    Categoria categoria;
    boolean agotado;
    Instant creadoEn;

    public Producto(
            int id, int negocioId, String titulo, String descripcion, BigDecimal precio,
            Categoria categoria, boolean agotado, Instant creadoEn
    ) {

        this.id = id;
        this.negocioId = negocioId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.agotado = agotado;
        this.creadoEn = creadoEn;

    }


    // GETTERS

    public int getId() {
        return id;
    }

    public int getNegocioId() {
        return negocioId;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean isAgotado() {
        return agotado;
    }


    // SETTERS

    private void cambiarProducto(
            String  titulo,
            String descripcion,
            BigDecimal precio,
            Categoria categoria
    ) {

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;

    }

    private void cambiarProductoEstado(boolean agotado) {
        this.agotado = agotado;
    }

}
