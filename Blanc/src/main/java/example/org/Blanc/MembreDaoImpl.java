package example.org.Blanc;

import java.util.ArrayList;
import java.util.List;

public class MembreDaoImpl implements MembreDao {
    private List<Membre> membres = new ArrayList<>();

    @Override
    public void ajouterMembre(Membre membre) {
        membres.add(membre);
    }

    @Override
    public Membre chercherMembreParId(String id) {
        return membres.stream()
                      .filter(membre -> membre.getIdentifiant().equals(id))
                      .findFirst()
                      .orElse(null);
    }

    @Override
    public List<Membre> listerTousLesMembres() {
        return membres;
    }
}
