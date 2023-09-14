package Singleton;

public class Constante {
    private static Constante instancia;
    private String nombreConstante;
    private double valorContante;
    private Constante (){
        nombreConstante = "N/A";
        valorContante =0 ;

    }
    public static Constante getInstance(){
        if (instancia == null) {
            instancia = new Constante();
            System.out.println("instancia creada por primer y unica vez");
        }
        return instancia;
    }
    @Override
    public String toString() {
        return "Constante [nombreConstante=" + nombreConstante + ", valorContante=" + valorContante + "]";
    }
    public void setDatos (String name, double value){
        this.nombreConstante = name;
        this.valorContante = value;
    }
}
