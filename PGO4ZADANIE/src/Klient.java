public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public Klient() {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = czyStaly;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getImie() {
        return imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
    public boolean getCzyStaly() {
        return czyStaly;
    }
}
