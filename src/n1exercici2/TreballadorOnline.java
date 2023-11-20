package n1exercici2;

public class TreballadorOnline extends Treballador {
    final static float internet = 55.5F;
    public TreballadorOnline(String nom, String cognom, float preu_hora) {
        super(nom, cognom, preu_hora);
    }

    @Override
    public float calcularSou(float horas) {
        return super.calcularSou(horas) + internet;
    }

    @Deprecated
    public float souAmbBono(float horas, float bono){
        return calcularSou(horas) + bono;
    }
}
