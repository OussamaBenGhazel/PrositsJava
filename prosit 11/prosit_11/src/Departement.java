public class Departement {
    private String nom;

    public Departement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement departement = (Departement) obj;
        return nom.equals(departement.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
