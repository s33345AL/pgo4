import java.util.ArrayList;
import java.util.List;

public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    int getId(){
        return this.id;
    }
    void setId(int id){
        this.id = id;
    }
    String getImie(){
        return this.imie;
    }
    void setImie(String imie){
        this.imie = imie;
    }
    String getNazwisko(){
        return this.nazwisko;
    }
    void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    String getEmail(){
        return this.email;
    }
    void setEmail(String email){
        this.email = email;
    }
    boolean isCzyStaly(){
        return this.czyStaly;
    }
    void setCzyStaly(boolean czyStaly){
        this.czyStaly = czyStaly;
    }

    public void wyswietlInformacje(){
        System.out.println(id + " " + imie + " " + nazwisko + " " + email + " " + czyStaly);
    }

}
