import java.util.Comparator;

public class Employe implements Comparable<Employe>, Comparator<Employe> {
        private int identifiant;
        private String nom;
        private String prenom;
        private String nomDepartement;
        private int grade;

        public Employe(){

        }

        public Employe(int identifiant, String nom, String prenom, String nomDepartement, int grade) {
            this.identifiant = identifiant;
            this.nom = nom;
            this.prenom = prenom;
            this.nomDepartement = nomDepartement;
            this.grade = grade;
        }

        public String getNomDepartement() {
            return nomDepartement;
        }

        public int getIdentifiant() {
            return identifiant;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getNom() {
            return nom;
        }

        public int getGrade() {
            return grade;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public void setIdentifiant(int identifiant) {
            this.identifiant = identifiant;
        }

        public void setNomDepartement(String nomDepartement) {
            this.nomDepartement = nomDepartement;
        }

        @Override
        public int compare(Employe o1, Employe o2) {
            return (o1.getNom().compareTo(o2.getNom()));
        }

        public boolean equals(Object obj){
            if(obj instanceof Employe e){
                return (this.identifiant == e.identifiant && this.nom.equals(e.getNom()));
            }
            return false;
        }

        @Override
        public String toString() {
            return "Employe{" +
                    "identifiant=" + identifiant +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", nomDepartement='" + nomDepartement + '\'' +
                    ", grade=" + grade +
                    '}';
        }


        @Override
        public int compareTo(Employe o) {
            return (this.identifiant-o.identifiant);
        }
    }


