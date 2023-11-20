package n1exercici2;

public class TreballadorPresencial extends Treballador {
    static float benzina;
    public TreballadorPresencial(String nom, String cognom, float preu_hora, float benzina) {
        super(nom, cognom, preu_hora);
        TreballadorPresencial.benzina = benzina;
    }

    @Override
    public float calcularSou(float horas) {
        return super.calcularSou(horas) + TreballadorPresencial.benzina;
    }

    @Deprecated
    float souSenseBenzina(float horas){
        return calcularSou(horas) - TreballadorPresencial.benzina;
    }
}
