package negocio.domain.repositoryImp;

import negocio.domain.entity.Negocio;
import negocio.domain.repository.NegocioRepository;

import java.util.ArrayList;
import java.util.List;

public class NegocioRepositoryImp implements NegocioRepository {

    List<Negocio> listaNegocios = new ArrayList<Negocio>();

    @Override
    public void createNegocio(Negocio negocio) {
        listaNegocios.add(negocio);
    }

    @Override
    public void deleteNegocio(Negocio negocio) {
        listaNegocios.remove(negocio);
    }

    @Override
    public void updateNegocio(Negocio negocio) {

        if (listaNegocios.contains(negocio)) {

            listaNegocios.remove(negocio);
            listaNegocios.add(negocio);

        }

    }
}
