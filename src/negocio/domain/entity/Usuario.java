package negocio.domain.entity;

import negocio.domain.enums.Rol;

import java.time.Instant;

public class Usuario {

    int id;
    int negocioId;
    String alias;
    String claveHash;
    Rol rol;
    boolean activo;
    int creadoPorId;
    Instant creadoEn;

    public Usuario(
            int id, int negocioId, String alias, String claveHash, Rol rol, boolean activo,
            int creadoPorId, Instant creadoEn
    ){
        this.id = id;
        this.negocioId = negocioId;
        this.alias = alias;
        this.claveHash = claveHash;
        this.rol = rol;
        this.activo = activo;
        this.creadoPorId = creadoPorId;
        this.creadoEn = creadoEn;
    }


    // GETTERS

    public int getId() {
        return id;
    }

    public int getNegocioId() {
        return negocioId;
    }

    public String getAlias() {
        return alias;
    }

    public String getClaveHash() {
        return claveHash;
    }

    public Rol getRol() {
        return rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getCreadoPorId() {
        return creadoPorId;
    }


    // SETTERS

    private void cambiarClave (String clave) {
        this.claveHash = clave;
    }

    private void cambiarActivo (boolean activo) {
        this.activo = activo;
    }

}
