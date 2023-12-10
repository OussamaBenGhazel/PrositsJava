import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nom_departement;
    private int nbr_des_employee;

    public Departement() {
    }

    public Departement(int id, String nom_departement, int nbr_des_employee) {
        this.id = id;
        this.nom_departement = nom_departement;
        this.nbr_des_employee = nbr_des_employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNbr_des_employee() {
        return nbr_des_employee;
    }

    public void setNbr_des_employee(int nbr_des_employee) {
        this.nbr_des_employee = nbr_des_employee;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj instanceof Departement d){
            return (this.id==d.getId() && this.nom_departement.equalsIgnoreCase(d.getNom_departement()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom_departement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_departement='" + nom_departement + '\'' +
                ", nbr_des_employee=" + nbr_des_employee +
                '}';
    }

    public int compareTo(Departement o) {
        return (this.id - o.id);
    }

}
