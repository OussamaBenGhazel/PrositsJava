public class Employe {
    private String id;
    private String nom;

    public Employe(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id.equals(employe.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
