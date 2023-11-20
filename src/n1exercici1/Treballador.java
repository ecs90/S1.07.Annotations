package n1exercici1;

public class Treballador {
    String nom;
    String cognom;
    float preu_hora;

    public Treballador(String nom, String cognom, float preu_hora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preu_hora = preu_hora;
    }

    public float calcularSou(float horas){
        return this.preu_hora*horas;
    }
}
