public class Resultado {

    String base ;
    String target ;
    String rate ;
    String resultadoconversion ;

    public Resultado(ReqFilter reqfilter){
        this.base = reqfilter.base_code();
        this.target = reqfilter.target_code();
        this.rate = reqfilter.conversion_rate();
        this.resultadoconversion = reqfilter.conversion_result();
    }

    public String getBase() {
        return base;
    }

    public String getTarget() {
        return target;
    }

    public String getRate() {
        return rate;
    }

    public String getResultadoconversion() {
        return resultadoconversion;
    }


}
