public class LogicaSalida {


    boolean salir = true;

    public void LogicaSalida(int valor){
        switch(valor){
            case 1 :
                this.salir = true;
                break;
            case 7 :
                this.salir = false;
                break;

        }

    }
    public boolean isSalir() {
        return salir;
    }
}
