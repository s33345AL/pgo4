public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    int getId(){
        return this.id;
    }
    void setId(int id){
        this.id = id;
    }

    String getNazwa(){
        return this.nazwa;
    }
    void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    String getKategoria(){
        return this.kategoria;
    }
    void setKategoria(String kategoria){
        this.kategoria = kategoria;
    }
    double getCena(){
        return this.cena;
    }
    void setCena(double cena){
        this.cena = cena;
    }
    int getIloscWMagazynie(){
        return this.iloscWMagazynie;
    }
    void setIloscWMagazynie(int iloscWMagazynie){
        this.iloscWMagazynie = iloscWMagazynie;
    }
}
