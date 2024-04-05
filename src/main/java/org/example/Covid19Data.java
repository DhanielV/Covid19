package org.example;
public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekraeftedeTilfaeldeIAlt;
    private int doede;
    private int indlagtePaaIntensivAfdeling;
    private int indlagte;
    private String dato;


    public Covid19Data(String region,  String aldersgruppe, int bekraeftedeTilfaeldeIAlt, int doede, int indlagtePaaIntensivAfdeling, int indlagte, String dato){
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekraeftedeTilfaeldeIAlt = bekraeftedeTilfaeldeIAlt;
        this.indlagtePaaIntensivAfdeling = indlagtePaaIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;

    }
    @Override
    public String toString(){
        return "Covid19Data{" +
                "region=" + region +
                "aldersgruppe=" + aldersgruppe +
                "bekræftede tilfælde i alt" + bekraeftedeTilfaeldeIAlt +
                "doede=" + doede +
                "indlagte på intensiv afdeling=" + indlagtePaaIntensivAfdeling +
                "indlagte=" + indlagte +
                "dato=" + dato +
                "}";


    }


}
