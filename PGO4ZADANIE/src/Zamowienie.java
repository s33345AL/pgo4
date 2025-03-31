import java.util.List;

public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public Zamowienie(){
        this.id = id;
        this.klient = new Klient();
        this.produkty = new Produkt[10];
        this.ilosci = new int[10];
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return this.id;
    }
    void setKlient(Klient klient){
        this.klient = klient;
    }
    Klient getKlient(){
        return this.klient;
    }
    void setProdukty(Produkt[] produkty){
        this.produkty = produkty;
    }
    Produkt[] getProdukty(){
        return this.produkty;
    }
    void setIlosci(int[] ilosci){
        this.ilosci = ilosci;
    }
    int[] getIlosci(){
        return this.ilosci;
    }
    public void setDataZamowienia(String dataZamowienia){
        this.dataZamowienia = dataZamowienia;
    }
    public String getDataZamowienia(){
        return this.dataZamowienia;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }

    public double obliczWartoscZamowienia() {
        double cena = 20.0;
        return cena;
    }

    public void zastosujZnizke() {
        double cena2 = 0.0;
        if(klient.isCzyStaly()){
            cena2 = obliczWartoscZamowienia() - (0.1 * obliczWartoscZamowienia());
        }else{
            cena2 = obliczWartoscZamowienia();
        }
    }
}
