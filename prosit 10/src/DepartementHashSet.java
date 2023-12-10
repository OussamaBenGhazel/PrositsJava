import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> dep = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        dep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d : dep){
            if(d.getNom_departement().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return dep.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        dep.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = dep.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(dep);
    }
}
