package negocio.domain.entity;

import java.math.BigDecimal;

public class TicketItem {

    int id;
    int ticketId;
    int negocioId;
    String nombre;
    BigDecimal precioUnitario;
    int cantidad;

    public TicketItem(
            int id, int ticketId, int negocioId, String nombre,
            BigDecimal precioUnitario, int cantidad
    ) {

        this.id = id;
        this.ticketId = ticketId;
        this.negocioId = negocioId;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;

    }

}
