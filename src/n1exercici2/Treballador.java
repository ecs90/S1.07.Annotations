package n1exercici2;

public class Treballador {
    private String nom;
    private String cognom;
    private float preu_hora;

    public Treballador(String nom, String cognom, float preu_hora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preu_hora = preu_hora;
    }

    float calcularSou(float horas){
        return this.preu_hora*horas;
    }
}
