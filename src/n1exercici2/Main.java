package n1exercici2;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args){
        Treballador treballador = new Treballador("Juan", "Perez", 15.3F);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Ana", "Menna", 12.5F, 150);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Estaban", "Quito", 15);

        System.out.println("Sueldos:");
        System.out.println("-Trabajador: " + treballador.calcularSou(160));
        System.out.println("-Trabajador presencial: " + treballadorPresencial.calcularSou(160));
        System.out.println("-Trabajador online: " + treballadorOnline.calcularSou(160));

        System.out.println(" ");

        System.out.println("Sueldos desactualizados:");
        System.out.println("-Trabajador presencial: " + treballadorPresencial.souSenseBenzina(160));
        System.out.println("-Trabajador online: " + treballadorOnline.souAmbBono(160, 100));
    }
}
