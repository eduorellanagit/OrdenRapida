package negocio.domain.repository;

import negocio.domain.entity.Negocio;

public interface NegocioRepository {

    void createNegocio (Negocio negocio);
    void deleteNegocio (Negocio negocio);
    void updateNegocio (Negocio negocio);

}
