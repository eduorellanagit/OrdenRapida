package negocio.domain.entity;

import java.time.Instant;

public class Negocio {

    int id;
    String nombre;
    boolean tieneMesero;
    boolean tieneCocinero;
    Instant creadoEn;

    public Negocio(int id, String nombre, boolean tieneMesero,
                       boolean tieneCocinero, Instant creadoEn) {
        this.id = id;
        this.nombre = nombre;
        this.tieneMesero = tieneMesero;
        this.tieneCocinero = tieneCocinero;
        this.creadoEn = creadoEn;

    }


    // GETTERS

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneMesero() {
        return tieneMesero;
    }

    public boolean isTieneCocinero() {
        return tieneCocinero;
    }


    // SETTERS

    private void cambiarMesero(boolean tieneMesero) {
        this.tieneMesero = tieneMesero;
    }

    private void cambiarCocinero(boolean tieneCocinero) {
        this.tieneCocinero = tieneCocinero;
    }

}
