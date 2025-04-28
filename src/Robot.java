public class Robot extends TestJuego{
    Bateria bateria = new Bateria(1000);
    private boolean dormido;

    private void avanzar (int pasos){
        if (pasos==100){
            Bateria avanzar = new Bateria(bateria.setCarga(-10).getCarga());
        }
    }
    private void retroceder (int pasos){
        if (pasos==100){
            Bateria retroceder = new Bateria(bateria.setCarga(-10).getCarga());
        }
    }
    private void dormir(){
        dormido=true;
    }
    private void despertar(){
        dormido=false;
    }
    private void recargar(){
        Bateria recargar = new Bateria(bateria.setCarga(1000).getCarga());
    }
        private void bateriaLlena(){
        for (Bateria bateriaLlena : new Bateria[1000]){
            System.out.println("La bateria está al 100%");
        }
    }
    private void bateriaVacia(){
        for (Bateria bateriaVacia : new Bateria[0]){
            System.out.println("La bateria está al 0%");
        }
    }
    private void energiaActual(){
        for (Bateria cantidad : new Bateria[bateria.getCarga()])
            System.out.println("La cantidad de la bateria es: " + bateria.getCarga());
    }
    private void estaDormido(){
        if (dormido){
            System.out.println("El robot está depierto");
        }
        if (!dormido){
            System.out.println("El robot está dormido");
        }
    }
}
