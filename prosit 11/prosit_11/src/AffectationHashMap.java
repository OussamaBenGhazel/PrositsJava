import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Instruction 2
    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        affectations.put(employe, departement);
    }

    // Instruction 3
    public void afficherEmployesEtDepartements() {
        System.out.println("Affectations actuelles :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé " + entry.getKey().getNom() + " -> Département " + entry.getValue().getNom());
        }
    }

    // Instruction 4
    public void supprimerEmploye(Employe employe) {
        affectations.remove(employe);
    }

    // Instruction 5
    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        affectations.remove(employe, departement);
    }

    // Instruction 6
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe employe : affectations.keySet()) {
            System.out.println("Employé " + employe.getNom());
        }
    }

    // Instruction 7
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement departement : affectations.values()) {
            System.out.println("Département " + departement.getNom());
        }
    }

    // Instruction 8
    public boolean rechercherEmploye(Employe employe) {
        return affectations.containsKey(employe);
    }

    // Instruction 9
    public boolean rechercherDepartement(Departement departement) {
        return affectations.containsValue(departement);
    }

    // Instruction 10
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>(new EmployeComparator());
        treeMap.putAll(affectations);
        return treeMap;
    }

    // Classe interne pour trier les employés par leur identifiant
    private static class EmployeComparator implements java.util.Comparator<Employe> {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getId().compareTo(e2.getId());
        }
    }

    public static void main(String[] args) {
        AffectationHashMap gestionAffectations = new AffectationHashMap();

        Employe employe1 = new Employe("001", "John Doe");
        Employe employe2 = new Employe("002", "Jane Smith");

        Departement departementRH = new Departement("Ressources Humaines");
        Departement departementIT = new Departement("Informatique");

        // Instruction 2
        gestionAffectations.ajouterEmployeDepartement(employe1, departementRH);
        gestionAffectations.ajouterEmployeDepartement(employe2, departementIT);

        // Instruction 3
        gestionAffectations.afficherEmployesEtDepartements();

        // Tentative d'ajouter le même employé dans deux départements différents
        gestionAffectations.ajouterEmployeDepartement(employe1, departementIT);

        // Instruction 3
        gestionAffectations.afficherEmployesEtDepartements();

        // Instruction 4
        gestionAffectations.supprimerEmploye(employe1);

        // Instruction 5
        gestionAffectations.supprimerEmployeEtDepartement(employe2, departementIT);

        // Instruction 6
        gestionAffectations.afficherEmployes();

        // Instruction 7
        gestionAffectations.afficherDepartements();

        // Instruction 8
        System.out.println("Rechercher employé 1 : " + gestionAffectations.rechercherEmploye(employe1));

        // Instruction 9
        System.out.println("Rechercher département RH : " + gestionAffectations.rechercherDepartement(departementRH));

        // Instruction 10
        System.out.println("Affectations triées :");
        for (Map.Entry<Employe, Departement> entry : gestionAffectations.trierMap().entrySet()) {
            System.out.println("Employé " + entry.getKey().getNom() + " -> Département " + entry.getValue().getNom());
        }
    }
}
