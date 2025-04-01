import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private ArrayList<Klient> klienci =  new ArrayList<>();
    private ArrayList<Zamowienie> zamowienie = new ArrayList<>();
    private int liczbaProduktow, liczbaKlientow, liczbaZamowien;

    public void dodajProdukt(ArrayList<ArrayList<Produkt>> produkty) {
        produkty.addAll(produkty);
    }
    public void dodajKlienta(ArrayList<Klient> klienci) {
        klienci.addAll(klienci);
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
    Zamowienie nowezamowienie = new Zamowienie();
    zamowienie.add(nowezamowienie);
        return nowezamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowystatus) {

    }

    public void wyswietlProduktyWKategorii(String kategoria){
        System.out.println("Kategoria: " + produkty.get(0).getKategoria());
        System.out.println("Nazwa: " + produkty.get(0).getNazwa());
    }
}
