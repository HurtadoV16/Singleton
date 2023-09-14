import Singleton.Constante;

public class App {
    public static void main(String[] args) throws Exception {
        Constante constante = Constante.getInstance();
        System.out.println(constante);
        constante.setDatos("IVA", 0.16);
        System.out.println(constante);
        Constante constante2 = Constante.getInstance();
        System.out.println(constante2);
    }
}
