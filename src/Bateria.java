public class Bateria extends TestJuego{
    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }


    public int getCarga() {
        return carga;
    }

    public Bateria setCarga(int carga) {
        this.carga = carga;
        return this;
    }
}
