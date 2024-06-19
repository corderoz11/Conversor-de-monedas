public class Logica {
    int valor;
    String base;
    String target;
    public void Logica(int valor){
        this.valor = valor;
        switch(valor){
            case 1 :
                base = "USD";
                target = "ARS";
                break;
            case 2 :
                base = "ARS";
                target = "USD";
                break;
            case 3 :
                base = "USD";
                target = "BRL";
                break;
            case 4 :
                base = "BRL";
                target = "USD";
                break;
            case 5 :
                base = "USD";
                target = "COP";
                break;
            case 6 :
                base = "COP";
                target = "USD";
                break;
            case 7 :
                base = "USD";
                target = "ARS";
                break;
        }

    }
    public String Base () {
        return base;

    }
    public String Target () {
        return target;

    }

}
