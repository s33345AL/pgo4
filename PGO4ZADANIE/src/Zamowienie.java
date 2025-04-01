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
    void setDataZamowienia(String dataZamowienia){
        this.dataZamowienia = dataZamowienia;
    }
    String getDataZamowienia(){
        return this.dataZamowienia;
    }
    void setStatus(String status){
        this.status = status;
    }
    String getStatus(){
        return status;
    }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for(int i = 0; i < produkty.length; i++ ){
            suma += produkty[i].getCena() * ilosci[i];
        }
        return suma;
    }

    public void zastosujZnizke() {
        double znizka = 0.0;
        if(klient.isCzyStaly()){
            znizka = obliczWartoscZamowienia() - (0.1 * obliczWartoscZamowienia());
        }
        System.out.println(znizka);
    }


    public void wyswietlSzczegoly(){
        System.out.println("Identyfikator: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        System.out.println("Data: " + dataZamowienia);
        System.out.println("Status: " + status);
        System.out.println("Produkty: ");
        for(int i = 0; i < produkty.length; i++ ){
            System.out.println(produkty[i].getNazwa() + " " + ilosci[i] + " " + produkty[i].getCena());
        }
        System.out.println("Wartość całego zamówienia: " + obliczWartoscZamowienia() + " zł");
    }
}
