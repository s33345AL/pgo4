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
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setKlient(Klient klient){
        this.klient = klient;
    }
    public Klient getKlient(){
        return klient;
    }
    public void setProdukty(Produkt[] produkty){
        this.produkty = produkty;
    }
    public Produkt[] getProdukty(){
        return produkty;
    }
    public void setIlosci(int[] ilosci){
        this.ilosci = ilosci;
    }
    public int[] getIlosci(){
        return ilosci;
    }
    public void setDataZamowienia(String dataZamowienia){
        this.dataZamowienia = dataZamowienia;
    }
    public String getDataZamowienia(){
        return dataZamowienia;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
